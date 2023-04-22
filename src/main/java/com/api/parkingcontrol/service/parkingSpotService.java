package com.api.parkingcontrol.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repository.parkingSpotRepository;

public interface parkingSpotService {

	@Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel);

	public  boolean existsByLicensePlateCar(String licensePlateCar);
	public  boolean existsByParkingSpotNumber(String parkingSpotNumber);

	public  boolean existsByApartmentAndBlock(String apartment, String block);

	public Page<ParkingSpotModel> findAll(Pageable pageable);
	
	public Page<ParkingSpotModel> findByName(String licensePlateCar,Pageable pageable);
	
	
	public Optional<ParkingSpotModel> findById(UUID id);

	public  void delete(ParkingSpotModel parkingSpotModel);
	
	
	
}
