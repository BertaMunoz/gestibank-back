package com.wha.spring.iservice;

import java.util.List;

import com.wha.spring.model.Compte;

public interface ICompteService {
	
	void saveCompte(Compte compte);
	
	List<Compte> findAllCompte();
	
	void deleteCompteByNum(int numCompte);
	
	Compte findByNum(int numCompte);
	
	void updateCompte(Compte compte);
}
