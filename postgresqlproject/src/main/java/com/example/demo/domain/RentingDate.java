package com.example.demo.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "RentingDate")
public class RentingDate implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idRentingDate")
    private Long idRentingDate;
    @Column(name = "dteday")
    @Temporal(TemporalType.DATE)
    private Date dteday;
    @Column(name = "season")
    private int season;
    @Column(name = "yr")
    private int yr;
    @Column(name = "mnth")
    private int mnth;
    @Column(name = "holiday")
    private int holiday;
    @Column(name = "weekday")
    private int weekday;
    @Column(name = "workingday")
    private int workingday;

    public RentingDate(Date dteday, int season, int yr, int mnth, int holiday, int weekday, int workingday) {
        this.dteday = dteday;
        this.season = season;
        this.yr = yr;
        this.mnth = mnth;
        this.holiday = holiday;
        this.weekday = weekday;
        this.workingday = workingday;
    }
}
