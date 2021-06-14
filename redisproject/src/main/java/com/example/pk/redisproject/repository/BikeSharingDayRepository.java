package com.example.pk.redisproject.repository;

import com.example.pk.redisproject.model.BikeSharingDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface BikeSharingDayRepository extends PagingAndSortingRepository<BikeSharingDay, Long> {
    List<BikeSharingDay> findByCntBetween(int min, int max);
    List<BikeSharingDay> findByCntIsBetween(int min, int max);
    List<BikeSharingDay> findByDteday(Date dtday);
}
