package com.process.service;

import com.drivers.dto.DriverDto;
import com.drivers.dto.NewDriverDto;
import com.process.dto.NewRecordDto;
import com.process.dto.RecordDto;

public interface RecordService {
    RecordDto addNewRecord(NewRecordDto newRecordDto);


}
