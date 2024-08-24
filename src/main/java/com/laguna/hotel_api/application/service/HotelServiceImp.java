package com.laguna.hotel_api.application.service;

import com.laguna.hotel_api.application.port.in.HotelService;
import com.laguna.hotel_api.application.port.out.HotelRepository;
import com.laguna.hotel_api.domain.entity.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelServiceImp implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel save(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return hotelRepository.findAll();
    }

    @Override
    public Optional<Hotel> get(Long id) {
        return hotelRepository.get(id);
    }

    @Override
    public void delete(Long id) {
        hotelRepository.delete(id);
    }
}
