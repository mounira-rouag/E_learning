package com.example.Elearning.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Elearning.Entites.Chapitre;
import com.example.Elearning.Service.ChapitreService;
@Service
public class ChapitreServiceImpl implements ChapitreService {
     
	@Autowired
	private ChapitreService chapitreService;
	
	@Override
	public List<Chapitre> getAllChapitres() {
		// TODO Auto-generated method stub
		return chapitreService.getAllChapitres();
	}

	@Override
	public Chapitre saveChapitre(Chapitre chapitre) {
		// TODO Auto-generated method stub
		return chapitreService.saveChapitre(chapitre);
	}

	@Override
	public Chapitre updateChapitre(Chapitre chapitre) {
		// TODO Auto-generated method stub
		return chapitreService.saveChapitre(chapitre);
	}

	@Override
	public Chapitre findChapitreById(Integer id) {
		// TODO Auto-generated method stub
		return chapitreService.findChapitreById(id);
	}

	@Override
	public String deleteChapitre(Integer id) {
		// TODO Auto-generated method stub
		return chapitreService.deleteChapitre(id);
	}

}
