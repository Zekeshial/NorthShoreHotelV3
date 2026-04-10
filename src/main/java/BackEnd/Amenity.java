package BackEnd;

public abstract class Amenity {

    private String amenityName;
    private boolean amenityAvailability;
    private double amenityPrice;
    private String amenityDescription;

    public Amenity(String amenityName, boolean amenityAvailability, double amenityPrice, String amenityDescription) {
        this.amenityName = amenityName;
        this.amenityAvailability = amenityAvailability;
        this.amenityPrice = amenityPrice;
        this.amenityDescription = amenityDescription;
    }

    public Amenity() {
        this.amenityName = "default";
        this.amenityAvailability = false;
        this.amenityPrice = 0.0;
        this.amenityDescription = "amenityDescription";
    }

    public String getAmenityName() {
        return amenityName;
    }

    public void setAmenityName(String amenityName) {
        this.amenityName = amenityName;
    }

    public boolean isAmenityAvailability() {
        return amenityAvailability;
    }

    public void setAmenityAvailability(boolean amenityAvailability) {
        this.amenityAvailability = amenityAvailability;
    }

    public double getAmenityPrice() {
        return amenityPrice;
    }

    public void setAmenityPrice(double amenityPrice) {
        this.amenityPrice = amenityPrice;
    }

    public String getAmenityDescription() {
        return amenityDescription;
    }

    public void setAmenityDescription(String amenityDescription) {
        this.amenityDescription = amenityDescription;
    }

    public abstract String toString();
}
