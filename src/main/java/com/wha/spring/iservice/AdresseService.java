package com.wha.spring.iservice;

import java.util.List;

import com.wha.spring.model.Adresse;



public interface AdresseService {

    void saveAdresse(Adresse adresse);
	
	List<Adresse> findAllAdresses();
	
	void deleteAdresseById(int id);
	
	Adresse findById(int id);
	
	void updateAdresse (Adresse adresse);

}
