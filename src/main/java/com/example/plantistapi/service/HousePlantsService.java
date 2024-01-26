package com.example.plantistapi.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;
import java.net.URISyntaxException;

@Service
public class HousePlantsService {

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
}
