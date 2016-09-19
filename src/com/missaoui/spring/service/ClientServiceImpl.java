package com.missaoui.spring.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.missaoui.spring.dao.ClientDao;
import com.missaoui.spring.model.Client;


@Service("clientService")
@Transactional
public class ClientServiceImpl implements ClientService {

	
	@Autowired
	ClientDao clientDao;
	@Override
	public void saveClient(Client client) {
		clientDao.saveClient(client);
		

	}

	@Override
	public boolean isValidClient(String email, String password) {
		
		return clientDao.isValidClient(email, password);
	}

}
