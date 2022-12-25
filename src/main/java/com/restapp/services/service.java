package com.restapp.services;

import java.util.List;

import com.restapp.dto.CollegeRequest;
import com.restapp.dto.UpdateCollegeRequest;
import com.restapp.entities.College;
import com.restapp.entities.Courses;

public interface service {

	public  List<Courses> getCourses();
	public  Courses getcourse(long id );
	public Courses addCourse(Courses courses);
	public Courses updateCourses(Courses courses);
	public Courses deleteCourse(long  courseId);
	public List<Courses> getTitle(String title);
	public Integer addCollegeDetail(CollegeRequest request);
	public List<College> getcollege();
	public College updateCollegeDetail(UpdateCollegeRequest request);
	public Courses getcourseid(long id);
	public String deleteCollege(int id);
}
