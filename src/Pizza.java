import java.util.ArrayList;

public class Pizza {
    private String size; //Small, Medium, Large, Extra Large
    private String crust; //Thin, Regular, Thick
    private ArrayList<String> toppings;
    private double price;

    public Pizza(String size, String crust, String... toppings) {
        this.size = size;
        this.crust = crust;
        this.toppings = new ArrayList<>(); //Initialize the ArrayList to prevent it from being NULL
        for (String topping : toppings) {
            this.toppings.add(topping);
        }
        this.price = calculatePrice();
    }

    public double calculatePrice() {
        double basePrice = 0;
        if (size == "Small") {
            basePrice += 5;
        } else if (size == "Medium") {
            basePrice += 7;
        } else if (size == "Large") {
            basePrice += 9;
        } else if (size == "Extra Large") {
            basePrice += 11;
        } else {
            basePrice += 9; //Since Java does not support default parameters for a constructor, assume pizza is large here
        }

        double crustPrice = 0;

        if (crust == "thin") {
            crustPrice -= 1;
        } else if (crust == "thick") {
            crustPrice += 2;
        } else {
            crustPrice = 0; //Default to crust = normal
        }

        double toppingPrice = this.toppings.size() * 0.5;
        
        return basePrice + crustPrice + toppingPrice;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCrust() {
        return this.crust;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }

    public ArrayList<String> getToppings() {
        return this.toppings;
    }

    public void changeToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "Pizza:\nsize = " + this.size + "\ncrust = " + this.crust + "\ntoppings = " + this.toppings + "\nprice = " + this.price + "\n";
    }
}
