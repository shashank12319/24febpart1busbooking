package com.wittybrains.busbookingsystem.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wittybrains.busbookingsystem.dto.BookingDTO;
import com.wittybrains.busbookingsystem.dto.BusDTO;
import com.wittybrains.busbookingsystem.model.Booking;
import com.wittybrains.busbookingsystem.model.Bus;
import com.wittybrains.busbookingsystem.repository.BookingRepository;
import com.wittybrains.busbookingsystem.repository.BusRepository;

@RestController
@RequestMapping(value="/bookings")
public class BookingController {

    @Autowired
    private BookingRepository bookingRepository;
    
  @Autowired
  private BusRepository busRepository;
    @PostMapping
    public ResponseEntity<BookingDTO> createBooking(@RequestBody BookingDTO bookingDTO) {
        Booking booking = new Booking();
        BusDTO busDTO=bookingDTO.getBus();
        
        Optional<Bus>optionalBus =busRepository.findById(busDTO.getId());
        optionalBus.ifPresent(bus -> booking.setBus(bus));
        booking.setDateOfBooking(bookingDTO.getDateOfBooking());
        //booking.setSchedule(bookingDTO.getSchedule());
        booking.setNumberOfSeats(bookingDTO.getNumberOfSeats());
        booking.setFareAmount(bookingDTO.getFareAmount());
       // booking.setBus(bookingDTO.getBus());
        booking.setRouteInfo(bookingDTO.getRouteInfo());
        //booking.setUser(bookingDTO.getUser());
        booking.setTotalAmount(bookingDTO.getTotalAmount());
        booking.setBookingStatus(bookingDTO.getBookingStatus());
        bookingRepository.save(booking);
        return ResponseEntity.ok(bookingDTO);
    }
    
    
}
