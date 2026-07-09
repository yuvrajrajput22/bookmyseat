package com.bookmyseat.bookmyseat.repository;

import com.bookmyseat.bookmyseat.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking,Long> {
}
