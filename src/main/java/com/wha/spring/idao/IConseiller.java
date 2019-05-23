package com.wha.spring.idao;

import java.util.List;

import com.wha.spring.model.Conseiller;


public interface IConseiller {

void saveConseiller(Conseiller conseiller);
	
	List<Conseiller> findAllConseiller();
	
	void deleteConseillerByMle(int mle);
	
	
	void updateConseiller(Conseiller conseiller);

	Conseiller findByMle(int mle);
}
