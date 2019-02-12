package com.dts.demo_cinema.Domain.Request;

public class MoviesMappingSeat {
    private String row_seat ;
    private int number_seat;

    public MoviesMappingSeat() {
    }

    public MoviesMappingSeat(String row_seat, int number_seat) {
        this.row_seat = row_seat;
        this.number_seat = number_seat;
    }

    public String getRow_seat() {
        return row_seat;
    }

    public void setRow_seat(String row_seat) {
        this.row_seat = row_seat;
    }

    public int getNumber_seat() {
        return number_seat;
    }

    public void setNumber_seat(int number_seat) {
        this.number_seat = number_seat;
    }

    @Override
    public String toString() {
        return "MoviesMappingSeat{" +
                "row_seat='" + row_seat + '\'' +
                ", number_seat=" + number_seat +
                '}';
    }
}
