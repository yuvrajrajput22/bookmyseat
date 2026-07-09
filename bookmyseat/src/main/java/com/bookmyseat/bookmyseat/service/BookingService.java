package com.bookmyseat.bookmyseat.service;

import com.bookmyseat.bookmyseat.entity.Booking;
import com.bookmyseat.bookmyseat.repository.BookingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    private BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }


    public List<Booking> getAllBookings(){
        return bookingRepository.findAll();
    }


    public Booking createBooking(Booking booking){
        return bookingRepository.save(booking);
    }

}
