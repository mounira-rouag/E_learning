package com.example.Elearning.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Elearning.Entites.Course;
import com.example.Elearning.Entites.Student;
import com.example.Elearning.Repository.CourseRepository;
import com.example.Elearning.ServiceImpl.CourseCourseImpl;


@RestController
public class CourseController {
	 @Autowired
	    private CourseCourseImpl courseServiceImpl;
	 @GetMapping(value="/AllCourses")
	 public List<Course> getAllStudents(){
		 return courseServiceImpl.getAllCourses();
	 }
	 
	 @PostMapping(value="/addCourse")
	 public Course saveStudent(@RequestBody Course course) {
		return courseServiceImpl.saveCourse(course);
	 }
	   
	 @DeleteMapping(value="/deleteCourse/{id}")
	   public String deleteCourse(@PathVariable Integer id ) {
		   return courseServiceImpl.deleteCourse(id) ;
	   }

	 
}
