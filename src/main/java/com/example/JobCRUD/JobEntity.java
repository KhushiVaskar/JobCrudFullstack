package com.example.JobCRUD;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "jobs")
public class JobEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "job_id")
	private Long jobId;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "job_title", nullable = false)
	private String jobTitle;
	
	@Column(name = "min_salary", nullable = false)
	private double minSalary;
	
	@Column(name = "max_salary", nullable = false )
	private double maxSalary;
	
	public JobEntity() {}
	
	public JobEntity(String jobTitle,double minSalary,double maxSalary,String name) {
		this.jobTitle=jobTitle;
		this.minSalary=minSalary;
		this.maxSalary=maxSalary;
		this.name=name;
	}

	public Long getJobId() {
		return jobId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}
	

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public double getMinSalary() {
		return minSalary;
	}

	public void setMinSalary(double minSalary) {
		this.minSalary = minSalary;
	}

	public double getMaxSalary() {
		return maxSalary;
	}

	public void setMaxSalary(double maxSalary) {
		this.maxSalary = maxSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "JobEntity [jobId=" + jobId + ", name=" + name + ", jobTitle=" + jobTitle + ", minSalary=" + minSalary
				+ ", maxSalary=" + maxSalary + "]";
	}
	
	

}
