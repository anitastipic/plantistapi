package com.example.plantistapi.service;

import com.example.plantistapi.model.Plant;
import com.example.plantistapi.repository.PlantRepository;
import com.example.plantistapi.runner.PlantDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class PlantService {
    private final PlantRepository plantRepository;

    public PlantService(PlantRepository plantRepository) {
        this.plantRepository = plantRepository;
    }

    @Transactional
    public Plant save(Plant plant) {
        return plantRepository.save(plant);
    }

    private List<String> convertInsectsStringToList(String insects) {
        if (insects == null || insects.isEmpty() || insects.equals("N/A")) {
            return Collections.emptyList();
        } else {
            return Arrays.asList(insects.split(",")); // Assuming comma-separated values
        }
    }

    public Plant convertToPlantEntity(PlantDto plantDto) {
        Plant plant = new Plant();

        plant.setCategory(plantDto.getCategory());
        plant.setClimate(plantDto.getClimate());
        plant.setFamily(plantDto.getFamily());
        plant.setDiseases(plantDto.getDiseases());
        plant.setIdeallight(plantDto.getIdeallight());
        plant.setLatin(plantDto.getLatin());
        plant.setOrigin(plantDto.getOrigin());
        plant.setTempmaxCelsius(plantDto.getTempmax().getCelsius());
        plant.setTempmaxFahrenheit(plantDto.getTempmax().getFahrenheit());
        plant.setTempminCelsius(plantDto.getTempmin().getCelsius());
        plant.setTempminFahrenheit(plantDto.getTempmin().getFahrenheit());
        plant.setToleratedlight(plantDto.getToleratedlight());
        plant.setCommon(plantDto.getCommon());
        plant.setUse(plantDto.getUse());
        plant.setInsects(plantDto.getInsects());
        plant.setWatering(plantDto.getWatering());
        return plant;
    }


}
