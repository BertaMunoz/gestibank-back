package com.wha.spring.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.beans.factory.annotation.Autowired;

import sun.font.EAttribute;

@Entity
@Table(name = "Client")
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "Nom", nullable = false)
	public String nom;
	
	@Column(name = "Prenom", nullable = false)
	public String prenom;
	
	@Column(name = "Email", nullable = false)
	public String email;
	
	@Column(name = "Pseudo", nullable = false)
	public String pseudo;
	
	@OneToOne(cascade = CascadeType.ALL)
	public Adresse adresse; 
	
	@Column(name = "Tel", nullable = false)
	public String tel;

	@Column(name = "NbrEnfants", nullable = true)
	public int nbrEnfant;
	
	@Column(name = "Situation", nullable = false)
	public String situation;
	
	@OneToMany(mappedBy = "client")
	@Fetch(value = FetchMode.JOIN)
	public List<Notification> Notifications; 
	
	
	
	public List<Notification> getNotifications() {
		return Notifications;
	}

	public void setNotifications(List<Notification> notifications) {
		Notifications = notifications;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getNbrEnfant() {
		return nbrEnfant;
	}

	public void setNbrEnfant(int nbrEnfant) {
		this.nbrEnfant = nbrEnfant;
	}

	public String getSituation() {
		return situation;
	}

	public void setSituation(String situation) {
		this.situation = situation;
	}
	
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", pseudo=" + pseudo
				+ ", adresse=" + adresse + ", tel=" + tel + ", nbrEnfant=" + nbrEnfant + ", situation=" + situation
				+ ", Notification=" + Notifications + "]";
	}

	public void initNotifications() {
		Notifications = new ArrayList<Notification>();
	}

	
}
