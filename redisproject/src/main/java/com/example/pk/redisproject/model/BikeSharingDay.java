package com.example.pk.redisproject.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import javax.persistence.Index;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
@EnableJpaRepositories
@NoArgsConstructor
@RedisHash("BikeRentingByHours")
public class BikeSharingDay implements Serializable {

        @Id
        @Indexed
        private Long instant;
        private Date dteday;
        private int season;
        private int yr;
        private int mnth;
        private int hr;
        private int holiday;
        private int weekday;
        private int workingday;
        private int weathersit;
        private float temp;
        private float atemp;
        private float hum;
        private float windspeed;
        private int casual;
        private int registered;
        private int cnt;

}
