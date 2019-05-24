package com.wha.spring.iservice;


import java.util.List;

import com.wha.spring.model.Client;


public interface ClientService {

    void saveClient(Client client);
	
	List<Client> findAllClients();
	
	void deleteClientById(int id);
	
	Client findById(int id);
	
	void updateClient(int id, Client client);

}

