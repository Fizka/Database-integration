package com.example.pk.mongodbproject.repository;

import com.example.pk.mongodbproject.document.Bike;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface BikeSharingReportsRepository extends CrudRepository<Bike, Date> {

    @Aggregation(pipeline = {"{$group: { \"dteday\" : { $first: '$dteday' }, total: {$avg: $temp }}}"})
    List<Bike> avg(Date dteday);
}
