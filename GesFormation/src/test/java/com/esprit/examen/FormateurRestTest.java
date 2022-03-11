package com.esprit.examen;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.esprit.examen.entities.Formateur;

import lombok.extern.slf4j.Slf4j;


@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j

public class FormateurRestTest {
	

	@Test
	public void testAjouterFormateur() {
		
		
		log.warn("********************************Start Method Test Ajouter Formateur ******************************************************");
		Formateur f = new Formateur();
        f.setNom("Test Nom");
		f.setPrenom("Test Prenom");
		/*c.setIntitule("Test Intitule");
		Long coursId = service.addCours(c);*/
		System.out.println("done");
		log.trace("trace : Cours added sucessfuly !");
		log.debug("debug : Cours added sucessfuly  ");
       
		/*if( null == service.getCoursById(coursId)) 	
		log.error("we don't have Cours with this ID" + coursId);*/
		
		
		/*assertNotNull(service.getCoursById(coursId));
		log.info("this is one cours of  " + service.getCours().size() +" Cours");	
		log.warn("********************************End Method Test Add Cours ******************************************************");
		*/
		}

	@Test
	public void testModifierFormateur() {
		
	}

	@Test
	public void testSupprimerFormateur() {
	
	}

	@Test
	public void testNombreFormateursImpliquesDansUnCours() {
		
	}

}
