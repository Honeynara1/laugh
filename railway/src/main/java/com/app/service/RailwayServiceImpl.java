package com.app.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dto.ApiResponse;
import com.app.dto.RailIdDto;
import com.app.dto.RailwayRequestDto;
import com.app.dto.RailwayResponseDto;
import com.app.entity.Railway;
import com.app.exception_handler.CustomException;
import com.app.repository.RailwayRepository;

@Service
@Transactional
public class RailwayServiceImpl implements RailwayService {

	@Autowired
	private RailwayRepository railRepo;

	@Autowired
	private ModelMapper mapper;

	@Override
	public ApiResponse addTrain(RailwayRequestDto railDto) {
		Railway r = new Railway(railDto.getRailwayName(), railDto.getStart_time(), railDto.getEnd_time(),
				railDto.getSource(), railDto.getDestination(), railDto.getDistance(), railDto.getFrequency(),
				railDto.getCatagory());
		if(r.getStart_time().isBefore(r.getEnd_time())){
			railRepo.save(r);
			return new ApiResponse("new Rail added");
		}
		return new ApiResponse("Train not added");
		
	}

	@Override
	public List<RailwayResponseDto> getAllTrains() {
		List<RailwayResponseDto> dto = new ArrayList<>();
		railRepo.findAll().forEach((rail) -> {
			dto.add(mapper.map(rail, RailwayResponseDto.class));
		});
		return dto;
	}

	@Override
	public ApiResponse deleteTain(RailIdDto railDto) {
		Railway r = railRepo.findById(railDto.getId()).orElseThrow(() -> new CustomException("Rail not found"));
		railRepo.delete(r);
		return new ApiResponse("train deleted");
	}

	@Override
	public List<RailwayResponseDto> getByCatagory(RailwayRequestDto railDto) {
		List<Railway> r = railRepo.findByCatagory(railDto.getCatagory());
		List<RailwayResponseDto> dto = new ArrayList<>();
		r.forEach((rail)->{
			dto.add(mapper.map(rail, RailwayResponseDto.class));
		});
		return dto;
	}

}
