package com.wha.spring.dto;

public class CompteDto {
	private int numeroCompte;
	private int idClient;
	private String typeCompte;
	private double decouverAutorise;
	private double plafondAutorise;
	private double solde;

	public int getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public String getTypeCompte() {
		return typeCompte;
	}

	public void setTypeCompte(String typeCompte) {
		this.typeCompte = typeCompte;
	}

	public double getDecouverAutorise() {
		return decouverAutorise;
	}

	public void setDecouverAutorise(double decouverAutorise) {
		this.decouverAutorise = decouverAutorise;
	}

	public double getPlafondAutorise() {
		return plafondAutorise;
	}

	public void setPlafondAutorise(double plafondAutorise) {
		this.plafondAutorise = plafondAutorise;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

}
