package com.example.barbershop.web.dto;

import lombok.Data;

@Data
public class RecordDto {

    private String date;

    private String time;

    private String barber;

    private String service;

    public RecordDto() {
    }

    public RecordDto(String date, String time, String barber, String service) {
        super();
        this.date = date;
        this.time = time;
        this.barber = barber;
        this.service = service;
    }
}
