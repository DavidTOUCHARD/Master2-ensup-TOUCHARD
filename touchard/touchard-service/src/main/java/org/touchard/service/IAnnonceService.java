package org.touchard.service;

import java.util.List;

import org.touchard.domaine.Annonce;
import org.touchard.domaine.Personne;

public interface IAnnonceService{
	
	 public int creerAnnonce(Personne personne, Annonce a);
	 public Annonce getAnnonce(int idAnnonce);
	 public void deleteAnnonce(int idAnnonce);
	 public void updateAnnonce(Annonce a);
	 public List<Annonce> findAllAnnonce();
	 public int getAnnonceId(Annonce a);
}
