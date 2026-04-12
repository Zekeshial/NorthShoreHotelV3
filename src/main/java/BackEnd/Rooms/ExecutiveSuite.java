package BackEnd.Rooms;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ExecutiveSuite extends Room {

    private boolean suiteHottubStatus;
    private int suiteNumBeds;

    public ExecutiveSuite(String roomName, int roomNum, double roomPrice, boolean roomReservationStatus, boolean roomCleaningStatus, boolean suiteHottubStatus, int suiteNumBeds) {
        super(roomName, roomNum, roomPrice, roomReservationStatus, roomCleaningStatus);
        this.suiteHottubStatus = suiteHottubStatus;
        this.suiteNumBeds = suiteNumBeds;
    }

    public ExecutiveSuite(boolean suiteHottubStatus, int suiteNumBeds) {
        this.suiteHottubStatus = suiteHottubStatus;
        this.suiteNumBeds = suiteNumBeds;
    }

    public ExecutiveSuite() {
        this.suiteHottubStatus = false;
        this.suiteNumBeds = 0;
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
        return "ExecutiveSuite{" +
                "suiteName='" + getRoomName() + '\'' +
                ", suiteNum=" + getRoomNum() +
                ", suitePrice=" + getPrice() +
                ", suiteReservationStatus=" + isRoomReservationStatus() +
                ", suiteCleaningStatus=" + isRoomCleaningStatus() +
                ", suiteHottubStatus=" + suiteHottubStatus +
                ", suiteNumBeds=" + suiteNumBeds +
                '}';
    }

    @Override
    public double getPrice() {
        if (suiteHottubStatus) {
            BigDecimal price = new BigDecimal(getRoomPrice() + 10 + (double) (suiteNumBeds * 10) /10);
            BigDecimal roundedPrice = price.setScale(2, RoundingMode.HALF_UP);
            return roundedPrice.doubleValue();
        } else {
            BigDecimal price = new BigDecimal(getRoomPrice() + (double) (suiteNumBeds * 10) /10);
            BigDecimal roundedPrice = price.setScale(2, RoundingMode.HALF_UP);
            return roundedPrice.doubleValue();
        }
    }
}
