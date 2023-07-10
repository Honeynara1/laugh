package com.app.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.app.entity.Catagory;








public class RailwayRequestDto {
	
	@NotBlank(message = "name cannot be blank")
	private String railwayName;
	private LocalDateTime start_time;
	private LocalDateTime end_time;
	@NotBlank(message = "source cannot be blank")
	private String source;
	@NotBlank(message = "destination cannot be blank")
	private String destination;
	@NotNull(message = "distance cannot be null")
	private double distance;
	@NotNull
	private double frequency;
	private Catagory catagory;
	public RailwayRequestDto() {
		super();
	}

	public RailwayRequestDto(@NotBlank(message = "name cannot be blank") String railwayName, LocalDateTime start_time,
			LocalDateTime end_time, @NotBlank(message = "source cannot be blank") String source,
			@NotBlank(message = "destination cannot be blank") String destination,
			@NotNull(message = "distance cannot be null") double distance, @NotNull double frequency,
			Catagory catagory) {
		super();
		this.railwayName = railwayName;
		this.start_time = start_time;
		this.end_time = end_time;
		this.source = source;
		this.destination = destination;
		this.distance = distance;
		this.frequency = frequency;
		this.catagory = catagory;
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

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
	
	
	
}
