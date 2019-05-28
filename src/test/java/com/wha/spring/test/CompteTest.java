package com.wha.spring.test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.wha.spring.config.DataConfig;
import com.wha.spring.config.WebConfig;
import com.wha.spring.iservice.ICompteService;
import com.wha.spring.model.Compte; 




@WebAppConfiguration 
@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(classes = { WebConfig.class, DataConfig.class }) 
public class CompteTest {
	@Autowired 
	ICompteService cpt; 
	
	@Test 
	@Transactional 
	@Rollback(true) 
	public void test() { 
		assertThat(cpt, instanceOf(ICompteService.class)); 
		assertThat(cpt.findByNum(1), instanceOf(Compte.class)); 
		//assertThat(cpt.deleteCompteByNum(1), instanceOf(Compte.class)); 
		assertThat(cpt.findAllCompte(), instanceOf(Compte.class)); 
		//assertThat(cpt.saveCompte(null), instanceOf(Compte.class)); 
		//assertThat(cpt.updateCompte(1, null), instanceOf(Compte.class)); 
	}


}
