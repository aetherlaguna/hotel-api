package com.laguna.hotel_api.domain.entity;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
public class Hotel {
    private UUID uuid;
    private Long id;
    private String name;
    private LocalDate since;


    public Hotel(String name, LocalDate since){
        this.name = name;
        this.since = since;
    }
}
