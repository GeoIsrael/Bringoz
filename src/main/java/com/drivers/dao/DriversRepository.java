package com.drivers.dao;

import com.drivers.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;

public interface DriversRepository extends JpaRepository<Driver, Long> {

//    @Query("SELECT p.carma FROM Person p WHERE p.id = :id")
//    Integer getCarma(@Param("id") long id);
//

//    @Modifying
//    @Query("UPDATE Person p set p.lastUseTime = :lastUseTime where p.id = :id")
//    void updateLastRequestTime(@Param(value = "id") long id, @Param(value = "lastUseTime") LocalDateTime lastUseTime);
//
//    @Modifying
//    @Query("UPDATE Person p set p.requests = :requests where p.id = :id")
//    void updateRequests(@Param(value = "id") long id, @Param(value = "requests") Integer requests);


}