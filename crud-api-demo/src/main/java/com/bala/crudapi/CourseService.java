package com.bala.crudapi;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;

	public List<Course> getAllCourses(){
		return courseRepository.findAll();
	}
	
	public Course addCourse(Course c){
		return courseRepository.saveAndFlush(c);
	}
	
	public Course getCourseDetail(Integer id){
		Optional<Course> c = courseRepository.findById(id);
		if (c.isPresent()){
			return c.get();
		}else {
			return null;
		}
	}
	
	public Course updateCourse(Course c, Integer id) {
		Optional<Course> toupdate = courseRepository.findById(id);
		if (toupdate.isPresent()) {
			Course org = toupdate.get();
			org.setName(c.getName());
			org.setDescription(c.getDescription());
			org.setDuration(c.getDuration());
			return courseRepository.save(org);
		}
		else {
			return null;
		}
	}
	
	public Course deleteCourse(Integer id) {
		Optional<Course> todelete = courseRepository.findById(id);
		
		if (todelete.isPresent()) {
			courseRepository.deleteById(id);
			return todelete.get();
		}
		else {
			return null;
		}
	}
	
}
