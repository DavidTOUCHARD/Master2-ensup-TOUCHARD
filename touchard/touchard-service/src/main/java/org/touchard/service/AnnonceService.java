package org.touchard.service;

import java.util.List;

import org.touchard.dao.AnnonceDao;
import org.touchard.domaine.Annonce;
import org.touchard.domaine.Personne;

public class AnnonceService implements IAnnonceService {
	
	AnnonceDao annoncedao = new AnnonceDao();
	Personne personne = new Personne(0, null, null, null, null, null, null);
	Annonce annonce = new Annonce(0, null, null, 0, personne);
	
	@Override 
	 public int creerAnnonce(Personne personne, Annonce a){
		
		annoncedao.creerAnnonce(personne, annonce);
		return 0;
		 
	 }
	@Override
	 public Annonce getAnnonce(int idAnnonce){
		
		annoncedao.getAnnonce(idAnnonce);
		
		return null;
		 
	 }
	@Override
	 public void deleteAnnonce(int idAnnonce){
		
		annoncedao.deleteAnnonce(idAnnonce, annonce);
		 
	 }
	@Override
	 public void updateAnnonce(Annonce a){
		 
	 }
	@Override
	 public List<Annonce> findAllAnnonce(){
		return null;
		 
	 }
	@Override
	 public int getAnnonceId(Annonce a){
		return 0;
		 
	 }
}
