package com.app.service;

import com.app.dto.DriverDto;
import com.app.dto.NewDriverDto;

public interface DriversService {

    DriverDto addNewDriver(NewDriverDto newDriver);

    DriverDto getDriver(Long id);

    DriverDto removeDriver(Long id);

    Iterable<DriverDto> findAllDrivers();


}
