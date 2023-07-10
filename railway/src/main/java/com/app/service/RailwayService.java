package com.app.service;

import java.util.List;

import com.app.dto.ApiResponse;
import com.app.dto.RailIdDto;
import com.app.dto.RailwayRequestDto;
import com.app.dto.RailwayResponseDto;

public interface RailwayService {

	ApiResponse addTrain(RailwayRequestDto railDto);
	List<RailwayResponseDto>  getAllTrains();
	ApiResponse deleteTain(RailIdDto railDto);
    List<RailwayResponseDto> getByCatagory(RailwayRequestDto railDto);
	
}
