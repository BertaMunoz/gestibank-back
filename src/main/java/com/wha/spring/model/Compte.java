package com.wha.spring.model;

import java.util.Calendar;

//import java.util.Calendar;
//import java.util.Collection;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="COMPTE")
public class Compte {
	
	@Autowired
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int numCompte;
	
	@Autowired
	@Column(name="dateCreate", nullable=false)
	private Calendar dateCreate;
		
	@Autowired
	@Column(name="solde", nullable=false)
	private double solde;
	
	@Autowired
	@Column(name="typeCompte", nullable=false)
	private String typeCompte;
	
	@Autowired
	@Column(name="decouvert", nullable=false)
	private double decouvert;
		
	@Autowired
	@Column(name="plafond", nullable=false)
	private double plafond;
	
	//@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	//private Collection<Operation> operation;

	
	//Getter et Setter
	public int getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public String getTypeCompte() {
		return typeCompte;
	}

	public void setTypeCompte(String typeCompte) {
		this.typeCompte = typeCompte;
	}

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	public double getPlafond() {
		return plafond;
	}

	public void setPlafond(double plafond) {
		this.plafond = plafond;
	}
/*
	public Collection<Operation> getOperation() {
		return operation;
	}

	public void setOperation(Collection<Operation> operation) {
		this.operation = operation;
	}*/

	public Calendar getDateCreate() {
		return dateCreate;
	}

	public void setDateCreate(Calendar dateCreate) {
		this.dateCreate = dateCreate;
	}
}

	