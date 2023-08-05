package com.example.Elearning.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Elearning.Entites.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Integer>{

	public Professor findBynom(String nom);
	
}
