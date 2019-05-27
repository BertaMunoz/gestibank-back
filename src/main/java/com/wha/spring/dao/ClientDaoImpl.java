package com.wha.spring.dao;


import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.wha.spring.idao.ClientDao;
import com.wha.spring.model.Client;



@Repository("clientDao")
public class ClientDaoImpl extends AbstractDao implements ClientDao{

	public void saveClient(Client client) {
		save(client);
	}
	
	public void createClient(Client client) {
		save(client);
	}	
	public List<Client>findAllClients(){
		return null;
	}
	
	public void deleteClientById(int id) {
		getSession().delete(id);
	}
	
	public List<Client> findAllClient() {
		
		return getSession().createQuery("From Client").list();
	}
	public Client findById(int id){
		return (Client) getSession().get(Client.class, id);
	}

	public void updateClient(int id, Client client) {
//		Query q = getSession().createQuery(
//		"UPDATE Client c "
//		+ "SET nom=:nom, prenom=:prenom, email=:email, nbrEnfants=:nbrEnfants, pseudo=:pseudo, situation=:situation, tel=:tel,  "
//		+ "WHERE c.id=:id");
//		q.setParameter("nom", client.getNom());
//		q.setParameter("prenom", client.getPrenom());
//		q.setParameter("nbrEnfants",client.getNbrEnfant());
//		q.setParameter("email", client.getEmail());
//		q.setParameter("pseudo",client.getPseudo());
//		q.setParameter("situation", client.getSituation());
//		q.setParameter("tel", client.getTel());
//		q.setParameter("id", id);
//		
//		
//		q.executeUpdate();
		Session s = getSession();
		s.merge(client);
		s.flush();
	}

}
