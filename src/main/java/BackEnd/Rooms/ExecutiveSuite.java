package BackEnd.Rooms;

public class ExecutiveSuite extends Room {

    private boolean suiteHottubStatus;
    private int suiteNumBeds;

    public ExecutiveSuite(String roomName, int roomNum, double roomPrice, int roomDuration, boolean roomReservationStatus, boolean roomCleaningStatus, boolean suiteHottubStatus, int suiteNumBeds) {
        super(roomName, roomNum, roomPrice, roomDuration, roomReservationStatus, roomCleaningStatus);
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
                ", suiteDuration=" + getRoomDuration() +
                ", suitePrice=" + getRoomPrice() +
                ", suiteReservationStatus=" + isRoomReservationStatus() +
                ", suiteCleaningStatus=" + isRoomCleaningStatus() +
                ", suiteHottubStatus=" + suiteHottubStatus +
                ", suiteNumBeds=" + suiteNumBeds +
                '}';
    }
}
