package com.app.service;

import com.app.dao.DriversRepository;
import com.app.dto.DriverDto;
import com.app.dto.NewDriverDto;
import com.app.dto.exeptions.DriverNotFoundExeptions;
import com.app.model.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DriversServiceImpl implements DriversService{
    @Autowired
    DriversRepository driversRepository;

    @Override
    public DriverDto addNewDriver(NewDriverDto newDriver) {
        Driver driver = new Driver(newDriver.getFirstName(), newDriver.getLastName(),
                newDriver.getAge(), newDriver.getAddress(), newDriver.getDriversLicense());
        driver = driversRepository.save(driver);
        return convertToDriverDto(driver);
    }

    @Override
    public DriverDto getDriver(Long id) {

        Driver driver = driversRepository.findById(id).orElseThrow(() -> new DriverNotFoundExeptions(id));
        return convertToDriverDto(driver);

    }

    @Override
    public DriverDto removeDriver(Long id) {
        Driver driver = driversRepository.findById(id).orElseThrow(() -> new DriverNotFoundExeptions(id));
        driversRepository.delete(driver);
        return convertToDriverDto(driver);

    }

    @Override
    public Iterable<DriverDto> findAllDrivers() {
        List<Driver> drivers = driversRepository.findAll();
        return drivers.stream().map(d -> convertToDriverDto(d)).collect(Collectors.toList());
    }


    private DriverDto convertToDriverDto(Driver drv) {
        return  DriverDto.builder()
                .id(drv.getId())
                .firstName(drv.getFirstName())
                .lastName(drv.getLastName())
                .age(drv.getAge())
                .address(drv.getAddress())
                .driversLicense(drv.getDriversLicense())
                .startWorkDate(drv.getStartWorkDate())
                .build();
    }
}
