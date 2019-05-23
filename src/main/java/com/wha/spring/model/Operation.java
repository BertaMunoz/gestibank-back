package com.wha.spring.model;

import java.util.Calendar;

import javax.persistence.Column;
//import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
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
	
	@Column(name="montantOp", nullable=false)
	private float montantOp;
	
	@Column(name="libelleOp", nullable=false)
	private String libelleOp;
}
