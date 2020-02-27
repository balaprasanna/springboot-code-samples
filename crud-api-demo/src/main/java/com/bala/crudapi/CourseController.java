package com.bala.crudapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService coursesvc;

	@RequestMapping(method = RequestMethod.GET, path = "/api/v1/Course")
	public List<Course> getAllCourses(){
		return coursesvc.getAllCourses();
	}
	
	@RequestMapping(method = RequestMethod.POST, path = "/api/v1/Course")
	public Course addCourse( @RequestBody Course c){
		return coursesvc.addCourse(c);
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/api/v1/Course/{id}")
	public ResponseEntity<?> getCourseDetails( @PathVariable Integer id){
		
		Course c = coursesvc.getCourseDetail(id);
		if (c!= null) {
			return new ResponseEntity<Course>(c, HttpStatus.OK);
		}else {
			return new ResponseEntity<APIError>(new APIError("Course not found"), HttpStatus.NOT_FOUND);
		}
		
	}
	
	@RequestMapping(method = RequestMethod.PUT, path = "/api/v1/Course/{id}")
	public Course addCourse( @RequestBody Course c, @PathVariable Integer id){
		return coursesvc.updateCourse(c, id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, path = "/api/v1/Course/{id}")
	public Course deleteCourse( @PathVariable Integer id) {
		return coursesvc.deleteCourse(id);
	}
}
