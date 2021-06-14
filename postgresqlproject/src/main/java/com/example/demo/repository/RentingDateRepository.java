package com.example.demo.repository;

import com.example.demo.domain.RentingDate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface RentingDateRepository extends JpaRepository<RentingDate, Long> {
    List<RentingDate> findAllByDteday(Date dtday);
}
