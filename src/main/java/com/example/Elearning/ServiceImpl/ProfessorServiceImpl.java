package com.example.Elearning.ServiceImpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Elearning.Entites.Professor;
import com.example.Elearning.Repository.ProfessorRepository;
import com.example.Elearning.Service.ProfessorService;
import com.example.Elearning.Service.StudentService;
@Service
public class ProfessorServiceImpl implements ProfessorService {
	
	@Autowired
	private ProfessorRepository professorRepo;
	
	public Professor saveProfessor(Professor professor)
	{
		return professorRepo.save(professor);
	}
	
	public Professor addNewProfessor(Professor professor)
	{
		return professorRepo.save(professor);
	}
	
	public Professor updateProfessorProfile(Professor professor)
	{
		return professorRepo.save(professor);
	}
	
	public List<Professor> getAllProfessors()
	{
		return (List<Professor>)professorRepo.findAll();
	}

	@Override
	public Professor fetchProfessorByProfessorname(String professorname) {
		// TODO Auto-generated method stub
		return professorRepo.findBynom(professorname);
	}

	@Override
	public String deleteProfessor(Integer id) {
		// TODO Auto-generated method stub
		String ch="";
		professorRepo.deleteById(id);
		return ch="Professor deleted";
	}
	
}
