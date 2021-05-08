package com.example.pk.redisproject.repository;

import com.example.pk.redisproject.model.BikeSharingDay;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BikeSharingDayRepository extends CrudRepository<BikeSharingDay, String> {
}
