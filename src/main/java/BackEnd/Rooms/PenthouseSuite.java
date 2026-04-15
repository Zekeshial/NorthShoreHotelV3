package BackEnd.Rooms;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PenthouseSuite extends Room {

    private boolean kitchenStatus, suiteHottubStatus;
    private int suiteNumBeds;

    public PenthouseSuite(String roomName, int roomNum, double roomPrice, boolean roomReservationStatus, boolean roomCleaningStatus, boolean kitchenStatus, boolean suiteHottubStatus, int suiteNumBeds) {
        super(roomName, roomNum, roomPrice, roomReservationStatus, roomCleaningStatus);
        this.kitchenStatus = kitchenStatus;
        this.suiteHottubStatus = suiteHottubStatus;
        this.suiteNumBeds = suiteNumBeds;
    }

    public PenthouseSuite(boolean kitchenStatus, boolean suiteHottubStatus, int suiteNumBeds) {
        this.kitchenStatus = kitchenStatus;
        this.suiteHottubStatus = suiteHottubStatus;
        this.suiteNumBeds = suiteNumBeds;
    }

    public PenthouseSuite() {
        this.kitchenStatus = false;
        this.suiteHottubStatus = false;
        this.suiteNumBeds = 0;
    }

    public boolean isKitchenStatus() {
        return kitchenStatus;
    }

    public void setKitchenStatus(boolean kitchenStatus) {
        this.kitchenStatus = kitchenStatus;
    }

    public boolean isSuiteHottubStatus() {
        return suiteHottubStatus;
    }

    public void setSuiteHottubStatus(boolean suiteHottubStatus) {
        this.suiteHottubStatus = suiteHottubStatus;
    }

    public int getSuiteNumBeds() {
        return suiteNumBeds;
    }

    public void setSuiteNumBeds(int suiteNumBeds) {
        this.suiteNumBeds = suiteNumBeds;
    }

    @Override
    public String toString() {
        return "PenthouseSuite{" +
                "\n suiteType='" + getRoomName() + '\'' +
                "\n suiteNum=" + getRoomNum() +
                "\n suitePrice=" + getPrice() +
                "\n suiteReservationStatus=" + isRoomReservationStatus() +
                "\n suiteCleaningStatus=" + isRoomCleaningStatus() +
                "\n kitchenStatus=" + kitchenStatus +
                "\n suiteHottubStatus=" + suiteHottubStatus +
                "\n suiteNumBeds=" + suiteNumBeds +
                '}';
    }

    /**
     * Gives you the price of the room based on if you have a kitchen and/or hot tub in the room or not
     * and the number of beds in the room.
     * @return The Price of the Room as a double.
     */
    @Override
    public double getPrice() {
        if (suiteHottubStatus && kitchenStatus) {
            BigDecimal price = new BigDecimal(getRoomPrice() + 10 + 30 + (suiteNumBeds * 10 - 10));
            BigDecimal roundedPrice = price.setScale(2, RoundingMode.HALF_UP);
            return roundedPrice.doubleValue();
        } else if (suiteHottubStatus && !kitchenStatus) {
            BigDecimal price = new BigDecimal(getRoomPrice() + 10 + (suiteNumBeds * 10 - 10));
            BigDecimal roundedPrice = price.setScale(2, RoundingMode.HALF_UP);
            return roundedPrice.doubleValue();
        } else if (!suiteHottubStatus && kitchenStatus) {
            BigDecimal price = new BigDecimal(getRoomPrice() + 30 + (suiteNumBeds * 10 - 10));
            BigDecimal roundedPrice = price.setScale(2, RoundingMode.HALF_UP);
            return roundedPrice.doubleValue();
        } else {
            BigDecimal price = new BigDecimal(getRoomPrice() + (suiteNumBeds * 10 - 10));
            BigDecimal roundedPrice = price.setScale(2, RoundingMode.HALF_UP);
            return roundedPrice.doubleValue();
        }
    }
}
