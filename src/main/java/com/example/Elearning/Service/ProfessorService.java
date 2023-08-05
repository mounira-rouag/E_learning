package com.example.Elearning.Service;

import java.util.List;

import com.example.Elearning.Entites.Professor;

public interface ProfessorService {
	
	public Professor saveProfessor(Professor professor);
	
	public Professor addNewProfessor(Professor professor);
	
	public Professor updateProfessorProfile(Professor professor);
	
	public List<Professor> getAllProfessors();
	
	public Professor fetchProfessorByProfessorname(String professorname);
	
	public String deleteProfessor(Integer id);
}

