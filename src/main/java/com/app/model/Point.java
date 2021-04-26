package com.drivers.model;


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@ToString
@Builder
@Data
@Entity
@Table(name="points")
public class Point {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long id;
    @Column(name="OSMID")
    Long OsmMarketId;
    @Column(name="LAT")
    Double lat;
    @Column(name="LON")
    Double lon;
    @Column(name="MARKETNAME")
    String name;
    @Column(name="MARKETTYPE")
    String shop;


}
