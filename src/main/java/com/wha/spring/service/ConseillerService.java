package com.wha.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wha.spring.dao.ConseillerDao;
import com.wha.spring.iservice.IConseillerService;
import com.wha.spring.model.Conseiller;

@Service("conseillerService")
@Transactional
public class ConseillerService implements IConseillerService{

	@Autowired
	private ConseillerDao dao;
	
	public void saveConseiller(Conseiller conseiller) {
		dao.saveConseiller(conseiller);	
	}

	public List<Conseiller> findAllConseiller() {
		return dao.findAllConseiller();
	}

	public void deleteConseillerByMle(int mle) {
		System.out.println("ici");
		dao.deleteConseillerByMle(mle);		
	}

	public Conseiller findByMle(int mle) {
		
		return dao.findByMle(mle);
	}

	public void updateConseiller(Conseiller conseiller) {
		dao.updateConseiller(conseiller);	
	}

}

