package com.wha.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wha.spring.idao.IOperationDao;
import com.wha.spring.iservice.IOperationService;
import com.wha.spring.model.Operation;

@Service("operationService")
public class OperationServiceImpl implements IOperationService {

	@Autowired
	private IOperationDao dao;
	
	public void saveOperation(Operation operation) {
		dao.saveOperation(operation);
	}

	public List<Operation> findAllOperation() {
		return dao.findAllOperation();
	}
}
