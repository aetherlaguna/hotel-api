package com.laguna.hotel_api.infrastructure.persistence;

import com.laguna.hotel_api.adapters.persistence.DataBaseInMemory;
import com.laguna.hotel_api.application.port.out.HotelRepository;
import com.laguna.hotel_api.domain.entity.Hotel;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class HotelRepositoryImp implements HotelRepository {
    @Override
    public Hotel save(Hotel hotel) {
        DataBaseInMemory.hotelDataBase.add(hotel);
        return  DataBaseInMemory.hotelDataBase.get(DataBaseInMemory.hotelDataBase.indexOf(hotel));
    }

    @Override
    public Optional<Hotel> get(Long id) {
        Hotel hotel;
        if(DataBaseInMemory.hotelDataBase.stream().anyMatch(h -> h.getId().equals(id))){
            hotel = DataBaseInMemory.hotelDataBase.stream().filter(h -> h.getId().equals(id)).findFirst().get();
            return Optional.of(hotel);
        }
        return Optional.empty();

    }

    @Override
    public List<Hotel> findAll() {
        return DataBaseInMemory.hotelDataBase;
    }

    @Override
    public void delete(Long id) {
        if(DataBaseInMemory.hotelDataBase.stream().anyMatch(h -> h.getId().equals(id))){
            DataBaseInMemory.hotelDataBase.remove(DataBaseInMemory.hotelDataBase.stream().filter(h -> h.getId().equals(id)).findFirst().get());
        }
    }
}
