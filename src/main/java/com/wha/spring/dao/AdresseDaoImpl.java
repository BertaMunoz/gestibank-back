package com.wha.spring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.wha.spring.idao.AdresseDao;
import com.wha.spring.model.Adresse;


@Repository("adresseDao")
public class AdresseDaoImpl extends AbstractDao implements AdresseDao{

	public void saveAdresse(Adresse adresse) {
		save(adresse);
	}
	
	public void updateAdresse(Adresse adresse) {
		getSession().update(adresse);
	}
	
	
	public void deleteAdresseById(int id) {
		
	}
	

	public List<Adresse> findAllAdresses() {
		
		return getSession().createQuery("From Adresse").list();
	}
	public Adresse findById(int id){
		return (Adresse) getSession().get(Adresse.class, id);
	}

	public void updateAdresse(int id) {
		// TODO Auto-generated method stub
		
	}

}
