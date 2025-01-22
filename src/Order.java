import java.util.ArrayList;

public class Order {
    private int orderID; //Must be a 4 digit number, use regex here
    private Customer customer;
    private ArrayList<Pizza> pizzaList;
    private double totalPrice;
    private String orderStatus; //"Pending" or "Complete"

    public Order(int orderID, Customer customer, ArrayList<Pizza> pizzaList) {
        this.orderID = orderID;
        this.customer = customer;
        this.pizzaList = pizzaList;
        this.totalPrice = calculateTotalPrice();
        this.orderStatus = "Pending";
    }

    public double calculateTotalPrice() {
        double total = 0;

        for (Pizza pizza : pizzaList) {
            total += pizza.calculatePrice();
        }

        return total;
    }

    public int getOrderID() {
        return this.orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getCustomerInformation() {
        return "Customer: " + this.customer.getName() + " Phone Number: " + this.customer.getPhoneNumber();
    }

    public ArrayList<Pizza> getPizzaList() {
        return this.pizzaList;
    }

    public void setPizzaList(ArrayList<Pizza> pizzas) {
        this.pizzaList = pizzas;
    }

    public double getTotalPrice() {
        this.totalPrice = calculateTotalPrice(); //Just to make sure 
        return this.totalPrice;
    }

    public String getOrderStatus() {
        return this.orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}
