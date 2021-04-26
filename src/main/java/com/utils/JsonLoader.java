package com.utils;


import com.app.dao.MarketRepository;
import com.app.model.Point;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.utils.models.Markets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Component
public class JsonLoader {

    @Autowired
    RouteGenerator routeGenerator;


    @Autowired
    MarketRepository marketRepository;
    public static List<Point> points = new ArrayList<>();

    @EventListener(ApplicationReadyEvent.class)
    public void load() throws Exception {

        ObjectMapper objectMapper = new ObjectMapper();
        String json = new String(Files.readAllBytes(Paths.get("src/main/resources/Markets.json")));
        Markets objMarkets  = objectMapper.readValue(json, Markets.class);
        objMarkets.getElements().forEach(i -> {
            if (i.getLat()!=null && i.getLon() != null) {
                points.add(Point.builder()
                        .OsmMarketId(i.getId())
                        .lat(i.getLat())
                        .lon(i.getLon())
                        .name((i.getTags().getName()!=null)?i.getTags().getName():"no name")
                        .shop(i.getTags().getShop())
                        .build());
            }
        });

        points.forEach(p -> marketRepository.save(p));

        routeGenerator.generateRoute();




    }


}
