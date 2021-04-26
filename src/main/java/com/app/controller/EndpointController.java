package com.app.controller;


import com.app.dto.DriverDto;
import com.app.dto.NewDriverDto;
import com.app.service.DriversService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/drivers")
public class EndpointController {

    @Autowired
    DriversService driversService;

    //добавить нового водителя
    @PostMapping("/add/")
    public DriverDto addDriver(@RequestBody NewDriverDto newDriver) {
        return driversService.addNewDriver(newDriver);
    }

    //получить водителя по ID
    @GetMapping("/{id}")
    public DriverDto getDriverById(@PathVariable Long id) {
        return driversService.getDriver(id);
    }

    //уволить водителя по ID
    @DeleteMapping("/{id}")
    public DriverDto removeDriverById(@PathVariable Long id) {
        return driversService.removeDriver(id);
    }

    //получить список всех водителей
    @GetMapping("/getall/")
    public Iterable<DriverDto> findAllDrivers(){
        return driversService.findAllDrivers();
    }






}
