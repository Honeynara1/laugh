package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Catagory;
import com.app.entity.Railway;

public interface RailwayRepository extends JpaRepository<Railway,Long>{

	List<Railway> findByCatagory(Catagory catagory);
	
}
