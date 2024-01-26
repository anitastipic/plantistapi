package com.example.plantistapi.service;

import com.example.plantistapi.model.Plant;
import com.example.plantistapi.runner.PlantDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;
import java.net.URISyntaxException;

@Service
public class ApiPlantService {

    @Value("${api.key}")
    private String apiKey;

    @Value("${api.url}")
    private String apiUrl;

    @Value("${api.headerfirst}")
    private String headerFirst;

    @Value("${api.headersecond}")
    private String headerSecond;

    @Value("${api.host}")
    private String apiHost;
    public String fetchPlants() throws IOException, InterruptedException, URISyntaxException {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(apiUrl))
                .header(headerFirst, apiKey)
                .header(headerSecond, apiHost)
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response);
        return response.body();
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
