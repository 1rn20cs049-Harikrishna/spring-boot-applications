package com.developer.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.developer.model.Tourist;


public interface TouristRepo extends JpaRepository<Tourist, Integer> {

}
