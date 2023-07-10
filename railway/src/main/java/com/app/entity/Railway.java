package com.app.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Railway extends BaseEntity {
	
	@Column(name="railway_name",length = 20)
	private String railwayName;
	private LocalDateTime start_time;
	private LocalDateTime end_time;
	@Column(length = 20)
	private String source;
	@Column(length = 20)
	private String destination;
	private double distance;
	private double frequency;
	@Enumerated(EnumType.STRING)
	private Catagory catagory;
	
	public Railway() {
		super();
	}

	public Railway(String railwayName,LocalDateTime start_time, LocalDateTime end_time,String source,String destination, double distance,
			double frequency, Catagory catagory) {
		super();
		this.start_time = start_time;
		this.end_time = end_time;
		this.destination = destination;
		this.distance = distance;
		this.frequency = frequency;
		this.catagory = catagory;
		this.railwayName=railwayName;
		this.source=source;
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
	
	

	public String getRailwayName() {
		return railwayName;
	}

	public void setRailwayName(String railwayName) {
		this.railwayName = railwayName;
	}
	
	

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	@Override
	public String toString() {
		return "Railway [railwayName=" + railwayName + ", start_time=" + start_time + ", end_time=" + end_time
				+ ", destination=" + destination + ", distance=" + distance + ", frequency=" + frequency + ", catagory="
				+ catagory + "]";
	}

	
	
	
}
