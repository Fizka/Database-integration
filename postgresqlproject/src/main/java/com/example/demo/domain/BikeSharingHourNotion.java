package com.example.demo.domain;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Getter
@ToString
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BikeSharingHourNotion implements Serializable {

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
