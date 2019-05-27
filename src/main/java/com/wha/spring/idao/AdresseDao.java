package com.wha.spring.idao;

import java.util.List;

import com.wha.spring.model.Adresse;

public interface AdresseDao {

	void saveAdresse (Adresse adresse);
	
	List<Adresse> findAllAdresses();
			
	void updateAdresse(int id);

	Adresse findById(int id);

	void deleteAdresseById(int id);	
}
