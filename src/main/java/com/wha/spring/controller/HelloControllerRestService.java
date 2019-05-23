package com.wha.spring.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wha.spring.iservice.ClientService;
import com.wha.spring.model.Client;

@RestController
@RequestMapping(value = "/client")
public class HelloControllerRestService {

	@Autowired
	ClientService service;
	
	//@Autowired
	//AdressService adrService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String helloWorld() {
		return "bienvenue";
	}
	

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Client> getClient(@PathVariable int id){
		Client resultat = service.findById(id);
		System.out.println(resultat);
		return new ResponseEntity<Client>(resultat, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getALL", method = RequestMethod.GET)
	public ResponseEntity<List<Client>> getAllClient(){
		List<Client> resultat = service.findAllClients();
		System.out.println(resultat);
		return new ResponseEntity<List<Client>>(resultat, HttpStatus.OK);
	}
	


	@RequestMapping(value = "create", method = RequestMethod.POST)
	public Client createClient(@RequestBody Client clt) {
		service.saveClient(clt);
		return clt;
	}
}



