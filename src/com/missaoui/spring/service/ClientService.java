package com.missaoui.spring.service;

import com.missaoui.spring.model.Client;

public interface ClientService {
	void saveClient(Client client);
	boolean isValidClient(String email,String password);

}
