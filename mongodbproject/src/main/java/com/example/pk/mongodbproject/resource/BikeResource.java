package com.example.pk.mongodbproject.resource;

import ch.qos.logback.classic.util.LoggerNameUtil;
import com.example.pk.mongodbproject.document.Bike;
import com.example.pk.mongodbproject.repository.BikeRepository;
import com.example.pk.mongodbproject.repository.BikeSharingReportsRepository;
import com.example.pk.mongodbproject.repository.BikeSharingRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/mongodb/bikesharing")
@Slf4j
public class BikeResource {

    private final BikeRepository bikeRepository;
    private final BikeSharingReportsRepository bikeSharingReportsRepository;
    private final BikeSharingRepository bikeSharingRepository;

    @Autowired
    public BikeResource(BikeRepository bikeRepository, BikeSharingReportsRepository bikeSharingReportsRepository, BikeSharingRepository bikeSharingRepository) {
        this.bikeRepository = bikeRepository;
        this.bikeSharingReportsRepository = bikeSharingReportsRepository;
        this.bikeSharingRepository = bikeSharingRepository;
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

    @DeleteMapping()
    public ResponseEntity deleteAllReports() {
        try {
            bikeRepository.deleteAll();
            return new ResponseEntity(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteReport(@PathVariable Long id) {
        try {
            bikeRepository.findById(id);
            return new ResponseEntity(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/date/{dtday}")
    public ResponseEntity<List<Bike>> getAlBikesharingInfoByDate(@DateTimeFormat(pattern = "yyyy-MM-dd") @PathVariable Date dtday) {
        try {
            List<Bike> bike_ = new ArrayList<>();
            DateFormat outputFormat = new SimpleDateFormat("MM/dd/yyyy");
            String outputString = outputFormat.format(dtday);
            bikeSharingRepository.findAll().forEach(bike_::add);
            List<Bike> _bike = bike_.stream()
                    .filter(bikeReport -> outputFormat.format(bikeReport.getDteday()).equals(outputString))
                    .collect(Collectors.toList());
            return new ResponseEntity<>(_bike, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/cnt/{min}/{max}")
    public ResponseEntity<List<Bike>> getAlBikesharingInfoByCnt(@PathVariable int min, @PathVariable int max) {
        try {
            return new ResponseEntity<>(bikeSharingRepository.findByCntIsBetween(min, max), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Bike> putAlBikesharingInfoById(@PathVariable Long id,@RequestBody Bike bday) {
        try {
            Bike bike = bikeRepository.findById(id).get();
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
            return new ResponseEntity<>(bikeRepository.save(bike), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bike> getAlBikesharingInfoByCnt(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(bikeSharingRepository.findById(id).get(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
