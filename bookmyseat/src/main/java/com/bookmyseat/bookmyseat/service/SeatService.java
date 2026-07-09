package com.bookmyseat.bookmyseat.service;

import com.bookmyseat.bookmyseat.entity.Seat;
import com.bookmyseat.bookmyseat.exception.SeatAlreadyBookedException;
import com.bookmyseat.bookmyseat.exception.SeatNotFoundException;
import com.bookmyseat.bookmyseat.repository.SeatRepository;
import jakarta.transaction.Transactional;
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

    @Transactional
    public Seat updateSeat(Long id, Seat seat)
    {
        Seat existingSeat = seatRepository.findWithLockById(id)
                .orElseThrow(() -> new SeatNotFoundException("Seat not found with id " + id));

        if (existingSeat.isBooked()) {
            throw new SeatAlreadyBookedException("Seat with id " + id + " is already booked");
        }

        existingSeat.setBooked(true);
        return seatRepository.save(existingSeat);
    }
    public String deleteSeat(Long id)
    {
        Optional<Seat> s= seatRepository.findById(id);
        if(s.isPresent())
        {
            seatRepository.deleteById(id);
            return "Seat deleted successfully";
        }
        return "Seat not found";
    }

}
