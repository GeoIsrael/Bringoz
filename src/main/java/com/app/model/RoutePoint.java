package com.app.model;


import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.time.LocalDateTime;

@ToString
@Builder
@Data
@Entity
@Table(name="routepoints")
@DynamicUpdate
public class RoutePoint {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long id;

    @Column(name="DRIVERID")
    Long driverId;

    @Column(name="LATITUDE")
    Double latitude;

    @Column(name="LONGITUDE")
    Double longitude;

    @Column(name="VISITTIME")
    LocalDateTime visitTime;

    @Column(name="SHOPNAME")
    String name;

    @Column(name="SHOPTYPE")
    String shop;

}
