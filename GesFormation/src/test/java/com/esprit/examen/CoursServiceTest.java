package com.esprit.examen;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.esprit.examen.entities.Cours;
import com.esprit.examen.entities.TypeCours;
import com.esprit.examen.services.ICoursService;

import lombok.extern.slf4j.Slf4j;


@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class CoursServiceTest extends Cours {
	@Autowired
	ICoursService service;

	@Test  
	public void testAjouterCours() {
		log.warn("********************************Start Method Test Add Cours ******************************************************");
		Cours c = new Cours();
        c.setDescription("test Description");
		c.setTypeCours(TypeCours.Informatique);
		c.setIntitule("Test Intitule");
		Long coursId = service.addCours(c);
		System.out.println("hani houni");
		log.trace("trace : Cours added sucessfuly !");
		log.debug("debug : Cours added sucessfuly  ");
       
		if( null == service.getCoursById(coursId)) 	
		log.error("we don't have Cours with this ID" + coursId);
		
		
		assertNotNull(service.getCoursById(coursId));
		log.info("this is one cours of  " + service.getCours().size() +" Cours");	
		log.warn("********************************End Method Test Add Cours ******************************************************");
	}
	
	@Test
	public void testDeleteCours() {
		log.info("********************************Start Method Test Delete Contract ******************************************************");
	Cours c = new Cours();
    c.setDescription("test Description");
	c.setTypeCours(TypeCours.Informatique);
	c.setIntitule("Test Intitule");
	assertNotNull(c);
	Long coursId = service.addCours(c);
	 log.info("********************************Start Method Test Delete non-existent Contract ******************************************************");
	service.supprimerCours(c.getId());
	log.info(" ********************Cours avec id : " +coursId +" deleted ********************");
   

	log.info("********************************End Method ******************************************************");

	}
	
	@Test  
	public void testModifierCours() {
		Cours c = new Cours();
        c.setDescription("aymen");
		c.setTypeCours(TypeCours.Informatique);
		c.setIntitule("Test Intitule");
		Long coursId = service.addCours(c);
		System.out.println("hani houni");
		log.trace("trace : Cours added sucessfuly !");
		log.debug("debug : Cours added sucessfuly  ");
		log.warn("********************************Start Method Test Add Cours ******************************************************");
		Cours cours = service.getCoursById(coursId);
		cours.setDescription("kefi");
		Long coursIdM =service.modifierCours(cours);
		
		assertEquals(coursId, coursIdM);
		assertNotEquals(c.getDescription(),cours.getDescription());
		
		if( c.getDescription().equals(cours.getDescription())) {	
		   log.error("modify don't work with coursID " + coursId);
		}
		else {
			log.info("this is one cours of  " + service.getCours().size() +" Cours");
		}
	
		log.warn("********************************End Method Test Modify Cours ******************************************************");
	}
}
