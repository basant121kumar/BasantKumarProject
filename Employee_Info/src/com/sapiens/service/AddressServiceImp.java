package com.sapiens.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapiens.dao.AddressInterface;
import com.sapiens.model.Address;
@Service
public class AddressServiceImp implements AddressService {
	@Autowired
	AddressInterface addressinterface;

	@Override
	public void addser(Address address) {
		// TODO Auto-generated method stub
		addressinterface.addaddress(address);

	}

}
