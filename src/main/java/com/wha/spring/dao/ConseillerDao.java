package com.wha.spring.dao;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.wha.spring.idao.IConseiller;
import com.wha.spring.model.Conseiller;

@Repository("conseillerDao")
public class ConseillerDao extends AbstractDao implements IConseiller{

	public void saveConseiller(Conseiller conseiller) {
		save(conseiller);		
	}

	public List<Conseiller> findAllConseiller() {
		return getSession().createQuery("Select c FROM Conseiller c").list();
	}

	public void updateConseiller(Conseiller conseiller) {
		persist(conseiller);
		
	}

	public Conseiller findByMle(int mle) {
		return (Conseiller) getSession().get(Conseiller.class, mle);
	}

	public void deleteConseillerByMle(int mle) {
		Conseiller con = (Conseiller) getSession().get(Conseiller.class, mle); 
			delete(con);
			System.out.println("ou la");
			
	}

}