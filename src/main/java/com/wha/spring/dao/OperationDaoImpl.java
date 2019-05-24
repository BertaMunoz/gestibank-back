package com.wha.spring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.wha.spring.idao.IOperationDao;
import com.wha.spring.model.Operation;

@Repository("operationDao")
public class OperationDaoImpl extends AbstractDao implements IOperationDao {

	public void saveOperation(Operation operation) {
		save(operation);
	}

	public List<Operation> findAllOperation() {
		return (List<Operation>) getSession().createQuery("FROM Operation").list();
	}
}
