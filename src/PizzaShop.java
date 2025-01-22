import java.util.ArrayList;

public class PizzaShop {
    private ArrayList<Pizza> menu;
    private ArrayList<Order> orders;

    public PizzaShop(ArrayList<Pizza> menu, ArrayList<Order> orders) {
        this.menu = menu;
        this.orders = orders;
    }

    public ArrayList<Pizza> getMenu() {
        return this.menu;
    }

    public ArrayList<Order> getOrders() {
        return this.orders;
    }

    public void clearOrders() {
        orders.clear();
    }

    public void addMenuItem(Pizza pizza) {
        this.menu.add(pizza);
    }

    public void removeMenuItem(Pizza pizza) {
        this.menu.remove(pizza);
    }

    public void placeOrder(Order order) {
        try {
            orders.add(order);
            System.out.println("Order placed successfully!");
        } catch (Exception e){ 
            System.out.println("Order failed due to " + e + ". Please try again later.");
        }
    }
}
