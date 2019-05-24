package com.wha.spring.idao;

import java.util.List;

import com.wha.spring.model.Conseiller;


public interface IConseiller {

void saveConseiller(Conseiller conseiller);
	
	List<Conseiller> findAllConseiller();
	
	void deleteConseillerByMle(int mle);
	
	
	void updateConseiller(int mle);

	Conseiller findByMle(int mle);
}
