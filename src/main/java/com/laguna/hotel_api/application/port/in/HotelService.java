package com.laguna.hotel_api.application.port.in;

import com.laguna.hotel_api.domain.entity.Hotel;

import java.util.List;
import java.util.Optional;


public interface HotelService {

     Hotel save(Hotel hotel);

     List<Hotel> getAll();

     Optional<Hotel> get(Long id);

     void delete(Long id);
}
