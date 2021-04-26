package com.app.dto;


import lombok.Getter;
import java.time.LocalDate;
import java.time.LocalTime;

@Getter
public class NewDayRouteByIdDto {

    Long driverId;
    LocalDate workDate;
    LocalTime timeAtDayFrom;
    LocalTime timeAtDayTo;




}
