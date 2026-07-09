package com.bookmyseat.bookmyseat.exception;

import com.bookmyseat.bookmyseat.entity.Seat;

public class SeatNotFoundException extends RuntimeException{

    public SeatNotFoundException(String message){
        super(message);
    }

}
