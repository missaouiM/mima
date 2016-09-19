package com.missaoui.spring.dao;

import com.missaoui.spring.model.Client;

public interface ClientDao {
	
	void saveClient(Client client);
	boolean isValidClient(String email,String password);

}
