package com.restapp.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="collegedetail")
public class College {
	
	@Id
	@GeneratedValue
	@Column
	private int collegeId;
	@Column
	private String collegeName;
	@OneToMany(targetEntity=Courses.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "colid_fk",referencedColumnName = "collegeId")
	private List<Courses> courseList;
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	public College(int collegeId, String collegeName, List<Courses> courseList) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.courseList = courseList;
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
	public List<Courses> getCourseList() {
		return courseList;
	}
	public void setCourseList(List<Courses> courseList) {
		this.courseList = courseList;
	}
	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + ", courseList=" + courseList + "]";
	}
	
	
	
	
	

}
