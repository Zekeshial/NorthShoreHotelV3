package BackEnd.Amenities;

import BackEnd.Interfaces.Pricable;

import java.math.BigDecimal;
import java.math.RoundingMode;
/**
 * The Dinning class is an amenity of the North Shore Hotel that handles the information related to the idea of dinning at this establishment.
 * @Author Zachary Sandness
 */
public class Dinning extends Amenity implements Pricable {

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
                "\namenityName='" + getAmenityName() +
                "\namenityAvailability=" + isAmenityAvailability() +
                "\namenityPrice=" + getAmenityPrice() +
                "\namenityDescription='" + getAmenityDescription() + '\'' +
                "\ndinningType='" + dinningType + '\'' +
                "\nfoodDelivery=" + foodDelivery +
                '}';
    }

    /**
     * gives you the price of the amenity based on if you want food delivery or not.
     * @return Give you the price of the amenity as a double.
     */
    @Override
    public double getPrice() {
        if (isFoodDelivery()) {
            BigDecimal price = new BigDecimal(getAmenityPrice()+10);
            BigDecimal roundedPrice = price.setScale(2, RoundingMode.HALF_UP);
            double newPrice = roundedPrice.doubleValue();
            return newPrice;
        } else {
            return getAmenityPrice();
        }
    }
}
