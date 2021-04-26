package com.app.dto;


import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class RoutePointDto {
    Long driverId;
    Double latitude;
    Double longitude;
    LocalDateTime visitTime;
    String name;
    String shop;


}
