package com.app.dto;

import java.time.LocalDateTime;

import com.app.entity.Catagory;

public class RailwayResponseDto {

	private Long id;
	private String railwayName;
	private LocalDateTime start_time;
	private LocalDateTime end_time;
	private String source;
	private String destination;
	private double distance;
	private double frequency;
	private Catagory catagory;
	public RailwayResponseDto() {
		super();
	}
	public RailwayResponseDto(Long id, String railwayName, LocalDateTime start_time, LocalDateTime end_time,
			String source, String destination, double distance, double frequency, Catagory catagory) {
		super();
		this.id = id;
		this.railwayName = railwayName;
		this.start_time = start_time;
		this.end_time = end_time;
		this.source = source;
		this.destination = destination;
		this.distance = distance;
		this.frequency = frequency;
		this.catagory = catagory;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRailwayName() {
		return railwayName;
	}
	public void setRailwayName(String railwayName) {
		this.railwayName = railwayName;
	}
	public LocalDateTime getStart_time() {
		return start_time;
	}
	public void setStart_time(LocalDateTime start_time) {
		this.start_time = start_time;
	}
	public LocalDateTime getEnd_time() {
		return end_time;
	}
	public void setEnd_time(LocalDateTime end_time) {
		this.end_time = end_time;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public double getFrequency() {
		return frequency;
	}
	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}
	public Catagory getCatagory() {
		return catagory;
	}
	public void setCatagory(Catagory catagory) {
		this.catagory = catagory;
	}
	
	
	
	

}
