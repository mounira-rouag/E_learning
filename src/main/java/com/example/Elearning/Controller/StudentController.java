package com.example.Elearning.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Elearning.Entites.Student;
import com.example.Elearning.Repository.StudentRepository;
import com.example.Elearning.ServiceImpl.StudentServiceImpl;

@RestController
public class StudentController {
	 @Autowired
	    private StudentServiceImpl studentServiceImpl;
	 
	 
	 /**find all students */
	 @GetMapping(value="/AllStudents")
	 public List<Student> getAllStudents(){
		 return studentServiceImpl.getAllStudents();
	 }
	 
	 /** ajout d'un student*/
	 @PostMapping(value="/addStudent")
	 public Student saveStudent(@RequestBody Student student) {
		return studentServiceImpl.saveStudent(student);
	 }
	 
	 /** verification des mdp*/
	 
	 @PostMapping(value="/testpwd")
	 public String Testpwd(@RequestBody Student student) {
		 return studentServiceImpl.addCpassword(student);
	 }
	 
	  /**modifier un etudiant */
	   
	   @PostMapping(value="/updateStudent/{id}")
	   public Student UpdateStudent(@RequestBody Student student ,@PathVariable Integer id  ) {
		   
		   return studentServiceImpl.updateStudentProfile(student, id);
	   }
	   /** add student and verificate if the email already exist or not */
	   
	   @PostMapping(value="/addByEmail")
		 public String addByUserName(@RequestBody Student student) {
			 return studentServiceImpl.addStudentWtun(student);
		 }
	   
	   /** delete student*/
	   @DeleteMapping(value="/deleteStudent/{id}")
	   public String deleteStudent(@PathVariable Integer id ) {
		   return studentServiceImpl.deletStudent(id);
	   }
	   /**find student by id */
	   @GetMapping(value="/student/{id}")
		 public Student getStudentById(@PathVariable Integer id){
			 return studentServiceImpl.findStudfentById(id);
			 }
	   
}
