package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.RailIdDto;
import com.app.dto.RailwayRequestDto;
import com.app.entity.Catagory;
import com.app.service.RailwayService;

@RestController
@RequestMapping("/rail")
public class RailController {

	@Autowired
	private RailwayService railServ;
	
	@GetMapping
	public ResponseEntity<?> getAllTrains(){
		return ResponseEntity.status(HttpStatus.OK).body(railServ.getAllTrains());
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> addTrain(@RequestBody RailwayRequestDto dto){
		return ResponseEntity.status(HttpStatus.OK).body(railServ.addTrain(dto));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteTrain(@PathVariable Long id)
	{
		RailIdDto dto = new RailIdDto(id);
		return ResponseEntity.status(HttpStatus.OK).body(railServ.deleteTain(dto));
	}
	
	@GetMapping("/{catagory}")
	public ResponseEntity<?> getBycat(@PathVariable Catagory catagory){
		RailwayRequestDto dto = new RailwayRequestDto();
		dto.setCatagory(catagory);
		return ResponseEntity.status(HttpStatus.OK).body(railServ.getByCatagory(dto));
	}
	
	
	
}
