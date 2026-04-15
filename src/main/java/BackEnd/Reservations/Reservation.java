package BackEnd.Reservations;

import BackEnd.Client;
import BackEnd.Interfaces.Pricable;
import BackEnd.Rooms.Room;

import java.time.LocalDate;

public class Reservation implements Pricable {

    private Client customer;
    private LocalDate stayStartDate;
    private int stayDuration;
    private Room room;

    public Reservation(Client customer, int stayDuration, Room room) {
        this.customer = customer;
        this.stayStartDate = LocalDate.now();
        this.stayDuration = stayDuration;
        this.room = room;
    }

    public Reservation() {
        this.customer = null;
        this.stayStartDate = LocalDate.now();
        this.stayDuration = 0;
        this.room = null;
    }

    public Client getCustomer() {
        return customer;
    }

    public void setCustomer(Client customer) {
        this.customer = customer;
    }

    public LocalDate getStayStartDate() {
        return stayStartDate;
    }

    public void setStayStartDate(LocalDate stayStartDate) {
        this.stayStartDate = stayStartDate;
    }

    public LocalDate getStayEndDate() {
        return stayStartDate.plusDays(stayDuration);
    }


    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getStayDuration() {
        return stayDuration;
    }

    public void setStayDuration(int stayDuration) {
        this.stayDuration = stayDuration;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "customer=" + customer +
                ", stayStartDate=" + stayStartDate +
                ", stayEndDate=" + getStayEndDate() +
                ", stayDuration=" + stayDuration +
                ", room=" + room +
                '}';
    }

    /**
     * Gives you the price of a reservation based on the rooms price and its stay duration
     * @return The price of the reservation as a double
     */
    @Override
    public double getPrice() {
        if(getRoom() == null) {
            return 0;
        } else if (stayDuration < 0) {
            return 0;
        } else {
            return room.getPrice() * stayDuration;
        }
    }
}
