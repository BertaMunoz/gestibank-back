package com.wha.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping(value = "/employee", method = RequestMethod.GET)

public class HelloControllerRestService {

	@Autowired
	EmployeeService service;
	
	@Autowired
	AdressService adrService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String helloWorld() {
		return "bienvenue";
	}
	

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Employee> getEmployee(@PathVariable Long id){
		List Employee> resultat = service.findById(id);
		System.out.println(resultat);
		return new ResponseEntity<Employee>(resultat, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Employee> getAAEmployee(@PathVariable Long id){
		Employee resultat = service.findById(id);
		System.out.println(resultat);
		return new ResponseEntity<Employee>(resultat, HttpStatus.OK);
	}

	@RequestMapping(value = "create", method = RequestMethod.POST)
	public Employee createEmployee(@RequestBody Employee emp) {
		service.saveEmployee(emp);
		return emp;
	}
}
