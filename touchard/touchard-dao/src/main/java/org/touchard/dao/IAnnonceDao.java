package org.touchard.dao;

import java.util.List;

import org.touchard.domaine.Annonce;
import org.touchard.domaine.Personne;

public interface IAnnonceDao {
	
	public int creerAnnonce(Personne personne, Annonce a);
	 public Annonce getAnnonce(int idAnnonce);
	 public void deleteAnnonce(int idAnnonce,Annonce a);
	 public void updateAnnonce(Personne p, Annonce a);
	 public List<Annonce> findAllAnnonce();
	 public int getAnnonceId(Annonce a);
}
