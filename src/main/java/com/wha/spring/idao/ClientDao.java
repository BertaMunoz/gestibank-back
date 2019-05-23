package com.wha.spring.idao;

import java.util.List;

import com.wha.spring.model.Client;

public interface ClientDao {

	void saveClient(Client client);
	
	List<Client> findAllClient();
			
	void updateClient(Client client);

	Client findById(int id);

	void deleteClientById(int id);	

}