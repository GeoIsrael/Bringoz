package com.process.service;

import com.process.dao.RecordRepository;
import com.process.dto.NewRecordDto;
import com.process.dto.RecordDto;
import com.process.model.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecordServiceImpl implements RecordService{

    @Autowired
    RecordRepository recordRepository;


    @Override
    public RecordDto addNewRecord(NewRecordDto newRecordDto) {
        Record record = new Record(newRecordDto.getDriverId(), newRecordDto.getLatitude(), newRecordDto.getLongitude());
        recordRepository.save(record);
        return convertToRecordDto(record);

    }

    private RecordDto convertToRecordDto(Record record) {
        return RecordDto.builder()
                .id(record.getId())
                .driverId(record.getDriverId())
                .latitude(record.getLatitude())
                .longitude(record.getLongitude())
                .recordDateTime(record.getRecordDateTime())
                .build();
    }
}
