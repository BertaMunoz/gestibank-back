package com.wha.spring.idao;

import java.util.List;

import com.wha.spring.model.Compte;

public interface ICompteDao {
	void saveCompte(Compte compte);
	
	List<Compte> findAllCompte();
	
	void deleteCompteByNum(int numCompte);
	
	Compte findByNum(int numCompte);
	
	void updateCompte(Compte compte);
}
