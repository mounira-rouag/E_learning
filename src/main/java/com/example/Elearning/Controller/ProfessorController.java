package com.example.Elearning.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Elearning.Entites.Professor;

import com.example.Elearning.ServiceImpl.ProfessorServiceImpl;

@RestController
public class ProfessorController {
	
	 @Autowired
	    private ProfessorServiceImpl professorServImpl;
	 
	 @GetMapping(value="/AllProfesssor")
	 public List<Professor> getAllProfessors(){
		 return professorServImpl.getAllProfessors();
	 }
	 
	 @PostMapping(value="/addprofessor")
	 public Professor saveProfessor(@RequestBody Professor professor) {
		 return professorServImpl.saveProfessor(professor);
	 }
	 
	 @PostMapping(value="/updateprofessor/{id}")
		public Professor updateProfessorProfile(@RequestBody Professor professor,@PathVariable Integer id ) {
		 return professorServImpl.updateProfessorProfile(professor)	;
		 }
	 
	 @DeleteMapping(value="/deleteProfrssor/{id}")
	   public String deleteProfessor(@PathVariable Integer id ) {
		   return professorServImpl.deleteProfessor(id) ;
	   }
	 
	 @GetMapping("/professor/{name}")
	    public Professor getProfessorByName(@PathVariable String name) {
	       return professorServImpl.fetchProfessorByProfessorname(name);
	    }
}
