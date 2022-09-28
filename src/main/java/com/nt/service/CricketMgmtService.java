package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Cricketer;
import com.nt.repo.ICricketerRepo;

@Service
public class CricketMgmtService implements ICricketMgmtService {

	@Autowired
	private ICricketerRepo repo;
	
	@Override
	public String saveCricketer(Cricketer criketer) {
		// TODO Auto-generated method stub
		return "Cricketer saved with id "+repo.save(criketer).getCricketerId();
	}

}
