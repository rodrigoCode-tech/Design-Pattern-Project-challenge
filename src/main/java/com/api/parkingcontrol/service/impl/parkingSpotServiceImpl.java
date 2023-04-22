package com.api.parkingcontrol.service.impl;

import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repository.parkingSpotRepository;
import com.api.parkingcontrol.service.parkingSpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;
import java.util.UUID;

@Service
public class parkingSpotServiceImpl implements parkingSpotService {

    @Autowired
    private parkingSpotRepository repository;

    @Transactional
    @Override
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
        return repository.save(parkingSpotModel);
    }

    @Override
    public boolean existsByLicensePlateCar(String licensePlateCar) {
        return repository.existsByLicensePlateCar(licensePlateCar);
    }

    @Override
    public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
        return repository.existsByParkingSpotNumber(parkingSpotNumber);
    }

    @Override
    public boolean existsByApartmentAndBlock(String apartment, String block) {
        return repository.existsByApartmentAndBlock(apartment, block);
    }

    @Override
    public Page<ParkingSpotModel> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Page<ParkingSpotModel> findByName(String licensePlateCar, Pageable pageable) {
        licensePlateCar = licensePlateCar.isEmpty() ? null : licensePlateCar;
        return repository.findByName(licensePlateCar, pageable);
    }

    @Override
    public Optional<ParkingSpotModel> findById(UUID id) {
        return repository.findById(id);
    }

    @Override
    public void delete(ParkingSpotModel parkingSpotModel) {
        repository.delete(parkingSpotModel);
    }
}
