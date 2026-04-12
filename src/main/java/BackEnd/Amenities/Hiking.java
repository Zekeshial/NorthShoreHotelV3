package BackEnd.Amenities;

import BackEnd.Interfaces.Pricable;

public class Hiking extends Amenity implements Pricable {

    private String trailType, trailLocation;
    private  int trailDifficulty;

    public Hiking(String amenityName, boolean amenityAvailability, double amenityPrice, String amenityDescription, String trailType, String trailLocation, int trailDifficulty) {
        super(amenityName, amenityAvailability, amenityPrice, amenityDescription);
        this.trailType = trailType;
        this.trailLocation = trailLocation;
        this.trailDifficulty = trailDifficulty;
    }

    public Hiking(String trailType, String trailLocation, int trailDifficulty) {
        this.trailType = trailType;
        this.trailLocation = trailLocation;
        this.trailDifficulty = trailDifficulty;
    }

    public Hiking() {
        this.trailType = "default";
        this.trailLocation = null;
        this.trailDifficulty = 0;
    }

    public String getTrailType() {
        return trailType;
    }

    public void setTrailType(String trailType) {
        this.trailType = trailType;
    }

    public String getTrailLocation() {
        return trailLocation;
    }

    public void setTrailLocation(String trailLocation) {
        this.trailLocation = trailLocation;
    }

    public int getTrailDifficulty() {
        return trailDifficulty;
    }

    public void setTrailDifficulty(int trailDifficulty) {
        this.trailDifficulty = trailDifficulty;
    }

    @Override
    public String toString() {
        return "Hiking{" +
                "\namenityName='" + getAmenityName() +
                "\namenityAvailability=" + isAmenityAvailability() +
                "\namenityPrice=" + getAmenityPrice() +
                "\namenityDescription='" + getAmenityDescription() + '\'' +
                "\ntrailType='" + trailType + '\'' +
                "\ntrailLocation='" + trailLocation + '\'' +
                "\ntrailDifficulty=" + trailDifficulty +
                '}';
    }

    @Override
    public double getPrice() {
        return getAmenityPrice();
    }
}
