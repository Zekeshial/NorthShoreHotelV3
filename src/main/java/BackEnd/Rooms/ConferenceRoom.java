package BackEnd.Rooms;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ConferenceRoom extends Room {
    private boolean projectorStatus;

    public ConferenceRoom(String roomName, int roomNum, double roomPrice, int roomDuration, boolean roomReservationStatus, boolean roomCleaningStatus, boolean projectorStatus) {
        super(roomName, roomNum, roomPrice, roomDuration, roomReservationStatus, roomCleaningStatus);
        this.projectorStatus = projectorStatus;
    }

    public ConferenceRoom(boolean projectorStatus) {
        this.projectorStatus = projectorStatus;
    }

    public ConferenceRoom() {
        this.projectorStatus = false;
    }

    public boolean isProjectorStatus() {
        return projectorStatus;
    }

    public void setProjectorStatus(boolean projectorStatus) {
        this.projectorStatus = projectorStatus;
    }


    @Override
    public String toString() {
        return "ConferenceRoom{" +
                "roomName='" + getRoomName() + '\'' +
                ", roomNum=" + getRoomNum() +
                ", roomDuration=" + getRoomDuration() +
                ", roomPrice=" + getPrice() +
                ", roomReservationStatus=" + isRoomReservationStatus() +
                ", roomCleaningStatus=" + isRoomCleaningStatus() +
                ", projectorStatus=" + projectorStatus +
                '}';
    }

    @Override
    public double getPrice() {
        if (projectorStatus) {
            BigDecimal price = new BigDecimal(getRoomPrice()+10);
            BigDecimal roundedPrice = price.setScale(2, RoundingMode.HALF_UP);
            return roundedPrice.doubleValue();
        } else {
            return getRoomPrice();
        }
    }
}
