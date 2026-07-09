package com.bookmyseat.bookmyseat.controller;

import com.bookmyseat.bookmyseat.entity.Booking;
import com.bookmyseat.bookmyseat.service.BookingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookmyseat/bookings")
public class BookingController {

    private BookingService bookingService;

    public BookingController(BookingService bookingService){
        this.bookingService = bookingService;
    }

    @GetMapping
    public List<Booking> getAllBooking(){
        return bookingService.getAllBookings();
    }

    @PostMapping("/add")
    public Booking createBooking(@RequestBody Booking booking){
        return bookingService.createBooking(booking);
    }
}
