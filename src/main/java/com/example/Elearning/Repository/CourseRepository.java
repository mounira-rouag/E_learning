package com.example.Elearning.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Elearning.Entites.Course;
import com.example.Elearning.Entites.Professor;


public interface CourseRepository extends JpaRepository<Course, Integer> {
	 public Course findByCoursename(String coursename);
	 public List<Course> findByProfessor(Professor professor);

}
