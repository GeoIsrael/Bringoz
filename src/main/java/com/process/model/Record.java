package com.process.model;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.time.LocalDateTime;

@ToString
@NoArgsConstructor
@Data
@Entity
@Table(name="records")
@DynamicUpdate
public class Record {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long id;

    @Column(name="DRIVERID")
    Long driverId;

    @Column(name="LATITUDE")
    Double latitude;

    @Column(name="LONGITUDE")
    Double longitude;

    @Column(name="RECORDDATETIME")
    LocalDateTime recordDateTime;


    public Record(Long driverId, Double latitude, Double longitude) {
        this.driverId = driverId;
        this.latitude = latitude;
        this.longitude = longitude;
        this.recordDateTime = LocalDateTime.now();
    }
}
