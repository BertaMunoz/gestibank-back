package com.wha.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wha.spring.idao.ICompteDao;
import com.wha.spring.iservice.ICompteService;
import com.wha.spring.model.Compte;

@Service("compteService")
public class CompteServiceImpl implements ICompteService {

	@Autowired
	private ICompteDao dao;
	
	public void saveCompte(Compte compte) {
		dao.saveCompte(compte);
	}

	public List<Compte> findAllCompte() {
		return dao.findAllCompte();
	}

	public void deleteCompteByNum(int numCompte) {
		dao.deleteCompteByNum(numCompte);
	}

	public Compte findByNum(int numCompte) {
		return dao.findByNum(numCompte);
	}

	public void updateCompte(Compte compte) {
		dao.updateCompte(compte);
	}

}
