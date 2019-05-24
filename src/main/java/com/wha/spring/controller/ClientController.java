package com.wha.spring.controller;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wha.spring.iservice.AdresseService;
import com.wha.spring.iservice.ClientService;
import com.wha.spring.iservice.NotificationService;
import com.wha.spring.model.Adresse;
import com.wha.spring.model.Client;
import com.wha.spring.model.Compte;
import com.wha.spring.model.Notification;
import com.wha.spring.service.ClientserviceImpl;

@RestController
@RequestMapping(value = "/client")
public class ClientController {

	@Autowired
	ClientserviceImpl service;
	
	@Autowired
	AdresseService adrService;
	
	@Autowired
	NotificationService notifService;
	
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
	
	@RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
	public String deleteClient(@PathVariable int id) {
		service.deleteClientById(id);
		return "le client n° : " + id + " est bien supprimé";
	}

	@RequestMapping(value = "create", method = RequestMethod.POST)
	public Client createClient(@RequestBody Client clt) {
		service.saveClient(clt);
		return clt;
	}
	
	@RequestMapping(value = "update/{id}", method = RequestMethod.PUT)
	public Client updateClient(@PathVariable("id") int id, @RequestBody  Client clt) {
		service.updateClient(id, clt);
		return clt;
	}
	/*@RequestMapping(value = "/update/{numCompte}", method = RequestMethod.PUT)
	public String updateCompte(@PathVariable("numCompte") int numCompte, @RequestBody Compte compte) {  
		service.updateCompte(numCompte, compte);  
		return "redirect: /getAll";
	}*/
	
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public ResponseEntity<Client> insert(){
		
		Client client1 = new Client();
		Adresse adresse1 = new Adresse();
		Notification notif1 = new Notification();
		List<Notification> l = new ArrayList<Notification>();
		l.add(notif1);
		
		client1.setNom("Machin");
		client1.setPrenom("Bob");
		client1.setEmail("BobMachin@gmail.com");
		client1.setPseudo("Bobmach");
		client1.setSituation("célibataire");
		client1.setNbrEnfant(4);
		client1.setTel("06010030405");
		client1.setAdresse(adresse1);
		client1.setNotifications(l);
		service.saveClient(client1);
		
		adresse1.setNumero(111);
		adresse1.setRue("de Seze");
		adresse1.setCp("69006");
		adresse1.setVille("Lyon");
		adrService.saveAdresse(adresse1);
		
		notif1.setLibelle("verification");
		notif1.setEtat(true);
		//notif1.setDate(new LocalDate(2010-12-11));
		notifService.saveNotification(notif1);
		
		/*Client client2 = new Client();
		
		client2.setNom("Truc");
		client2.setPrenom("Bill");
		client2.setEmail("BillTruc@gmail.com");
		client2.setPseudo("BillTruc");
		client2.setSituation("marié");
		client2.setNbrEnfant(1);
		client2.setTel("0645879856");
		service.saveCompte(client2);*/
		
	return new ResponseEntity<Client>(client1, HttpStatus.OK);
	}

}







