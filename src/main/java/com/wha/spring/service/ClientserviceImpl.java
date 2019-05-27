package com.wha.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wha.spring.idao.ClientDao;
import com.wha.spring.iservice.ClientService;
import com.wha.spring.model.Adresse;
import com.wha.spring.model.Client;

@Service("clientService")
@Transactional
public class ClientserviceImpl implements ClientService{

	
	@Autowired
	private ClientDao dao;
	
	public void saveClient(Client client) {
		dao.saveClient( client);
	}
	
	public List<Client> findAllClients(){
		return dao.findAllClient();
	}
	
	public void deleteClientById(int id) {
		dao.deleteClientById(id);
	}
	
	public Client findById(int id) {
		return dao.findById(id);
	}
	public void updateClient(int id, Client client) {
		dao.updateClient(id, client);
	}
	


}

 
