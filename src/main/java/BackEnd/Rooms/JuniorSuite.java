package BackEnd.Rooms;

public class JuniorSuite extends Room {

    private int suiteNumBeds;

    public JuniorSuite(String roomName, int roomNum, double roomPrice, int roomDuration, boolean roomReservationStatus, boolean roomCleaningStatus, int suiteNumBeds) {
        super(roomName, roomNum, roomPrice, roomDuration, roomReservationStatus, roomCleaningStatus);
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
                "suiteName='" + getRoomName() + '\'' +
                ", suiteNum=" + getRoomNum() +
                ", suiteDuration=" + getRoomDuration() +
                ", suitePrice=" + getRoomPrice() +
                ", suiteReservationStatus=" + isRoomReservationStatus() +
                ", suiteCleaningStatus=" + isRoomCleaningStatus() +
                ", suiteNumBeds=" + suiteNumBeds +
                '}';
    }
}
