package com.example.pk.redisproject.controller;

import com.example.pk.redisproject.model.BikeSharingDay;
import com.example.pk.redisproject.repository.BikeSharingDayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/redis/bakesharing")
public class BikeSharingController {

    BikeSharingDayRepository bikeSharingDayRepository;

    @Autowired
    public BikeSharingController(BikeSharingDayRepository bikeSharingDayRepository) {
        this.bikeSharingDayRepository = bikeSharingDayRepository;
    }

    @PostMapping(value = "")
    public ResponseEntity postBikeSharingDay(@RequestBody BikeSharingDay bikeSharingDay) {
        bikeSharingDayRepository.save(bikeSharingDay);
        return ResponseEntity.ok(bikeSharingDay);
    }

    @PostMapping(value = "/list")
    public ResponseEntity postListBikeSharingDay(@RequestBody List <BikeSharingDay> bikeSharingDay) {
        bikeSharingDayRepository.saveAll(bikeSharingDay);
        return ResponseEntity.ok(bikeSharingDay);
    }

    @GetMapping()
    public ResponseEntity<List<BikeSharingDay>> getAll() {
        List<BikeSharingDay> bikeSharingDayList = new ArrayList<>();
        bikeSharingDayRepository.findAll().forEach(bikeSharingDayList::add);
        return ResponseEntity.ok(bikeSharingDayList);
    }

}
