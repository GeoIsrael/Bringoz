package com.drivers.model;


import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.time.LocalDateTime;


@ToString
@NoArgsConstructor
@Data
@Entity
@Table(name="drivers")
@DynamicUpdate
public class Driver {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long id;
    @Column(name="FIRSTNAME")
    String firstName;
    @Column(name="LASTNAME")
    String lastName;
    @Column(name="AGE")
    Integer age;
    @Column(name="ADDRESS")
    String address;
    @Column(name="DRIVERSLICENSE")
    String driversLicense;


    @Column(name="STARTWORKDATE")
    LocalDateTime startWorkDate;

    public Driver(String firstName, String lastName, Integer age, String address, String driversLicense) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.driversLicense = driversLicense;
        this.startWorkDate = LocalDateTime.now();
    }
}
