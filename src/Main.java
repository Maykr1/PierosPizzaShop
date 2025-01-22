import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Create Customer
        Customer customer1 = new Customer("Ethan Clark", "555-555-5555");

        //Create Pizzas
        ArrayList<String> toppings1 = new ArrayList<>();
        toppings1.add("Pepperoni");
        toppings1.add("Sausage");
        Pizza pizza1 = new Pizza("Large", "Thin", toppings1);

        ArrayList<String> toppings2 = new ArrayList<>();
        toppings2.add("Mushroom");
        toppings2.add("Sausage");
        Pizza pizza2 = new Pizza("Large", "Regular", toppings2);

        ArrayList<String> toppings3 = new ArrayList<>();
        toppings3.add("Pepperoni");
        toppings3.add("Sausage");
        Pizza pizza3 = new Pizza("Small", "Thick", toppings3);

        //Create Order
        ArrayList<Pizza> pizzaList = new ArrayList<>();
        pizzaList.add(pizza1);
        pizzaList.add(pizza2);
        pizzaList.add(pizza3);
        Order order1 = new Order(0001, customer1, pizzaList);
        
        //Create PizzaShop
        ArrayList<Order> orderList = new ArrayList<>();
        orderList.add(order1);
        PizzaShop PieroPizza = new PizzaShop(pizzaList, orderList);

        ArrayList<Pizza> pizzaList2 = new ArrayList<>();
        pizzaList2 = PieroPizza.getMenu();
        Order order2 = new Order(0001, customer1, pizzaList2);

        PieroPizza.placeOrder(order2);
    }
}
