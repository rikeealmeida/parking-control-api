package br.com.almeida.parkingcontrolapplication.dtos;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ParkingSpotDto {
    @NotEmpty
    private String parkingSpotNumber;
    @NotEmpty
    @Size(max = 7)
    private String licensePlateCar;
    @NotEmpty
    private String brandCar;
    @NotEmpty
    private String modelCar;
    @NotEmpty
    private String colorCar;
    @NotEmpty
    private String responsibleName;
    @NotEmpty
    private String apartment;
    @NotEmpty
    private String block;
}
