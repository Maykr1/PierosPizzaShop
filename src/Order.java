import java.util.ArrayList;

public class Order {
    private int orderID; //Must be a 4 digit number, use regex here
    private Customer customer;
    private ArrayList<Pizza> pizzaList;
    private double totalPrice;
    private String orderStatus; //"Pending" or "Complete"
    private static int nextOrderID = 1;

    public Order(int orderID, Customer customer, Pizza... pizzaList) {
        this.orderID = orderID;
        this.customer = customer;
        this.pizzaList = new ArrayList<>();
        for (Pizza pizza : pizzaList) {
            this.pizzaList.add(pizza);
        }
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

    @Override
    public String toString() {
        return "Order:\nOrderID = " + this.orderID + "\n Customer Name = " + this.customer.getName() + "\n Items = " + this.pizzaList + "\n Total Price = " + this.totalPrice + "\n Order Status = " + this.orderStatus + "\n"; //Note: this.pizzaList is using pizza.ToString(); Needs to be formatted better
    }

    public static int generateOrderID() {
        return nextOrderID++;
    }
}
