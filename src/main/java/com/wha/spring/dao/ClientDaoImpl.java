package com.wha.spring.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.wha.spring.idao.ClientDao;
import com.wha.spring.model.Client;



@Repository("clientDao")
public class ClientDaoImpl extends AbstractDao implements ClientDao{

	public void saveClient(Client client) {
		persist(client);
	}
	
	public void updateClient(Client client) {
		getSession().update(client);
	}
	
	public List<Client>findAllClients(){
		return null;
	}
	
	public void deleteClientById(int id) {
		
	}
	

	public List<Client> findAllClient() {
		
		return getSession().createQuery("From Client").list();
	}
	public Client findById(int id){
		return (Client) getSession().get(Client.class, id);
	}



	

}
