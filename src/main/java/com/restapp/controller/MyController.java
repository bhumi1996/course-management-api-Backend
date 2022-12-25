package com.restapp.controller;

/*
 *@Restcontoller ?
 This annotation is applied to a class to mark it as a request handler. Spring RestController annotation is used to create RESTful web services using Spring MVC.this annotation is itself combination of @controller and @responsebody.


 */


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;


import com.restapp.dto.CollegeRequest;
import com.restapp.dto.UpdateCollegeRequest;
import com.restapp.entities.College;
import com.restapp.entities.Courses;
import com.restapp.services.service;

@RestController
public class MyController {

	@Autowired
	private service service;
	
	
	@GetMapping("/home")
	public String home()
	{
		return "this is home page ";
	}
	
	
	@GetMapping("/courses")
	public List<Courses> getCourses()
	{
		
		return this.service.getCourses();
	}
	
	@GetMapping("/course/{courseId}")
	public Courses getCourse(@PathVariable String courseId)
	{
		return this.service.getcourse(Long.parseLong(courseId));
	
	}
	
	@PostMapping("/course" )
	public Courses addCourse(@RequestBody Courses courses)
	{
		   System.out.println(courses);
            return this.service.addCourse(courses);
	}
	
	
	@PutMapping("/course")
	public Courses updateCourses(@RequestBody Courses courses)
	{
		return this.service.updateCourses(courses);
	}
	
	@DeleteMapping("/course/{courseId}")
	public Courses deleteCourses(@PathVariable String courseId)
	{
		return this.service.deleteCourse(Long.parseLong(courseId));
		
	}
	
	@GetMapping("/course/title/{coursetitle}")
	public List<Courses> getTitle(@PathVariable String coursetitle)
	{
		return this.service.getTitle(coursetitle);
		
	}
	
	@PostMapping("/addcollege")
	public Integer addCollegeDetail(@RequestBody CollegeRequest request)
	{
		System.out.println("HI");
		 return this.service.addCollegeDetail(request);
	}
	

	@GetMapping("/getallcollege")
	public List<College> getcollege()
	{
		
		return this.service.getcollege();
	}
	

	@PutMapping("/updatecollege")
	public College updatCollegeDetail(@RequestBody UpdateCollegeRequest request)
	{
		 return this.service.updateCollegeDetail(request);
	}
	
	

	@DeleteMapping("/deletecollege/{collegeId}")
	public String deleteCollege(@PathVariable String collegeId)
	{
		return this.service.deleteCollege(Integer.parseInt(collegeId));
		
	}
}

