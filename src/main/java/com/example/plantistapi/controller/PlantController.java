package com.example.plantistapi.controller;

import com.example.plantistapi.model.Plant;
import com.example.plantistapi.service.PlantService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("plant")
@CrossOrigin(origins = "http://localhost:3000")
public class PlantController {

    private final PlantService plantService;

    public PlantController(PlantService plantService) {
        this.plantService = plantService;
    }

    @GetMapping
    List<Plant>  findAll() {
        return plantService.findAll();
    }
}
