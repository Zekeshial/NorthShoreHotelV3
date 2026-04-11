package BackEnd.Reservations;

import BackEnd.Client;
import BackEnd.Rooms.Room;

import java.util.Date;

public class Reservation {

    private Client customer;
    private Date stayStartDate, stayEndDate;
    private Room room;

    public Reservation(Client customer, Date stayStartDate, Date stayEndDate, Room room) {
        this.customer = customer;
        this.stayStartDate = stayStartDate;
        this.stayEndDate = stayEndDate;
        this.room = room;
    }

    public Client getCustomer() {
        return customer;
    }

    public void setCustomer(Client customer) {
        this.customer = customer;
    }

    public Date getStayStartDate() {
        return stayStartDate;
    }

    public void setStayStartDate(Date stayStartDate) {
        this.stayStartDate = stayStartDate;
    }

    public Date getStayEndDate() {
        return stayEndDate;
    }

    public void setStayEndDate(Date stayEndDate) {
        this.stayEndDate = stayEndDate;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "customer=" + customer +
                ", stayStartDate=" + stayStartDate +
                ", stayEndDate=" + stayEndDate +
                ", room=" + room +
                '}';
    }
}
