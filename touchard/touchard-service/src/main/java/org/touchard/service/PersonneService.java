package org.touchard.service;

import java.util.List;

import org.touchard.dao.AnnonceDao;
import org.touchard.dao.PersonneDao;
import org.touchard.domaine.Personne;

public class PersonneService {
	
	PersonneDao personnedao = new PersonneDao();
	Personne personne = new Personne(0, null, null, null, null, null, null);
	
	 public int creerPersonne(Personne personne){
		 
		 personnedao.creerPersonne(personne);
		 
		return 0;
		 
	 }
	 public Personne getPersonne(int idPersonne){
		return null;
		 
	 }
	 public void deletePersonne(int idPersonne){
		 
	 }
	 public void updatePersonne(Personne p){
		 
	 }
	 public List<Personne> findAllPersonnes(){
		return null;
		 
	 }
	 public int getPersonneId(Personne p){
		return 0;
		 
	 }
}
