package com.esprit.examen.services;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.examen.entities.Cours;
import com.esprit.examen.entities.Session;
import com.esprit.examen.repositories.CoursRepository;
import com.esprit.examen.repositories.SessionRepository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class CoursService implements ICoursService {

	@Autowired
	CoursRepository coursRepository;
	@Override
	public Long addCours(Cours cours) {
		coursRepository.save(cours);
		return cours.getId();
	}

	@Override
	public Long modifierCours(Cours cours) {
		coursRepository.save(cours);
		return cours.getId();
		}

	@Override
	public void supprimerCours(Long coursId) {
		coursRepository.deleteById(coursId);
		
	}

	@Override
	public List<Cours> getCours() {
		
		List<Cours> cours =   coursRepository.findAll();
		return cours;
	}
	
	@Override
	public void affecterCoursASession(Long coursId, Long sessionId)
	{
		/*todo*/
        
	}
	
	@Override
	public Cours getCoursById(Long coursId)
	{
		Optional<Cours> c = coursRepository.findById(coursId);
        if(c.isPresent()) {
        	Cours cours =c.get();
        	return cours;
        }else {
            log.info("Cours doesn't exist");
            return null;
        }
	}

}
