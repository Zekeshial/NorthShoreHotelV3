package BackEnd;

import BackEnd.Interfaces.Pricable;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<Pricable> list;

    public ShoppingCart(ArrayList<Pricable> list) {
        this.list = list;
    }

    public ShoppingCart(){
        this.list = new ArrayList<>();
    }

    public ArrayList<Pricable> getList() {
        return list;
    }

    public void setList(ArrayList<Pricable> list) {
        this.list = list;
    }

    public void addItemToCart(Pricable item) {
        list.add(item);
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "list=" + list +
                '}';
    }

    public double getTotalCostOfItems(){
        double total = 0;

        for(Pricable price: list) {
            total += price.getPrice();
        }

        BigDecimal price = new BigDecimal(total);
        BigDecimal roundedPrice = price.setScale(2, RoundingMode.HALF_UP);
        return roundedPrice.doubleValue();
    }
}
