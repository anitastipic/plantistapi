package com.example.plantistapi.repository;

import com.example.plantistapi.model.Plant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlantRepository extends JpaRepository<Plant, Long> {
    List<Plant> findByLatinIgnoreCase(String latin);

    List<Plant> findByLatinContainingIgnoreCase(String latin);
}

