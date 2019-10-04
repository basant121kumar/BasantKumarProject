package com.sapiens.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sapiens.model.Address;
@Repository
@Transactional
public class AddressInterfaceImp implements AddressInterface{

	@Autowired
	SessionFactory sessionfactory;
	@Override
	public void addaddress(Address address) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession().save(address);		
	}

}
