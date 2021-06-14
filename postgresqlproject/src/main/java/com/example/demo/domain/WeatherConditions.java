package com.example.demo.domain;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "WeatherConditions")
public class WeatherConditions implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idWeatherConditions")
    private Long idWeatherConditions;
    @Column(name = "weathersit")
    private int weathersit;
    @Column(name = "temp")
    private float temp;
    @Column(name = "atemp")
    private float atemp;
    @Column(name = "hum")
    private float hum;
    @Column(name = "windspeed")
    private float windspeed;

    public WeatherConditions(int weathersit, float temp, float atemp, float hum, float windspeed) {
        this.weathersit = weathersit;
        this.temp = temp;
        this.atemp = atemp;
        this.hum = hum;
        this.windspeed = windspeed;
    }
}
