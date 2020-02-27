package com.bala.crudapi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
	
//	@Query("SELECT * FROM course")
//	public List<Course> getAllMyCourses();
	
}
