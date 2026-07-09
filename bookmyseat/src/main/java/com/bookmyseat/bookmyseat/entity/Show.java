package com.bookmyseat.bookmyseat.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "shows")
public class Show {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    private String genre;
    private String language;
    private int durationMinutes;
    private String venue;
    private double ticketPrice;
    private  int totalSeats;
    private LocalDateTime showTime;

    @JsonCreator
    public Show() {}

    public LocalDateTime getShowTime() {
        return showTime;
    }

    public void setShowTime(LocalDateTime showTime) {

     this.showTime = showTime;}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public Show(Long id, String title,
                LocalDateTime showTime,
                String description,
                String genre, String language,
                int durationMinutes, String venue,
                double ticketPrice, int totalSeats) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.genre = genre;
        this.language = language;
        this.durationMinutes = durationMinutes;
        this.venue = venue;
        this.ticketPrice = ticketPrice;
        this.totalSeats = totalSeats;
        this.showTime = showTime;

    }
}
