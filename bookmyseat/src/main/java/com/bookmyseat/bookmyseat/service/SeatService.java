package com.bookmyseat.bookmyseat.service;

import com.bookmyseat.bookmyseat.entity.Seat;
import com.bookmyseat.bookmyseat.repository.SeatRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SeatService {

    private SeatRepository seatRepository;

    public SeatService(SeatRepository seatRepository) {
        this.seatRepository = seatRepository;
    }

    public List<Seat> getAllSeats() {
        return seatRepository.findAll();
    }

    public Seat addSeat(Seat seat) {
        return seatRepository.save(seat);
    }

    public Seat updateSeat(Long id, Seat seat) {

        Optional<Seat> s = seatRepository.findById(id);
        if (s.isPresent()) {
            Seat existingSet = s.get();
            existingSet.setBooked(seat.isBooked());
            return seatRepository.save(existingSet);
        }

        return null;
    }

    public String deleteSeat(Long id)
    {
        Optional<Seat> s= seatRepository.findById(id);
        if(s.isPresent())
        {
            seatRepository.deleteById(id);
            return "Seat deleted successfully";
        }
        return "seat not found";
    }

}
