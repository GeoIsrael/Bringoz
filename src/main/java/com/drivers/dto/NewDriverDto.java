package com.drivers.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
public class NewDriverDto {


    String firstName;
    String lastName;
    Integer age;
    String address;
    String driversLicense;






}
