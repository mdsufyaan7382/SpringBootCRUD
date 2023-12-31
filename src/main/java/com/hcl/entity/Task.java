package com.hcl.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Task {
	@Id
	private int taskid;
	private String description;
	private Date assigneddate;
	private String resolution;
	private Date resolvedate;
	private String status;
	public int getTaskid() {
		return taskid;
	}
	public void setTaskid(int taskid) {
		this.taskid = taskid;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getAssigneddate() {
		return assigneddate;
	}
	public void setAssigneddate(Date assigneddate) {
		this.assigneddate = assigneddate;
	}
	public String getResolution() {
		return resolution;
	}
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
	public Date getResolvedate() {
		return resolvedate;
	}
	public void setResolvedate(Date resolvedate) {
		this.resolvedate = resolvedate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	

}
