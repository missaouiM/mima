package com.missaoui.spring.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.missaoui.spring.model.Client;


@Repository("clientDao")
public class ClientDaoImpl extends AbstractDao implements ClientDao {

	@Override
	public void saveClient(Client client) {
		persist(client);

	}

	@Override
	public boolean isValidClient(String email, String password) {
		Criteria criteria = getSession().createCriteria(Client.class);
		criteria.add(Restrictions.eq("email",email));
		criteria.add(Restrictions.eq("password", password));
		Client client = (Client) criteria.uniqueResult();
		return client != null;
	}

}
