package com.example.pk.mongodbproject.repository;

import com.example.pk.mongodbproject.document.Bike;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface BikeRepository extends MongoRepository<Bike, Long> {
    List <Bike> findByDteday(Date Dteday);
    List <Bike> findByCntIsBetween(int min, int max);

}
