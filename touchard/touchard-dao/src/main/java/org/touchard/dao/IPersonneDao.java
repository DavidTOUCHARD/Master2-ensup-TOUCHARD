package org.touchard.dao;

import java.util.List;

import org.touchard.domaine.Annonce;
import org.touchard.domaine.Personne;

public interface IPersonneDao {

	 public int creerPersonne(Personne personne);
	 public Personne getPersonne(int idPersonne);
	 public void deletePersonne(int idPersonne);
	 public void updatePersonne(Personne p);
	 public List<Personne> findAllPersonnes();
	 public int getPersonneId(Personne p);
}
