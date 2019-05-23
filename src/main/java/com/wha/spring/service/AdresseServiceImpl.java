package com.wha.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wha.spring.idao.AdresseDao;
import com.wha.spring.iservice.AdresseService;
import com.wha.spring.model.Adresse;


	@Service("adresseService")
	@Transactional
	public class AdresseServiceImpl implements AdresseService{

		
		@Autowired
		private AdresseDao dao;
		
		public void saveAdresse(Adresse adresse) {
			dao.saveAdresse( adresse);
		}
		
		public List<Adresse> findAllAdresses(){
			return dao.findAllAdresses();
		}
		
		public void deleteAdresseById(int id) {
			dao.deleteAdresseById(id);
		}
		
		public Adresse findById(int id) {
			return dao.findById(id);
		}
		
		public void updateAdresse(Adresse adresse) {
			dao.updateAdresse(adresse);
		}

		

		
	}
		

