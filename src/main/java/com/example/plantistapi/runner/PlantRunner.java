package com.example.plantistapi.runner;

import com.example.plantistapi.model.Plant;
import com.example.plantistapi.service.ApiPlantService;
import com.example.plantistapi.service.PlantService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("!dev")
public class PlantRunner {
    @Bean
    CommandLineRunner initializeDbWithPlants(ApiPlantService apiPlantService, PlantService plantService) {
        return args -> {
            ObjectMapper mapper = new ObjectMapper();
            try {
                String jsonPlants = apiPlantService.fetchPlants();

                PlantDto[] plantDtos = mapper.readValue(jsonPlants, PlantDto[].class);
                for (PlantDto plantDto : plantDtos) {
                    Plant plant = apiPlantService.convertToPlantEntity(plantDto);
                    plantService.save(plant);
                }
                System.out.println("Plants saved!");
            } catch (Exception e) {
                e.printStackTrace();
            }

        };
    }
}
