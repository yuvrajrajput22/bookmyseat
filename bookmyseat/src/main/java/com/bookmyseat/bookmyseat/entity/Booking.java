package com.bookmyseat.bookmyseat.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "seat_id")
    private Seat seat;

    @ManyToOne
    @JoinColumn(name ="show_id")
    private Show show;

    private LocalDateTime bookingTime;
    private double amountPaid;
    private String customerName;

    @JsonCreator
    public Booking() {}

    public Booking(Long id, Seat seat, Show show, LocalDateTime bookingTime, double amountPaid, String customerName) {
        this.id = id;
        this.seat = seat;
        this.show = show;
        this.bookingTime = bookingTime;
        this.amountPaid = amountPaid;
        this.customerName = customerName;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public LocalDateTime getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(LocalDateTime bookingTime) {
        this.bookingTime = bookingTime;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
