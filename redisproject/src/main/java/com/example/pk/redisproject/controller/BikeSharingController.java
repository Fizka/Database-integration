package com.example.pk.redisproject.controller;

import com.example.pk.redisproject.model.BikeSharingDay;
import com.example.pk.redisproject.repository.BikeSharingDayRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Slf4j
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
    public ResponseEntity postListBikeSharingDay(@RequestBody List<BikeSharingDay> bikeSharingDay) {
        bikeSharingDayRepository.saveAll(bikeSharingDay);
        return ResponseEntity.ok(bikeSharingDay);
    }

    @GetMapping()
    public ResponseEntity<List<BikeSharingDay>> getAll() {
        List<BikeSharingDay> bikeSharingDayList = new ArrayList<>();
        bikeSharingDayRepository.findAll().forEach(bikeSharingDayList::add);
        return ResponseEntity.ok(bikeSharingDayList);
    }

    @DeleteMapping()
    public ResponseEntity deleteAllReports() {
        try {
            bikeSharingDayRepository.deleteAll();
            return new ResponseEntity(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteAllReportsById(@PathVariable Long id) {
        try {
            bikeSharingDayRepository.deleteById(id);
            return new ResponseEntity(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/date/{dtday}")
    public ResponseEntity<List<BikeSharingDay>> getAllBikesharingInfoByDate(@DateTimeFormat(pattern = "yyyy-MM-dd") @PathVariable Date dtday) {
        List<BikeSharingDay> bike_ = new ArrayList<>();
        bikeSharingDayRepository.findAll().forEach(bike_::add);
        try {
            DateFormat outputFormat = new SimpleDateFormat("MM/dd/yyyy");
            String outputString = outputFormat.format(dtday);
            log.info(outputString);
            List<BikeSharingDay> _bike = bike_.stream()
                    .filter(bikeReport -> {
                        log.info(outputFormat.format(bikeReport.getDteday()));
                        log.info(outputString);
                        log.info(String.valueOf((Objects.equals(outputFormat.format(bikeReport.getDteday()), outputString))));
                        return outputFormat.format(bikeReport.getDteday()).equals(outputString);
                    })
                    .collect(Collectors.toList());
            return new ResponseEntity<>(_bike, HttpStatus.OK);
        } catch (Exception e) {
            log.error(e.getMessage());
            return new ResponseEntity<>(List.of(bike_.get(0)), HttpStatus.OK);
        }
    }

    @GetMapping("/cnt/{min}/{max}")
    public ResponseEntity<List<BikeSharingDay>> getAllBikesharingInfoByCnt(@PathVariable int min, @PathVariable int max) {
        try {
            List<BikeSharingDay> bike_ = new ArrayList<>();
            bikeSharingDayRepository.findAll().forEach(bike_::add);
            List<BikeSharingDay> _bike = bike_.stream()
                    .filter(bikeReport -> bikeReport.getCnt() > min && bikeReport.getCnt() < max)
                    .collect(Collectors.toList());
            return new ResponseEntity<>(_bike, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<BikeSharingDay> getAlBikesharingInfoById(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(bikeSharingDayRepository.findById(id).get(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<BikeSharingDay> putAlBikesharingInfoById(@PathVariable Long id,@RequestBody BikeSharingDay bday) {
        try {
            BikeSharingDay bike = bikeSharingDayRepository.findById(id).get();
            bike.setAtemp(bday.getAtemp());
            bike.setCasual(bday.getCasual());
            bike.setDteday(bday.getDteday());
            bike.setHoliday(bday.getHoliday());
            bike.setHr(bday.getHr());
            bike.setHum(bday.getHum());
            bike.setCnt(bday.getCnt());
            bike.setRegistered(bday.getRegistered());
            bike.setSeason(bday.getSeason());
            bike.setMnth(bday.getMnth());
            bike.setTemp(bday.getTemp());
            bike.setWeathersit(bday.getWeathersit());
            bike.setWeekday(bday.getWeekday());
            bike.setWeekday(bday.getWeekday());
            bike.setWorkingday(bday.getWorkingday());
            bike.setYr(bday.getYr());
            return new ResponseEntity<>(bikeSharingDayRepository.save(bike), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

}
