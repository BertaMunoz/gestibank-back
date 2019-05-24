package com.wha.spring.idao;

import java.util.List;

import com.wha.spring.model.Operation;

public interface IOperationDao {
	void saveOperation(Operation operation);
	
	List<Operation> findAllOperation();
}
