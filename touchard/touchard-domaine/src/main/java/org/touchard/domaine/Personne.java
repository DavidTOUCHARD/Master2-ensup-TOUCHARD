package org.touchard.domaine;

import java.util.ArrayList;
import java.util.List;

public class Personne {

	private int personneID;
	private String nom;
	private String prenom;
	private String login;
	private String motDePasse;
	private String dateNaissance;
	private List<Annonce> annonce;
	public int getPersonneID() {
		return personneID;
	}
	public void setPersonneID(int personneID) {
		this.personneID = personneID;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	public String getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public List<Annonce> getAnnonce() {
		return annonce;
	}
	public void setAnnonce(ArrayList<Annonce> annonce) {
		this.annonce = annonce;
	}
	@Override
	public String toString() {
		return "Personne [personneID=" + personneID + ", nom=" + nom + ", prenom=" + prenom + ", login=" + login
				+ ", motDePasse=" + motDePasse + ", dateNaissance=" + dateNaissance + ", annonce=" + annonce + "]";
	}
	public Personne(int personneID, String nom, String prenom, String login, String motDePasse, String dateNaissance,
			List<Annonce> annonce) {
		super();
		this.personneID = personneID;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.motDePasse = motDePasse;
		this.dateNaissance = dateNaissance;
		this.annonce = annonce;
	}
}
