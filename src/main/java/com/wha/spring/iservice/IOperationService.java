package com.wha.spring.iservice;

import java.util.List;

import com.wha.spring.model.Operation;

public interface IOperationService {
	void saveOperation(Operation operation);
	
	List<Operation> findAllOperation();
}
