package com.example.Elearning.Service;

import java.util.List;

import com.example.Elearning.Entites.Course;
import com.example.Elearning.Entites.Professor;
import com.example.Elearning.Entites.Student;

public interface CourseService {
	public List<Course> getAllCourses();
	
	public Course saveCourse(Course course);
	
	public Course updateCourse(Course course);
	
	public Course findCourseById(Integer id);
	
	public String deleteCourse(Integer id );
	
	public List<Course> fetchByProfessor(Professor professor);
	
}
