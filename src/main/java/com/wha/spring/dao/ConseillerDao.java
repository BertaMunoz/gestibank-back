package com.wha.spring.dao;

import java.util.List;

import org.hibernate.Query;
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

	public void updateConseiller(int mle) {
		//persist(conseiller);
		Query q =  getSession().createQuery("UPDATE `conseiller` SET `EMAIL`=?,`NOM`=?,`PRENOM`=?,`TEL`=?,`adresse_id`=? WHERE c.mle=:mle");
		q.setParameter("mle", mle);
		
		q.executeUpdate();
			
	}

	public Conseiller findByMle(int mle) {
		return (Conseiller) getSession().get(Conseiller.class, mle);
	}

	public void deleteConseillerByMle(int mle) {
		/*Conseiller con = (Conseiller) getSession().get(Conseiller.class, mle); 
			delete(con);
			*/
		Query q =  getSession().createQuery("DELETE FROM Conseiller c WHERE c.mle=:mle");
		q.setParameter("mle", mle);
		q.executeUpdate();
			
	}

}