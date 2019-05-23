package com.wha.spring.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "conseiller")
public class Conseiller {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mle;

/*	@Column(name = "DATE_EMBAUCHE", nullable = false)
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
	private LocalDate dateEmbauche;
*/
	@Column(name = "NOM", nullable = false)
	private String nom;

	@Column(name = "PRENOM", nullable = false)
	private String prenom;

	@Column(name = "EMAIL", nullable = false)
	private String email;

	@Column(name = "TEL", unique = true, nullable = false)
	private String tel;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	public Adresse adresse;

/*
	@OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	private List<Children> childrens;
*/
	

	public Conseiller() {
		super();

	}

	public Conseiller(int mle, /*LocalDate dateEmbauche, */String nom, String prenom, String email, String tel, Adresse adresse) {
	super();
	this.mle = mle;
	//this.dateEmbauche = dateEmbauche;
	this.nom = nom;
	this.prenom = prenom;
	this.email = email;
	this.tel = tel;
	this.adresse=adresse;
}
	
	@Override
	public String toString() {
		return "\n Conseiller [mle=" + mle + ", nom=" + nom + ", prenom =" + prenom +
				", email=" + email + ", tel=" + tel + ", addresse=" + adresse+ "]\n ";
	}

	public int getMle() {
		return mle;
	}

	public void setMle(int mle) {
		this.mle = mle;
	}

/*	public LocalDate getDateEmbauche() {
		return dateEmbauche;
	}

	public void setDateEmbauche(LocalDate dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}
*/
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

}