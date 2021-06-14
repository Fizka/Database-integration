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
@Table(name = "RentingHours")
public class RentingHours implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idRentingHours")
    private Long idRentingHours;
    @Column(name = "hr")
    private int hr;

    @OneToOne(
            fetch = FetchType.LAZY,
            optional = false
    )
    @JoinColumn(name = "date_id", nullable = true)
    private RentingDate rentingDate;

    @OneToOne(
            fetch = FetchType.LAZY,
            optional = false
    )
    @JoinColumn(name = "user_id", nullable = true)
    private RentingUser rentingUser;

    @OneToOne(
            fetch = FetchType.LAZY,
            optional = false
    )
    @JoinColumn(name = "weather_id", nullable = true)
    private WeatherConditions weatherConditions;

    public RentingHours(int hr, RentingUser idRentingUser, WeatherConditions idWeatherConditions, RentingDate idRentingDate) {
        this.hr = hr;
        this.rentingUser = idRentingUser;
        this.weatherConditions = idWeatherConditions;
        this.rentingDate = idRentingDate;
    }
}
