package BackEnd.Rooms;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * The Conference Room class is a Room that handles the information related to Conference Rooms.
 * @Author Zachary Sandness
 */
public class ConferenceRoom extends Room {
    private boolean projectorStatus;

    public ConferenceRoom(String roomName, int roomNum, double roomPrice, boolean roomReservationStatus, boolean roomCleaningStatus, boolean projectorStatus) {
        super(roomName, roomNum, roomPrice, roomReservationStatus, roomCleaningStatus);
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
                "\n roomName='" + getRoomName() + '\'' +
                "\n roomNum=" + getRoomNum() +
                "\n roomPrice=" + getPrice() +
                "\n roomReservationStatus=" + isRoomReservationStatus() +
                "\n roomCleaningStatus=" + isRoomCleaningStatus() +
                "\n projectorStatus=" + projectorStatus +
                '}';
    }

    /**
     * Gives you the price of the room based on if a projector is present in the room or not.
     * @return The price of the stay as a double.
     */
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
