package BackEnd.Rooms;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class JuniorSuite extends Room {

    private int suiteNumBeds;

    public JuniorSuite(String roomName, int roomNum, double roomPrice, boolean roomReservationStatus, boolean roomCleaningStatus, int suiteNumBeds) {
        super(roomName, roomNum, roomPrice, roomReservationStatus, roomCleaningStatus);
        this.suiteNumBeds = suiteNumBeds;
    }

    public JuniorSuite(int suiteNumBeds) {
        this.suiteNumBeds = suiteNumBeds;
    }

    public JuniorSuite() {
        this.suiteNumBeds = 0;
    }

    public int getSuiteNumBeds() {
        return suiteNumBeds;
    }

    public void setSuiteNumBeds(int suiteNumBeds) {
        this.suiteNumBeds = suiteNumBeds;
    }

    @Override
    public String toString() {
        return "JuniorSuite{" +
                "\n suiteType='" + getRoomName() + '\'' +
                "\n suiteNum=" + getRoomNum() +
                "\n suitePrice=" + getPrice() +
                "\n suiteReservationStatus=" + isRoomReservationStatus() +
                "\n suiteCleaningStatus=" + isRoomCleaningStatus() +
                "\n suiteNumBeds=" + suiteNumBeds +
                '}';
    }

    @Override
    public double getPrice() {
            BigDecimal price = new BigDecimal(getRoomPrice() + (suiteNumBeds * 10 - 10));
            BigDecimal roundedPrice = price.setScale(2, RoundingMode.HALF_UP);
            return roundedPrice.doubleValue();
    }
}
