package com.example.pk.redisproject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("BikeDay")
public class BikeSharingDay {

        @Id
        private Integer id;
        private Date dteday;
        private int season;
        private int yr;
        private int mnth;
        private int hr;
        private String weekday;

}
