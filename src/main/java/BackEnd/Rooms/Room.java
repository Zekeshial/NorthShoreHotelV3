package BackEnd.Rooms;

import BackEnd.Interfaces.Pricable;

public abstract class Room implements Pricable {

    private String roomName;
    private int roomNum, roomDuration;
    private double roomPrice;
    private boolean roomReservationStatus;
    private boolean roomCleaningStatus;

    public Room(String roomName, int roomNum, double roomPrice, int roomDuration, boolean roomReservationStatus, boolean roomCleaningStatus) {
        this.roomName = roomName;
        this.roomNum = roomNum;
        this.roomPrice = roomPrice;
        this.roomDuration = roomDuration;
        this.roomReservationStatus = roomReservationStatus;
        this.roomCleaningStatus = roomCleaningStatus;
    }

    public Room() {
        this.roomName = "default";
        this.roomNum = 0;
        this.roomPrice = 0;
        this.roomDuration = 0;
        this.roomReservationStatus = false;
        this.roomCleaningStatus = false;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public int getRoomDuration() {
        return roomDuration;
    }

    public void setRoomDuration(int roomDuration) {
        this.roomDuration = roomDuration;
    }

    public boolean isRoomReservationStatus() {
        return roomReservationStatus;
    }

    public void setRoomReservationStatus(boolean roomReservationStatus) {
        this.roomReservationStatus = roomReservationStatus;
    }

    public boolean isRoomCleaningStatus() {
        return roomCleaningStatus;
    }

    public void setRoomCleaningStatus(boolean roomCleaningStatus) {
        this.roomCleaningStatus = roomCleaningStatus;
    }

    public double getTotalCostOfStay() {
        return roomPrice * roomDuration;
    }

    @Override
    public abstract String toString();
}
