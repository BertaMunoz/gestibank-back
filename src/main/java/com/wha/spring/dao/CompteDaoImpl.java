package com.wha.spring.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.wha.spring.idao.ICompteDao;
import com.wha.spring.model.Compte;

@Repository("compteDao")
public class CompteDaoImpl extends AbstractDao implements ICompteDao {

	public void saveCompte(Compte compte) {
		save(compte);
	}

	public List<Compte> findAllCompte() {
		return (List<Compte>) getSession().createQuery("FROM Compte").list();
	}

	public void deleteCompteByNum(int numCompte) {
		Query q = getSession().createQuery("DELETE FROM Compte c WHERE c.numCompte=:numCompte");
		q.setParameter("numCompte", numCompte);
		q.executeUpdate();
		/*Compte compte = (Compte) getSession().get(Compte.class, numCompte);
		if(null != compte){
			getSession().delete(compte);
			getSession().flush();
        }*/
	}

	public Compte findByNum(int numCompte) {
		return (Compte) getSession().get(Compte.class, numCompte);
	}

	public void updateCompte(Compte compte) {
		getSession().update(compte);
	}

}
