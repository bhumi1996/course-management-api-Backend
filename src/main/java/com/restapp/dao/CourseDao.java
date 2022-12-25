package com.restapp.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.restapp.entities.Courses;

/* this class is responsible to operate courses bases CRUD operation of database object
 * 
 * @Repositary: which is used to indicate that the class provides the mechanism for storage, 
 * retrieval, update, delete and search operation on objects.
 * 
 * 
 */

@Repository
public interface CourseDao extends JpaRepository<Courses,Long>{
	
	
		 
		@Query(value="select * from courses u where u.title =?1",nativeQuery=true)
		public  List<Courses> getTilte(String title);

	}



