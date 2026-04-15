package BackEnd.Amenities;

import BackEnd.Interfaces.Pricable;
import BackEnd.Interfaces.Rentable;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class Kayaking extends Amenity implements Rentable, Pricable {

    private String location, difficulty;
    private boolean gearStatus;


    public Kayaking(String amenityName, boolean amenityAvailability, double amenityPrice, String amenityDescription, String location, String difficulty, boolean gearStatus) {
        super(amenityName, amenityAvailability, amenityPrice, amenityDescription);
        this.location = location;
        this.difficulty = difficulty;
        this.gearStatus = gearStatus;

    }

    public Kayaking(String location, String difficulty, boolean gearStatus) {
        this.location = location;
        this.difficulty = difficulty;
        this.gearStatus = gearStatus;
    }


    public Kayaking() {
        this.location = null;
        this.difficulty = null;
        this.gearStatus = false;

    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public boolean isGearStatus() {
        return gearStatus;
    }

    public void setGearStatus(boolean gearStatus) {
        this.gearStatus = gearStatus;
    }


    @Override
    public String toString() {
        return "Kayaking{" +
                "\namenityName='" + getAmenityName() +
                "\namenityAvailability=" + isAmenityAvailability() +
                "\namenityPrice=" + getAmenityPrice() +
                "\namenityDescription='" + getAmenityDescription() + '\'' +
                "\nlocation='" + location + '\'' +
                "\ndifficulty='" + difficulty + '\'' +
                "\ngearStatus=" + gearStatus +
                '}';
    }

    /**
     * This method is a part of an interface called Rentable which allows you to rent gear.
     * It changes the rent status to true if not already true.
     * It also prints out messages to the system telling the user if you have rented gear or not.
     */
    @Override
    public void rentGear() {

        if (gearStatus) {
            System.out.println("You have already rented gear.");
        } else {
            gearStatus = true;
            System.out.println("You have rented the gear.");
        }
    }

    /**
     * Give you the price of the amenity based on if you have rented the gear or not
     * @return Give you the price of the amenity as a double
     */
    @Override
    public double getPrice() {
        if (isGearStatus()) {
            BigDecimal price = new BigDecimal(getAmenityPrice()+10);
            BigDecimal roundedPrice = price.setScale(2, RoundingMode.HALF_UP);
            return roundedPrice.doubleValue();
        } else {
            return getAmenityPrice();
        }
    }
}
