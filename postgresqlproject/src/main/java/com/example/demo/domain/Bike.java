package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "bikeday")
public class Bike implements Serializable {

    @Id
    private Integer id;

    @Column(name = "dteday")
    private Date dteday;

    @Column(name = "season")
    private int season;

    @Column(name = "yr")
    private int yr;

    @Column(name = "mnth")
    private int mnth;

    @Column(name = "hr")
    private int hr;

    @Column(name = "weekday")
    private String weekday;
}
