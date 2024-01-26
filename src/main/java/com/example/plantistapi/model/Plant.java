package com.example.plantistapi.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Plant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "plant_id")
    private long id;
    private String latin;
    private String family;
    @ElementCollection
    private List<String> common = new ArrayList<>();
    private String category;
    private String origin;
    private String climate;
    private double tempmaxCelsius;
    private double tempmaxFahrenheit;
    private double tempminCelsius;
    private double tempminFahrenheit;
    private String ideallight;
    private String toleratedlight;
    private String watering;
    @ElementCollection
    private List<String> diseases = new ArrayList<>();
    @ElementCollection
    private List<String> use = new ArrayList<>();
    @ElementCollection
    private List<String> insects = new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public List<String> getCommon() {
        return common;
    }

    public void setCommon(List<String> common) {
        this.common = common;
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

    public double getTempmaxCelsius() {
        return tempmaxCelsius;
    }

    public void setTempmaxCelsius(double tempmaxCelsius) {
        this.tempmaxCelsius = tempmaxCelsius;
    }

    public double getTempmaxFahrenheit() {
        return tempmaxFahrenheit;
    }

    public void setTempmaxFahrenheit(double tempmaxFahrenheit) {
        this.tempmaxFahrenheit = tempmaxFahrenheit;
    }

    public double getTempminCelsius() {
        return tempminCelsius;
    }

    public void setTempminCelsius(double tempminCelsius) {
        this.tempminCelsius = tempminCelsius;
    }

    public double getTempminFahrenheit() {
        return tempminFahrenheit;
    }

    public void setTempminFahrenheit(double tempminFahrenheit) {
        this.tempminFahrenheit = tempminFahrenheit;
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
