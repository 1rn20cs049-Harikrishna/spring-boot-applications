package com.developer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.developer.dao.TouristRepo;
import com.developer.model.Tourist;

@Service
public class TouristMgmtServiceImpl implements TouristMgmtService{
	
	@Autowired
	TouristRepo touristRepo;

	@Override
	public String registerTourist(Tourist tourist) {
		Integer id = touristRepo.save(tourist).getTid();
		
		return "User enrolled successfuly with id :: " + id;
	}

}
