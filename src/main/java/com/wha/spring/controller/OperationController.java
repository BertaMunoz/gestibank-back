package com.wha.spring.controller;

import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wha.spring.model.Operation;
import com.wha.spring.service.OperationServiceImpl;

@RestController
@RequestMapping(value = "/operation")
public class OperationController {
	
	@Autowired
	OperationServiceImpl service;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String display() {
		return "index";
	}
	
	@RequestMapping(value = "/getAll", method=RequestMethod.GET)
	public ResponseEntity<List<Operation>> getAllOperation(){
		List<Operation> result = service.findAllOperation();
		System.out.println(result);
		return new ResponseEntity<List<Operation>>(result, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public Operation createOperation(@RequestBody Operation operation){
		service.saveOperation(operation);
		return operation;
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public ResponseEntity<Operation> insert(){
		Operation op1 = new Operation();
		op1.setDateOp(new GregorianCalendar(2010, 05, 12));
		op1.setTypeOp('D');
		op1.setLibelleOp("Carte Bancaire");
		op1.setMontantOpDebit(20.00);
		service.saveOperation(op1);
		return new ResponseEntity<Operation>(op1, HttpStatus.OK);
	}

}
