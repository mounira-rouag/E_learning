package com.example.Elearning.Service;

import java.util.List;

import com.example.Elearning.Entites.Chapitre;
import com.example.Elearning.Entites.Course;

public interface ChapitreService {
	
public List<Chapitre> getAllChapitres();
	
	public Chapitre saveChapitre(Chapitre chapitre);
	
	public Chapitre updateChapitre(Chapitre chapitre);
	
	public Chapitre findChapitreById(Integer id);
	
	public String deleteChapitre(Integer id );
	

}
