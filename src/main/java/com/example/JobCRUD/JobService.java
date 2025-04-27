package com.example.JobCRUD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.JobCRUD.JobEntity;
import com.example.JobCRUD.JobRepository;

import java.util.List;
@Service
public class JobService {
	@Autowired
	private final JobRepository jobRepository;//dependency injection
	
	public JobService(JobRepository jobRepository) {
		this.jobRepository=jobRepository;
	}
	//fetching all jobs
	public List<JobEntity> getAllJobs(){
		return jobRepository.findAll();
	}
	//fetching an job by id
	public JobEntity getJobById(Long id) {
		return jobRepository.findById(id).orElse(null);
	}
	//save a new job
	public void saveJob(JobEntity job) {
		jobRepository.save(job);
	}
	//update an existing job
	public void updateJob(JobEntity job) {
		jobRepository.save(job);
	}
	//delete an job by id
	public void deleteJob(Long id) {
		jobRepository.deleteById(id);
	}


}
