package com.restapp.dto;

import java.util.List;

/* 
 * this class is responsible to take request in dto form  .
 */
public class CollegeRequest {
	
	private int collegeId;
	
	private String collegeName;
	
	private List<Integer> coursesIds;

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

	public List<Integer> getCoursesIds() {
		return coursesIds;
	}

	public void setCoursesIds(List<Integer> coursesIds) {
		this.coursesIds = coursesIds;
	}
	
	
	
	

}
