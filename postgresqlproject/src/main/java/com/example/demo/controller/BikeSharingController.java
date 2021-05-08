package com.example.demo.controller;

import com.example.demo.domain.Bike;
import com.example.demo.repository.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/postgresql/bike")
public class BikeSharingController {

    BikeRepository bikeRepository;

    @Autowired
    public BikeSharingController(BikeRepository bikeRepository) {
        this.bikeRepository = bikeRepository;
    }

    @GetMapping()
    public ResponseEntity getAllBikeSharingDays() {
        List<Bike> bike = new ArrayList<>();
        bikeRepository.findAll().forEach(bike::add);
        return ResponseEntity.ok(bike);
    }

    @PostMapping()
    public ResponseEntity postBikeSharingDay(@RequestBody Bike bike) {
        return ResponseEntity.ok(bikeRepository.save(bike));
    }

    @PostMapping("/all")
    public ResponseEntity postListBikeSharingDay(@RequestBody List<Bike> bike) {
        return ResponseEntity.ok(bikeRepository.saveAll(bike));
    }
}
