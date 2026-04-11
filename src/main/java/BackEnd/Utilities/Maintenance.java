package BackEnd.Utilities;

import BackEnd.Rooms.Room;

import java.util.Date;

public class Maintenance {

    private String name, description;
    private Room location;
    private Date startDate;

    public Maintenance(String name, String description, Room location, Date startDate) {
        this.name = name;
        this.description = description;
        this.location = location;
        this.startDate = startDate;
    }

    public Maintenance() {
        this.name = null;
        this.description = null;
        this.location = null;
        this.startDate = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Room getLocation() {
        return location;
    }

    public void setLocation(Room location) {
        this.location = location;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Maintenance{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                ", startDate=" + startDate +
                '}';
    }
}
