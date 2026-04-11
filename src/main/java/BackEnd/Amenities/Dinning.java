package BackEnd.Amenities;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Dinning extends Amenity {

    private String dinningType;
    private boolean foodDelivery;

    public Dinning(String amenityName, boolean amenityAvailability, double amenityPrice, String amenityDescription, String dinningType, boolean foodDelivery) {
        super(amenityName, amenityAvailability, amenityPrice, amenityDescription);
        this.dinningType = dinningType;
        this.foodDelivery = foodDelivery;
    }

    public Dinning(String dinningType, boolean foodDelivery) {
        this.dinningType = dinningType;
        this.foodDelivery = foodDelivery;
    }

    public Dinning() {
        this.dinningType = "dinningType";
        this.foodDelivery = false;
    }


    public String getDinningType() {
        return dinningType;
    }

    public void setDinningType(String dinningType) {
        this.dinningType = dinningType;
    }

    public boolean isFoodDelivery() {
        return foodDelivery;
    }

    public void setFoodDelivery(boolean foodDelivery) {
        this.foodDelivery = foodDelivery;
    }

    public void deliveryChoice() {

        if (foodDelivery) {
            System.out.println("You have already rented gear");
        } else {
            foodDelivery = true;
            BigDecimal price = new BigDecimal(getAmenityPrice()+5);
            BigDecimal roundedPrice = price.setScale(2, RoundingMode.HALF_UP);
            double newPrice = roundedPrice.doubleValue();
            setAmenityPrice(newPrice);
        }
    }


    @Override
    public String toString() {
        return "Dinning{" +
                "amenityName='" + getAmenityName() + '\'' +
                ", amenityAvailability=" + isAmenityAvailability() +
                ", amenityPrice=" + getAmenityPrice() +
                ", amenityDescription='" + getAmenityDescription() + '\'' +
                ", dinningType='" + dinningType + '\'' +
                ", foodDelivery=" + foodDelivery +
                '}';
    }
}
