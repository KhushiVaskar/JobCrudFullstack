package com.example.JobCRUD;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import com.example.JobCRUD.JobEntity;
import com.example.JobCRUD.JobService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/jobs")

public class JobController {
	@Autowired
	private final JobService jobService;
	
	public JobController(JobService jobService) {
		this.jobService=jobService;
	}
	//get all jobs
	@GetMapping
	public List<JobEntity> listJobs(){
		return jobService.getAllJobs();
	}
	
	//register a new job
	@PostMapping("/register")
	public JobEntity saveJob(@RequestBody JobEntity job) {
		jobService.saveJob(job);
		return job;
	}
	
	//get a specific job by id
	@GetMapping("/{id}")
	public JobEntity getJobById(@PathVariable("id")Long id) {
		JobEntity job = jobService.getJobById(id);
		if(job != null) {
			System.out.println("Job: "+job);
			return job;
		}
		throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee not found");
	}
	
	//update an job
	@PutMapping("/update/{id}")
	public JobEntity updateJob(@PathVariable("id") Long id,@RequestBody JobEntity job) {
		JobEntity existingJob = jobService.getJobById(id);
		if(existingJob != null) {
			existingJob.setJobTitle(job.getJobTitle());
			existingJob.setMinSalary(job.getMinSalary());
			existingJob.setMaxSalary(job.getMaxSalary());
			
			jobService.updateJob(existingJob);
			return existingJob;
		}
		return null;
	}
	
	//delete an job
	@DeleteMapping("/delete/{id}")
	public String deleteJob(@PathVariable("id") Long id) {
		jobService.deleteJob(id);
		return "Employee Deleted Successfully!";
	}
	

}
