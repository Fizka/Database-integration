package com.example.demo.repository;

import com.example.demo.domain.RentingUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RentingUserRepository extends CrudRepository<RentingUser, Long> {
    List<RentingUser> findByCntBetween(int min, int max);
    List<RentingUser> findAllByCnt(int cnt);
}
