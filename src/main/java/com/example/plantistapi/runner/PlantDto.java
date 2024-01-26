package com.example.plantistapi.runner;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;

public class PlantDto {
    private int id;
    private String latin;
    private String family;
    private String category;
    private String origin;
    private String climate;
    private TemperatureDto tempmax;
    private TemperatureDto tempmin;
    private String ideallight;
    private String toleratedlight;
    private String watering;
    @JsonDeserialize(using = ListDeserializer.class)
    private List<String> diseases;
    @JsonDeserialize(using = ListDeserializer.class)
    private List<String> common;

    @JsonDeserialize(using = ListDeserializer.class)
    private List<String> use;

    @JsonDeserialize(using = ListDeserializer.class)
    private List<String> insects;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLatin() {
        return latin;
    }

    public void setLatin(String latin) {
        this.latin = latin;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public TemperatureDto getTempmax() {
        return tempmax;
    }

    public void setTempmax(TemperatureDto tempmax) {
        this.tempmax = tempmax;
    }

    public TemperatureDto getTempmin() {
        return tempmin;
    }

    public void setTempmin(TemperatureDto tempmin) {
        this.tempmin = tempmin;
    }

    public String getIdeallight() {
        return ideallight;
    }

    public void setIdeallight(String ideallight) {
        this.ideallight = ideallight;
    }

    public String getToleratedlight() {
        return toleratedlight;
    }

    public void setToleratedlight(String toleratedlight) {
        this.toleratedlight = toleratedlight;
    }

    public String getWatering() {
        return watering;
    }

    public void setWatering(String watering) {
        this.watering = watering;
    }


    public List<String> getDiseases() {
        return diseases;
    }

    public void setDiseases(List<String> diseases) {
        this.diseases = diseases;
    }

    public List<String> getCommon() {
        return common;
    }

    public void setCommon(List<String> common) {
        this.common = common;
    }

    public List<String> getUse() {
        return use;
    }

    public void setUse(List<String> use) {
        this.use = use;
    }

    public List<String> getInsects() {
        return insects;
    }

    public void setInsects(List<String> insects) {
        this.insects = insects;
    }
}