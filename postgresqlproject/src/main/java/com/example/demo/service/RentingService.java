package com.example.demo.service;

import com.example.demo.domain.*;
import com.example.demo.repository.RentingDateRepository;
import com.example.demo.repository.RentingHoursRepository;
import com.example.demo.repository.RentingUserRepository;
import com.example.demo.repository.WeatherConditionsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class RentingService {

    RentingUserRepository rentingUserRepository;
    RentingDateRepository rentingDateRepository;
    RentingHoursRepository rentingHoursRepository;
    WeatherConditionsRepository weatherConditionsRepository;

    @Autowired
    public RentingService(RentingUserRepository rentingUserRepository,
                                 RentingDateRepository rentingDateRepository,
                                 RentingHoursRepository rentingHoursRepository,
                                 WeatherConditionsRepository weatherConditionsRepository) {
        this.rentingUserRepository = rentingUserRepository;
        this.rentingDateRepository = rentingDateRepository;
        this.rentingHoursRepository = rentingHoursRepository;
        this.weatherConditionsRepository = weatherConditionsRepository;
    }

    public BikeSharingHourNotion saveRentingBikeReport(BikeSharingHourNotion bike){
        log.info(bike.toString());
        WeatherConditions weatherConditions = weatherConditionsRepository.save(new WeatherConditions(bike.getWeathersit(), bike.getTemp(),
                bike.getAtemp(), bike.getHum(), bike.getWindspeed()));
        RentingDate rentingDate = rentingDateRepository.save(new RentingDate(bike.getDteday(), bike.getSeason(), bike.getYr(), bike.getMnth(),
                bike.getHoliday(), bike.getWeekday(), bike.getWorkingday()));
        RentingUser rentingUser = rentingUserRepository.save(new RentingUser(bike.getCasual(), bike.getRegistered(),
                bike.getCnt()));
        rentingHoursRepository.save(new RentingHours(bike.getHr(), rentingUser,
                weatherConditions, rentingDate));
        return bike;
    }

    public List <BikeSharingHourNotion> saveListRentingBikeReport(List<BikeSharingHourNotion> bikeSharingHourNotion){
        bikeSharingHourNotion.forEach(this::saveRentingBikeReport);
        return bikeSharingHourNotion;
    }
}
