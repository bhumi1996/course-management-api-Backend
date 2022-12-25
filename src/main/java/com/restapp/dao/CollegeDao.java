package com.restapp.dao;

/* this class is responsible to operate college bases CRUD operation of database object
 * 
 * @Repositary: which is used to indicate that the class provides the mechanism for storage, 
 * retrieval, update, delete and search operation on objects.
 * 
 * 
 */
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.restapp.entities.College;

@Repository
public interface CollegeDao extends JpaRepository<College, Integer> {

}
