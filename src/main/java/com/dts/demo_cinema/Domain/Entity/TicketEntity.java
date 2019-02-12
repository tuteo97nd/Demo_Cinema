package com.dts.demo_cinema.Domain.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "team2_ticket", schema = "booking_cinema", catalog = "")
public class TicketEntity {
    private int idTicket;
    private int idScreen;
    private double priceTicket;
    private String timeCreate;

    @Id
    @Column(name = "id_ticket")
    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    @Basic
    @Column(name = "id_screen")
    public int getIdScreen() {
        return idScreen;
    }

    public void setIdScreen(int idScreen) {
        this.idScreen = idScreen;
    }

    @Basic
    @Column(name = "price_ticket")
    public double getPriceTicket() {
        return priceTicket;
    }

    public void setPriceTicket(double priceTicket) {
        this.priceTicket = priceTicket;
    }

    @Basic
    @Column(name = "time_create")
    public String getTimeCreate() {
        return timeCreate;
    }

    public void setTimeCreate(String timeCreate) {
        this.timeCreate = timeCreate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TicketEntity that = (TicketEntity) o;
        return idTicket == that.idTicket &&
                idScreen == that.idScreen &&
                Double.compare(that.priceTicket, priceTicket) == 0 &&
                Objects.equals(timeCreate, that.timeCreate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTicket, idScreen, priceTicket, timeCreate);
    }
}
