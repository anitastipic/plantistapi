package com.example.plantistapi.service;

import com.example.plantistapi.model.Plant;
import com.example.plantistapi.repository.PlantRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    public List<Plant> findAll() {
        return plantRepository.findAll();
    }
}
