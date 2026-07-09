package com.bookmyseat.bookmyseat.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import jakarta.persistence.*;

@Entity
public class Seat {

    @ManyToOne
    @JoinColumn(name = "show_id")
    private Show show;

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private int seatNumber;
    private boolean isBooked;

    @JsonCreator
    public Seat(){}

    public Seat(int seatNumber, boolean isBooked) {
        this.seatNumber = seatNumber;
        this.isBooked = isBooked;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
