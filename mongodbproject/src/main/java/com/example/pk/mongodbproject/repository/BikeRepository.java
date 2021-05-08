package com.example.pk.mongodbproject.repository;

import com.example.pk.mongodbproject.document.Bike;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BikeRepository extends MongoRepository<Bike, Integer> {
}
