package BackEnd.Amenities;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class Kayaking extends Amenity implements Rentable {

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


    @Override
    public void rentGear() {

        if (gearStatus) {
            System.out.println("You have already rented gear");
        } else {
            gearStatus = true;
            BigDecimal price = new BigDecimal(getAmenityPrice()+10);
            BigDecimal roundedPrice = price.setScale(2, RoundingMode.HALF_UP);
            double newPrice = roundedPrice.doubleValue();
            setAmenityPrice(newPrice);
        }
    }

}
