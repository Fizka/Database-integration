package com.example.pk.mongodbproject.repository;

import com.example.pk.mongodbproject.document.Bike;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Date;
import java.util.List;

public interface BikeSharingRepository extends PagingAndSortingRepository<Bike, Long> {
    List<Bike> findByDteday(Date Dteday);
    List <Bike> findByCntIsBetween(int min, int max);
}
