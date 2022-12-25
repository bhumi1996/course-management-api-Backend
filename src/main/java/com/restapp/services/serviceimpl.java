package com.restapp.services;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.restapp.dao.CollegeDao;
import com.restapp.dao.CourseDao;
import com.restapp.dto.CollegeRequest;
import com.restapp.dto.UpdateCollegeRequest;
import com.restapp.entities.College;
import com.restapp.entities.Courses;

@Component
@Service
public class serviceimpl  implements service{

	@Autowired
	private CourseDao courseDao;
	
	@Autowired
	private CollegeDao collegeDao;
	

	
	public serviceimpl() {
	
		
		
	}

	/*
	 *  business logic to get all courses detail from database
	 */
	
	@Override
	public List<Courses> getCourses() {

		
		return courseDao.findAll();
	}
	
	

	/*
	 *  business logic to get one course detail from database
	 */
	@Override
	public Courses getcourse(long id) {
	
		Courses courses=null;
		 List<Courses> list2 = courseDao.findAll();
		 for(int i=0; i<list2.size();i++)
		 {
			 if(list2.get(i).getId()==id)
			 {
				 Courses courses1 = list2.get(i);
				 courses=courses1;
				 System.out.println(courses);
				 
			 }
				 
		 }
		return courses;
	
	
	
		
	}
	
	
	public Courses getcourseid(long id)
	{
		
		return courseDao.getOne(id);
	}


	/*
	 *  business logic to add courses detail in database
	 */
	@Override
	public Courses addCourse(Courses courses) {
	
		
		 courseDao.save(courses);
		return courses;
	}


	/*
	 *  business logic to update courses detail in database
	 */
	@Override
	public Courses updateCourses(Courses courses) {
		
		List<Courses> list2 = courseDao.findAll();
		
		for(int i=0; i<list2.size();i++)
		{
			Courses courses2=list2.get(i);
	
			
			if(courses2.getId()==courses.getId())
				{
				
					courses2.setTitle(courses.getTitle());
					courses2.setDescription(courses.getDescription());
					courseDao.save(courses2);
					
				}
		}
		
		
		
		return courses;
	}

	

	/*
	 *  business logic to delete courses detail from database
	 */
	@Override
	public Courses deleteCourse(long id) {
		
		Optional<Courses> one = courseDao.findById(id);
		courseDao.delete(one.get());
		return one.get();
	}


	/*
	 *  business logic to get all similar title courses detail from database
	 */
	@Override
	public List<Courses> getTitle(String title) {
	
     return courseDao.getTilte(title);
	
	}


	/*
	 *  business logic to add college detail in database
	 */
	@Override
	public Integer addCollegeDetail(CollegeRequest request) {
		    
		ArrayList<Courses> coursesinfo = new ArrayList<>();
		 College c = new College() ;
	   //  c.setCollegeId(request.getCollegeId());
	     c.setCollegeName(request.getCollegeName());
	     
		
		List<Integer> coursesIds = request.getCoursesIds();
		
		
		for(int i=0;i<coursesIds.size();i++)
		{
		          
			Courses course = getcourseid(coursesIds.get(i)); 
			coursesinfo.add(course); 
		}
		
		c.setCourseList(coursesinfo);
		collegeDao.save(c);
		return c.getCollegeId();
	
	
		
	}


	/*
	 *  business logic to get all college detail from database
	 */
	@Override
	public List<College> getcollege() {
		
		 return collegeDao.findAll();
	
	}


	/*
	 *  business logic to update college detail in database
	 */
	public College updateCollegeDetail(UpdateCollegeRequest request)
	{
		     
		College col = null;
		    List<College>list2 = collegeDao.findAll();
		    
		   
			for(int i=0; i<list2.size();i++)
			{
				College college1 = list2.get(i);
				
				if(college1.getCollegeId()==request.getCollegeId())
					{
					
					    college1.setCollegeName(request.getCollegeName());
						
					
						College college = collegeDao.save(college1);
						col=college;
						
					}
			}
			return col;
		
			
			
				
			
		
		
	}


	/*
	 *  business logic to delete college detail from database
	 */
	@Override
	public String deleteCollege(int id) {
		
		Optional<College> one = collegeDao.findById(id);
		collegeDao.delete(one.get());
		return "deleted";
	}
}
