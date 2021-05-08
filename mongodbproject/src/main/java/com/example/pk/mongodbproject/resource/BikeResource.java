package com.example.pk.mongodbproject.resource;

import com.example.pk.mongodbproject.document.Bike;
import com.example.pk.mongodbproject.repository.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/mongodb/bikesharing")
public class BikeResource {

    private final BikeRepository bikeRepository;

    @Autowired
    public BikeResource(BikeRepository bikeRepository) {
        this.bikeRepository = bikeRepository;
    }

    @GetMapping("/all")
    public List<Bike> getAllBikesharingInfo() {
        return bikeRepository.findAll();
    }

    @PostMapping()
    public ResponseEntity postBikeSharingDay(@RequestBody Bike bike) {
        return ResponseEntity.ok(bikeRepository.save(bike));
    }

    @PostMapping("/list")
    public ResponseEntity postListBikeSharingDay(@RequestBody List<Bike> bike) {
        return ResponseEntity.ok(bikeRepository.saveAll(bike));
    }
}
