package com.utils;

import com.app.dao.DriversRepository;
import com.app.model.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class DriverGenerator {

    @Autowired
    DriversRepository driversRepository;



    public void generateDrivers () {

        System.out.println("Generate drivers");

        for (Integer i = 0; i < 10; i++) {

            driversRepository.save(Driver.builder()
                    .id(Long.parseLong(i.toString()))
                    .firstName("Firstname"+i)
                    .lastName("Lastname"+i)
                    .age(20 + i)
                    .address("Tel-Aviv, Rotshild st. " + i)
                    .driversLicense("License " + i)
                    .startWorkDate(LocalDateTime.now().minusDays(i))
                    .build());




        }




    }
}
