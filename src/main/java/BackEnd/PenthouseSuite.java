package BackEnd;

public class PenthouseSuite extends Room{

    private boolean kitchenStatus, suiteHottubStatus;
    private int suiteNumBeds;

    public PenthouseSuite(String roomName, int roomNum, double roomPrice, int roomDuration, boolean roomReservationStatus, boolean roomCleaningStatus, boolean kitchenStatus, boolean suiteHottubStatus, int suiteNumBeds) {
        super(roomName, roomNum, roomPrice, roomDuration, roomReservationStatus, roomCleaningStatus);
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
                "suiteName='" + getRoomName() + '\'' +
                ", suiteNum=" + getRoomNum() +
                ", suiteDuration=" + getRoomDuration() +
                ", suitePrice=" + getRoomPrice() +
                ", suiteReservationStatus=" + isRoomReservationStatus() +
                ", suiteCleaningStatus=" + isRoomCleaningStatus() +
                ", kitchenStatus=" + kitchenStatus +
                ", suiteHottubStatus=" + suiteHottubStatus +
                ", suiteNumBeds=" + suiteNumBeds +
                '}';
    }
}
