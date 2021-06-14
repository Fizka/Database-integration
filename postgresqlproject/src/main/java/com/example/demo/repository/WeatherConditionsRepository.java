package com.example.demo.repository;

import com.example.demo.domain.WeatherConditions;
import org.springframework.data.repository.CrudRepository;

public interface WeatherConditionsRepository extends CrudRepository<WeatherConditions, Long> {
}
