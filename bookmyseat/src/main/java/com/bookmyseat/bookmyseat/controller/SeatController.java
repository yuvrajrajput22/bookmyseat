package com.bookmyseat.bookmyseat.controller;

import com.bookmyseat.bookmyseat.entity.Seat;
import com.bookmyseat.bookmyseat.repository.SeatRepository;
import com.bookmyseat.bookmyseat.service.SeatService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookmyseat/seats")
public class SeatController {

    private SeatService seatService;
    public SeatController(SeatService seatService)
    {
        this.seatService = seatService;
    }

    @GetMapping
    public List<Seat> getAllSeats()
    {
        return seatService.getAllSeats();
    }

    @PostMapping("/add")
    public Seat addSeat( @RequestBody Seat seat)
    {
        return seatService.addSeat(seat);
    }

    @PutMapping("/update/{id}")
    public Seat updateSeat(@PathVariable Long id,@RequestBody Seat seat)
    {
        return seatService.updateSeat(id, seat);
    }
    @DeleteMapping("/delete/{id}")
    public  String deleteSeat(@PathVariable Long id)
    {
         return seatService.deleteSeat(id);
    }
}
