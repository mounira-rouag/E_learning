package com.example.Elearning.Service;

import java.util.List;

import com.example.Elearning.Entites.Student;

public interface StudentService {
	
	public List<Student> getAllStudents();
	
	public Student saveStudent(Student student);
	
	public Student updateStudentProfile(Student student,Integer id);
	
	public Student findStudfentById(Integer id);
	
	public String addCpassword(Student student);
	
	public String addStudentWtun(Student student);
	
	public String deletStudent(Integer id);
	
	public List<Student> getAllStudentswithch(String ch);
	
	public Student findByEmailAndPassword(String email, String password);

}
