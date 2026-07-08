package com.bookmyseat.bookmyseat.repository;

import com.bookmyseat.bookmyseat.entity.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepository  extends JpaRepository<Seat, Long> {
}
