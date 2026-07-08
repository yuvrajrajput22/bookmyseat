package com.bookmyseat.bookmyseat.service;

import com.bookmyseat.bookmyseat.entity.Seat;
import com.bookmyseat.bookmyseat.repository.SeatRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatService {

    private SeatRepository seatRepository;

    public SeatService(SeatRepository seatRepository) {
        this.seatRepository=seatRepository;
    }

    public List<Seat> getAllSeats()
    {
        return seatRepository.findAll();
    }

    public Seat addSeat(Seat seat)
    {
        return seatRepository.save(seat);
    }
}
