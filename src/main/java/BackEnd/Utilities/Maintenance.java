package BackEnd.Utilities;

import BackEnd.Client;
import BackEnd.Rooms.Room;

/**
 * The Maintenance class handles the information related to a user making a maintenance request for their room.
 * @Author Zachary Sandness
 */
public class Maintenance {

    private Client client;
    private String description;
    private Room location;

    public Maintenance(Client client, String description, Room location) {
        this.client = client;
        this.description = description;
        this.location = location;
    }

    public Maintenance() {
        this.client = null;
        this.description = null;
        this.location = null;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
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


    @Override
    public String toString() {
        return "Maintenance{" +
                "name='" + client + '\'' +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
