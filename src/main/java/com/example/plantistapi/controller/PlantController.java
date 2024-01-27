package com.example.plantistapi.controller;

import com.example.plantistapi.model.Plant;
import com.example.plantistapi.service.PlantService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("plant")
public class PlantController {

    private final PlantService plantService;

    public PlantController(PlantService plantService) {
        this.plantService = plantService;
    }

    @GetMapping
    List<Plant>  findAll() {
        return plantService.findAll();
    }

    @RequestMapping(value = "/latin/{latin}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    List<Plant> findByName(@PathVariable String latin) {
        return plantService.findByLatinIgnoreCase(latin);
    }

    @RequestMapping(value = "/search/{latin}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Plant> searchPlants(@PathVariable String latin) {
        return plantService.findByLatinContainingIgnoreCase(latin);
    }
}
