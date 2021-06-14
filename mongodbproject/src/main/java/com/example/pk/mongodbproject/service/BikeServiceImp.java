package com.example.pk.mongodbproject.service;

import com.example.pk.mongodbproject.document.Bike;
import com.example.pk.mongodbproject.repository.BikeSharingReportsRepository;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@Slf4j
public class BikeServiceImp implements BikeService{

    @Autowired
    private BikeSharingReportsRepository productRepository;

    @Override
    public List<Bike> avg(Date dteday) {
        return productRepository.avg(dteday);
    }
}
