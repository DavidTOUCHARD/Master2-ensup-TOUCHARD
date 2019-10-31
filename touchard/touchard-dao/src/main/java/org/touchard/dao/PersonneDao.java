package org.touchard.dao;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.touchard.domaine.Personne;

public class PersonneDao implements IPersonneDao{
	
	 public int creerPersonne(Personne personne){
		 ConnexionDao cd = new ConnexionDao();

			Statement stm = null;
			try {
				stm = cd.connection();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				String sql = "INSERT INTO `personne` (`personneid`,`nom`,`prenom`,`login`,`password`,`datenaissance`) VALUES ('"
						+ personne.getPersonneID() + "','" + personne.getNom() + "','" + personne.getPrenom() + "','"
						+ personne.getLogin() + "','"  + personne.getMotDePasse() + "','" + personne.getDateNaissance() + "');";
				stm.executeUpdate(sql);

			} catch (SQLException e) {
				e.printStackTrace();
			}
			cd.deconnection();
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
