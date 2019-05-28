package com.wha.spring.test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.wha.spring.config.DataConfig;
import com.wha.spring.config.WebConfig;
import com.wha.spring.iservice.ClientService;
import com.wha.spring.model.Client;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { WebConfig.class, DataConfig.class })
public class ClientTest {
	@Autowired
	ClientService cs;

	@Test
	@Transactional
	@Rollback(true)
	public void test() {
		assertThat(cs, instanceOf(ClientService.class));
		assertThat(cs.findById(1), instanceOf(Client.class));
	}

}
