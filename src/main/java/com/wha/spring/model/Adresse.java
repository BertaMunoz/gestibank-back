package com.wha.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Adresse")
public class Adresse {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "Numero", nullable = true)
	public int numero;
	
	@Column(name ="Rue" , nullable= false)
	public String rue;
	
	@Column(name = "Cp", nullable= false)
	public String cp;
	
	@Column(name = "Ville", nullable= false)
	public String ville;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public Adresse() {
		super();
	}

	@Override
	public String toString() {
		return "Adresse [id=" + id + ", numero=" + numero + ", rue=" + rue + ", cp=" + cp + ", ville=" + ville + "]";
	} 
	
	
}
