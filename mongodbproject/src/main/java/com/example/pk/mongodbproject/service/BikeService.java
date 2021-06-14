package com.example.pk.mongodbproject.service;

import com.example.pk.mongodbproject.document.Bike;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@Qualifier(value = "BikeService")
public interface BikeService {

    public List<Bike> avg(Date dteday);
}
