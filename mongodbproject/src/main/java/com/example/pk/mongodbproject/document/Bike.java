package com.example.pk.mongodbproject.document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@Document
@NoArgsConstructor
public class Bike {

    @Id
    private Integer id;
    private Date dteday;
    private int season;
    private int yr;
    private int mnth;
    private int hr;
    private String weekday;


}
