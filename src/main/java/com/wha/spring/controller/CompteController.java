package com.wha.spring.controller;

import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wha.spring.model.Compte;
import com.wha.spring.service.CompteServiceImpl;

@RestController
@RequestMapping(value = "/compte")
public class CompteController {
	@Autowired
	CompteServiceImpl service;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String display() {
		return "index";
	}
	
	@RequestMapping(value = "/{numCompte}", method=RequestMethod.GET)
	public ResponseEntity<Compte> getCompte(@PathVariable int numCompte){
		Compte result = service.findByNum(numCompte);
		System.out.println(result);
		return new ResponseEntity<Compte>(result, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getAll", method=RequestMethod.GET)
	public ResponseEntity<List<Compte>> getAllCompte(){
		List<Compte> result = service.findAllCompte();
		System.out.println(result);
		return new ResponseEntity<List<Compte>>(result, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public Compte createCompte(@RequestBody Compte compte){
		service.saveCompte(compte);
		return compte;
	}
	
	@RequestMapping(value = "/delete/{numCompte}", method = RequestMethod.DELETE)
	public String deleteCompte(@PathVariable("numCompte") int numCompte) {
		service.deleteCompteByNum(numCompte);
		return "redirect: /getAll";	
	}	
	
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public ResponseEntity<Compte> insert(){
		Compte compte1 = new Compte();
		compte1.setDateCreate(new GregorianCalendar(2010, 05, 12));
		compte1.setSolde(200.00);
		compte1.setTypeCompte("Avec Decouvert");
		compte1.setDecouvert(700.00);
		compte1.setPlafond(0.00);
		service.saveCompte(compte1);
		return new ResponseEntity<Compte>(compte1, HttpStatus.OK);
	}
}
