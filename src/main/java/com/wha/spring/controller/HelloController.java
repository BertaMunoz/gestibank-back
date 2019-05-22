package com.wha.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping(value = "/bla")
public class HelloController {

	@Autowired
	// ClassInjecte class ;

	//@RequestMapping(value = "/HelloWorldController", method = RequestMethod.GET)
	/*public String display() {
		// traitement à effectué par la méthode du service
		return "index";
	}*/
	@RequestMapping(value = "/HelloWorldController", method = RequestMethod.GET)
	public String authentification() {
		// traitement à effectué par la méthode du service
		
		if(Math.random() >0.5) 
			return "success";
	
			return "failure";
		
	}
}
