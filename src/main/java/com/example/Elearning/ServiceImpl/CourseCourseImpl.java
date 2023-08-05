package com.example.Elearning.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Elearning.Entites.Course;
import com.example.Elearning.Entites.Professor;
import com.example.Elearning.Entites.Student;
import com.example.Elearning.Repository.CourseRepository;
import com.example.Elearning.Service.CourseService;


@Service
public class CourseCourseImpl implements CourseService {
	@Autowired
	private CourseRepository courseRepo;

	@Override
	public List<Course> getAllCourses() {
		// TODO Auto-generated method stub
		return courseRepo.findAll();
	}

	@Override
	public Course saveCourse(Course course) {
		// TODO Auto-generated method stub
		return courseRepo.save(course) ;
	}

	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		return courseRepo.save(course);
	}

	@Override
	public Course findCourseById(Integer id) {
		// TODO Auto-generated method stub
		return courseRepo.findById(id).get();
	}

	@Override
	public String deleteCourse(Integer id) {
		// TODO Auto-generated method stub
		String ch="";
		courseRepo.deleteById(id);
		return "course deleted" ;
	}

	@Override
	public List<Course> fetchByProfessor(Professor professor) {
		// TODO Auto-generated method stub
		return courseRepo.findByProfessor(professor) ;
	}  
	
}
