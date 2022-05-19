package com.example.barbershop.service;

import com.example.barbershop.model.Record;
import com.example.barbershop.repository.RecordRepository;
import com.example.barbershop.web.dto.RecordDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecordServiceImpl implements RecordService{

    @Autowired
    private RecordRepository recordRepository;


    @Override
    public void save(Record record) {
        recordRepository.save(record);
    }
}
