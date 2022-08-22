package br.com.almeida.parkingcontrolapplication.services;

import org.springframework.stereotype.Service;

import br.com.almeida.parkingcontrolapplication.repositories.ParkingSpotRepository;

@Service
public class ParkingSpotService {

    final ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }

}
