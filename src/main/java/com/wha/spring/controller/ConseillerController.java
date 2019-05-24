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

import com.wha.spring.model.Conseiller;
import com.wha.spring.service.ConseillerService;

@RestController
@RequestMapping(value ="/conseiller")
public class ConseillerController {

	@Autowired
	ConseillerService service;
	
	
	@RequestMapping(value="",method = RequestMethod.GET)
	public String helloWorld() {
		return "yo";
	}
	
	@RequestMapping(value = "/{mle}",method = RequestMethod.GET)
	public ResponseEntity<Conseiller> getConseiller(@PathVariable int mle){
		Conseiller res = service.findByMle(mle);
		System.out.println(res);
		return new ResponseEntity<Conseiller>(res,HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getAll",method = RequestMethod.GET)
	public ResponseEntity<List<Conseiller>> getAllConseiller(){
		List<Conseiller> res = service.findAllConseiller();
		System.out.println(res);
		return new ResponseEntity<List<Conseiller>>(res,HttpStatus.OK);
	}
	
	@RequestMapping(value = "/create",method = RequestMethod.POST)
	public Conseiller createConseiller(@RequestBody Conseiller conseiller) {
		service.saveConseiller(conseiller);
		return conseiller;
	}
	
	@RequestMapping(value = "/delete/{mle}",method = RequestMethod.DELETE)
	public String deleteConseiller(@PathVariable int mle) {
		service.deleteConseillerByMle(mle);
		return "le conseiller matricule : " + mle + " est bien supprimé";
	}
	
	@RequestMapping(value = "/update/{mle}",method = RequestMethod.PUT)
	public String updateConseiller(@PathVariable int mle,@RequestBody Conseiller conseiller) {
		service.updateConseiller(mle);
		return "le conseiller matricule : " + mle + " est bien maj" ;
	}
}
