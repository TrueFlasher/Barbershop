package com.example.barbershop.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="records")
@Data
public class Record {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String barber;

    private String date;

    private String time;

    private String service;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    public Record() {
    }

    public Record(String barber, String date, String time, String service, User user) {
        this.barber = barber;
        this.date = date;
        this.time = time;
        this.service = service;
        this.user = user;
    }
}
