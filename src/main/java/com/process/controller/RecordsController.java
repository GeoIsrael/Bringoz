package com.process.controller;

import com.drivers.dto.DriverDto;
import com.drivers.dto.NewDriverDto;
import com.process.dto.NewRecordDto;
import com.process.dto.RecordDto;
import com.process.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/records")
public class RecordsController {

    @Autowired
    RecordService recordService;

    @PostMapping("/add/")
    public RecordDto addDriver(@RequestBody NewRecordDto newRecordDto) {
        return recordService.addNewRecord(newRecordDto);
    }




}
