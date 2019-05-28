package com.wha.spring.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="OPERATION")
public class Operation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idOp;
	
	@Column(name="dateOp", nullable=false)
	private Calendar dateOp;
	
	@Column(name="typeOp", nullable=false)
	private char typeOp;
	
	@Column(name="montantOpDebit", nullable=false)
	private double montantOpDebit;
	
	@Column(name="montantOpCredit", nullable=false)
	private double montantOpCredit;
	
	@Column(name="libelleOp", nullable=false)
	private String libelleOp;

	
	//Setter et Getter
	public int getIdOp() {
		return idOp;
	}

	public void setIdOp(int idOp) {
		this.idOp = idOp;
	}

	public Calendar getDateOp() {
		return dateOp;
	}

	public void setDateOp(Calendar dateOp) {
		this.dateOp = dateOp;
	}

	public char getTypeOp() {
		return typeOp;
	}

	public void setTypeOp(char typeOp) {
		this.typeOp = typeOp;
	}

	public String getLibelleOp() {
		return libelleOp;
	}

	public void setLibelleOp(String libelleOp) {
		this.libelleOp = libelleOp;
	}

	public double getMontantOpDebit() {
		return montantOpDebit;
	}

	public void setMontantOpDebit(double montantOpDebit) {
		this.montantOpDebit = montantOpDebit;
	}

	public double getMontantOpCredit() {
		return montantOpCredit;
	}

	public void setMontantOpCredit(double montantOpCredit) {
		this.montantOpCredit = montantOpCredit;
	}
}
