package com.laguna.hotel_api.adapters.rest.in;

import com.laguna.hotel_api.application.port.in.HotelService;
import com.laguna.hotel_api.domain.entity.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    private HotelService hotelService;


    @PostMapping()
    public Hotel save(@RequestBody Hotel hotel){
        return hotelService.save(hotel);
    }

    @GetMapping()
    public Hotel get(@RequestBody Long id){


        return hotelService.get(id).isPresent() ? hotelService.get(id).get() : null;
    }

    @GetMapping("/get-all")
    public List<Hotel> getAll(){
        return hotelService.getAll();
    }

    @DeleteMapping()
    public void delete(@RequestBody Long id){
        hotelService.delete(id);
    }

}
