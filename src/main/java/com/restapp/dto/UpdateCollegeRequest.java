package com.restapp.dto;

/*
 * this class is responsible to take request in dto form .
 */
public class UpdateCollegeRequest {
	
	 private int collegeId;
	 private String collegeName;
	public UpdateCollegeRequest(int collegeId, String collegeName) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
	}
	public UpdateCollegeRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	@Override
	public String toString() {
		return "UpdateCollegeRequest [collegeId=" + collegeId + ", collegeName=" + collegeName + "]";
	}
	 
	 

}
