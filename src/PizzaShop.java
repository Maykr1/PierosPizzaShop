import java.util.ArrayList;

public class PizzaShop {
    private ArrayList<Pizza> menu;
    private ArrayList<Order> orders;

    public PizzaShop() {
        this.menu = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public void getMenu() {
        if (menu.isEmpty()) {
            System.out.println("Menu is empty!");
        } else {
            for (Pizza pizza : this.menu) {
                System.out.println(pizza);
            }
        }
    }

    public void getOrders() {
        if (orders.isEmpty()) {
            System.out.println("Order list is empty!");
        } else {
            for (Order order : this.orders) {
                System.out.println(order);
            }
        }
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
