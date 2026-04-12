package BackEnd;

import BackEnd.Amenities.*;
import BackEnd.Interfaces.Pricable;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Catalog {

    private ArrayList<Amenity> list;

    public Catalog(ArrayList<Amenity> list) {
        this.list = list;
    }

    public Catalog(){
        this.list = new ArrayList<>();
    }


    public ArrayList<Amenity> getList() {
        return list;
    }

    public void setList(ArrayList<Amenity> list) {
        this.list = list;
    }


    public void addAmenity(Amenity amenityToAdd) {
        list.add(amenityToAdd);
    }

    public void removeAmenity(Amenity amenityToRemove) {
        list.remove(amenityToRemove);
    }

    public double getTotalCostOfAmenities(){
        double total = 0;
        ArrayList<Pricable> pricelist = new ArrayList<>();

        for (Amenity amenity: list){
            if (amenity instanceof Pricable) {
                pricelist.add((Pricable) amenity);
            }
        }

        for(Pricable price: pricelist) {
            total += price.getPrice();
        }

        BigDecimal price = new BigDecimal(total);
        BigDecimal roundedPrice = price.setScale(2, RoundingMode.HALF_UP);
        return roundedPrice.doubleValue();
    }


    @Override
    public String toString() {
        return "Catalog{" +
                "list=" + list +
                '}';
    }

    static void main(String[] args) {
    }
}
