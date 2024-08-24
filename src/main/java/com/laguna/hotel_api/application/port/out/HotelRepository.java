package com.laguna.hotel_api.application.port.out;

import com.laguna.hotel_api.domain.entity.Hotel;

import java.util.List;
import java.util.Optional;

public interface HotelRepository {
     Hotel save(Hotel hotel);
     Optional<Hotel> get(Long id);
     List<Hotel> findAll();
     void delete(Long id);
}
