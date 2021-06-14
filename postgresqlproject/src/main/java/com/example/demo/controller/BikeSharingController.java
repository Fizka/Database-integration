package com.example.demo.controller;

import com.example.demo.domain.*;
import com.example.demo.repository.RentingDateRepository;
import com.example.demo.repository.RentingHoursRepository;
import com.example.demo.repository.RentingUserRepository;
import com.example.demo.repository.WeatherConditionsRepository;
import com.example.demo.service.RentingService;
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
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@Slf4j
@RequestMapping(value = "/postgresql/bike")
public class BikeSharingController {

    RentingUserRepository rentingUserRepository;
    RentingDateRepository rentingDateRepository;
    RentingHoursRepository rentingHoursRepository;
    WeatherConditionsRepository weatherConditionsRepository;
    RentingService rentingService;

    @Autowired
    public BikeSharingController(RentingService rentingService,
                                 RentingUserRepository rentingUserRepository,
                                 RentingDateRepository rentingDateRepository,
                                 RentingHoursRepository rentingHoursRepository,
                                 WeatherConditionsRepository weatherConditionsRepository) {
        this.rentingUserRepository = rentingUserRepository;
        this.rentingDateRepository = rentingDateRepository;
        this.rentingHoursRepository = rentingHoursRepository;
        this.weatherConditionsRepository = weatherConditionsRepository;
        this.rentingService = rentingService;
    }

    @GetMapping("/user")
    public ResponseEntity getAllRentingUsers() {
        List<RentingUser> bikeSharingHourNotion = new ArrayList<>();
        rentingUserRepository.findAll().forEach(bikeSharingHourNotion::add);
        return ResponseEntity.ok(bikeSharingHourNotion);
    }

    @GetMapping("/date")
    public ResponseEntity getAllRentingDate() {
        List<RentingDate> bikeSharingHourNotion = new ArrayList<>();
        rentingDateRepository.findAll().forEach(bikeSharingHourNotion::add);
        return ResponseEntity.ok(bikeSharingHourNotion);
    }

    @GetMapping("/hours")
    public ResponseEntity getAllrentingHours() {
        List<RentingHours> bikeSharingHourNotion = new ArrayList<>();
        rentingHoursRepository.findAll().forEach(bikeSharingHourNotion::add);
        return ResponseEntity.ok(bikeSharingHourNotion);
    }

    @GetMapping("/weather")
    public ResponseEntity getAllWeatherConditions() {
        List<WeatherConditions> bikeSharingHourNotion = new ArrayList<>();
        weatherConditionsRepository.findAll().forEach(bikeSharingHourNotion::add);
        return ResponseEntity.ok(bikeSharingHourNotion);
    }

    @GetMapping("/user/id/{id}")
    public ResponseEntity<RentingUser> getAllRentingUsersById(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(rentingUserRepository.findById(id).get(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/date/id/{id}")
    public ResponseEntity<RentingDate> getAllRentingDateById(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(rentingDateRepository.findById(id).get(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/hours/id/{id}")
    public ResponseEntity<RentingHours> getAllrentingHoursById(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(rentingHoursRepository.findById(id).get(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/weather/id/{id}")
    public ResponseEntity<WeatherConditions> getAllWeatherConditionsById(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(weatherConditionsRepository.findById(id).get(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping()
    public ResponseEntity postBikeSharingDay(@RequestBody BikeSharingHourNotion bike) {
        log.info(bike.toString());
        try {
            BikeSharingHourNotion bike_ = rentingService.saveRentingBikeReport(bike);
            return ResponseEntity.ok(bike_);
        } catch (Exception e) {
            log.error(e.toString());
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/all")
    public ResponseEntity postListBikeSharingDay(@RequestBody List<BikeSharingHourNotion> bikeSharingHourNotion) {
        try {
            return ResponseEntity.ok(rentingService.saveListRentingBikeReport(bikeSharingHourNotion));

        } catch (Exception e) {
            log.error(e.toString());
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping
    public ResponseEntity deleteBikeRentingReports() {
        weatherConditionsRepository.deleteAll();
        rentingDateRepository.deleteAll();
        rentingUserRepository.deleteAll();
        rentingHoursRepository.deleteAll();
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteReport(@PathVariable Long id) {
        Optional<RentingHours> rentingHours = rentingHoursRepository.findById(id);
        rentingHoursRepository.deleteById(id);
        weatherConditionsRepository.deleteById(rentingHours.get().getWeatherConditions().getIdWeatherConditions());
        rentingDateRepository.deleteById(rentingHours.get().getRentingDate().getIdRentingDate());
        rentingUserRepository.deleteById(rentingHours.get().getRentingUser().getIdRentingUser());
        return new ResponseEntity(HttpStatus.OK);
    }


    @GetMapping("/date/{dtday}")
    public ResponseEntity<List<RentingDate>> getAlBikesharingInfoByDate(@DateTimeFormat(pattern = "yyyy-MM-dd") @PathVariable Date dtday) {
        try {
            List<RentingDate> bike_ = new ArrayList<>();
            DateFormat outputFormat = new SimpleDateFormat("MM/dd/yyyy");
            String outputString = outputFormat.format(dtday);
            rentingDateRepository.findAll().forEach(bike_::add);
            List<RentingDate> _bike = bike_.stream()
                    .filter(bikeReport -> outputFormat.format(bikeReport.getDteday()).equals(outputString))
                    .collect(Collectors.toList());
            return new ResponseEntity<>(_bike, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/cnt/{min}/{max}")
    public List<RentingUser> getAlBikesharingInfoByCnt(@PathVariable int min, @PathVariable int max) {
        return rentingUserRepository.findByCntBetween(min, max);
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<RentingUser> putUser(@PathVariable Long id, @RequestBody RentingUser bike) {
        try {
            Optional<RentingUser> bike_ = rentingUserRepository.findById(id);
            bike_.get().setCasual(bike.getCasual());
            bike_.get().setRegistered(bike.getRegistered());
            bike_.get().setCnt(bike.getCnt());
            return new ResponseEntity<>(rentingUserRepository.save(bike_.get()), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/hours/{id}")
    public ResponseEntity<RentingHours> puthours(@RequestBody RentingHours bike, @PathVariable Long id) {
        try {
            Optional<RentingHours> bike_ = rentingHoursRepository.findById(id);
            bike_.get().setRentingDate(bike.getRentingDate());
            bike_.get().setHr(bike.getHr());
            bike_.get().setRentingUser(bike.getRentingUser());
            bike_.get().setWeatherConditions(bike.getWeatherConditions());
            return new ResponseEntity<>(rentingHoursRepository.save(bike_.get()), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/date/{id}")
    public ResponseEntity<RentingDate> putDate(@RequestBody RentingDate bike, @PathVariable Long id) {
        try {
            Optional<RentingDate> bike_ = rentingDateRepository.findById(id);
            bike_.get().setDteday(bike.getDteday());
            bike_.get().setHoliday(bike.getHoliday());
            bike_.get().setMnth(bike.getMnth());
            bike_.get().setMnth(bike.getMnth());
            bike_.get().setSeason(bike.getSeason());
            bike_.get().setWeekday(bike.getWeekday());
            bike_.get().setWorkingday(bike.getWorkingday());
            bike_.get().setYr(bike.getYr());
            return new ResponseEntity(rentingDateRepository.save(bike_.get()), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/weather/{id}")
    public ResponseEntity <WeatherConditions> putWeather(@RequestBody WeatherConditions bike, @PathVariable Long id) {
        try {
            Optional<WeatherConditions> bike_ = weatherConditionsRepository.findById(id);
            bike_.get().setAtemp(bike.getAtemp());
            bike_.get().setHum(bike.getHum());
            bike_.get().setWeathersit(bike.getWeathersit());
            bike_.get().setTemp(bike.getTemp());
            bike_.get().setWindspeed(bike.getWindspeed());
            return new ResponseEntity (weatherConditionsRepository.save(bike_.get()), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

}
