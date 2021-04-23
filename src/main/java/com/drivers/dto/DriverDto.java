package com.drivers.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DriverDto {


    Long id;
    String firstName;
    String lastName;
    Integer age;
    String address;
    String driversLicense;


    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    LocalDateTime startWorkDate;







}
