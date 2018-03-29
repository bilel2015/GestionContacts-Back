package org.sid.entities;

import java.io.Serializable;

public class Employe implements Serializable {
	private int id;
	private String Nom;
	private String Prenom;
	private int num_tel;
	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public int getNum_tel() {
		return num_tel;
	}

	public void setNum_tel(int num_tel) {
		this.num_tel = num_tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Employe(String nom, String prenom, int num_tel, String email) {
		super();
		Nom = nom;
		Prenom = prenom;
		this.num_tel = num_tel;
		this.email = email;
	}

	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}

}
