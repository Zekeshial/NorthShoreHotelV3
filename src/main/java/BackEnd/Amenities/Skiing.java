package BackEnd.Amenities;

import BackEnd.Interfaces.Pricable;
import BackEnd.Interfaces.Rentable;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Skiing extends Amenity implements Rentable, Pricable {

    private String location, difficulty;
    private boolean gearStatus;

    public Skiing(String amenityName, boolean amenityAvailability, double amenityPrice, String amenityDescription, String location, String difficulty, boolean gearStatus) {
        super(amenityName, amenityAvailability, amenityPrice, amenityDescription);
        this.location = location;
        this.difficulty = difficulty;
        this.gearStatus = gearStatus;
    }

    public Skiing(String location, String difficulty, boolean gearStatus) {
        this.location = location;
        this.difficulty = difficulty;
        this.gearStatus = gearStatus;
    }

    public Skiing() {
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
        return "Skiing{" +
                "\namenityName='" + getAmenityName() + '\'' +
                "\namenityAvailability=" + isAmenityAvailability() +
                "\namenityPrice=" + getAmenityPrice() +
                "\namenityDescription='" + getAmenityDescription() + '\'' +
                "\nlocation='" + location + '\'' +
                "\ndifficulty='" + difficulty + '\'' +
                "\ngearStatus=" + gearStatus +
                '}';
    }

    @Override
    public void rentGear() {
        if (gearStatus) {
            System.out.println("You have already rented gear");
        } else {
            gearStatus = true;
            System.out.println("You have rented the gear.");
        }
    }

    @Override
    public double getPrice() {
        if (isGearStatus()) {
            gearStatus = true;
            BigDecimal price = new BigDecimal(getAmenityPrice()+15);
            BigDecimal roundedPrice = price.setScale(2, RoundingMode.HALF_UP);
            return roundedPrice.doubleValue();
        } else {
            return getAmenityPrice();
        }
    }
}
