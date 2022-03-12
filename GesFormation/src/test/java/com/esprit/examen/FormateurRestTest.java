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
        log.warn("********************************Start Method Test Ajouter Formateur ******************************************************");
		f.setPrenom("Test Prenom");
		
		System.out.println("done");
		
       
		
		}

	@Test
	public void testModifierFormateur() {
		log.warn("********************************Start Method Test Modifier Formateur ******************************************************");
		Formateur f = new Formateur();
        f.setNom("Test Nom");
        log.warn("********************************Start Method Test Modifier Formateur ******************************************************");
		f.setPrenom("Test Prenom");
		
		System.out.println("done");
		
	}

	@Test
	public void testSupprimerFormateur() {
		log.warn("********************************Start Method Test Supprimer Formateur ******************************************************");
		Formateur f = new Formateur();
        f.setNom("Test Nom");
        log.warn("********************************Start Method Test Supprimer Formateur ******************************************************");
		f.setPrenom("Test Prenom");
		
		System.out.println("done");
	
	}

	@Test
	public void testNombreFormateursImpliquesDansUnCours() {
		log.warn("********************************Start Method Test Nombre Formateur Impliques dans cours ******************************************************");
		
		
		System.out.println("done");
		
	}

}
