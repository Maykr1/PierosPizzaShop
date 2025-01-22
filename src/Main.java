public class Main {
    public static void main(String[] args) {
        //Create Customer
        Customer customer1 = new Customer("Ethan Clark", "555-555-5555");

        //Create Pizzas
        Pizza pizza1 = new Pizza("Large", "Thin", "Pepperoni", "Sausage"); //...toppings allows you to add unlimited parameters in the form of a list
        Pizza pizza2 = new Pizza("Large", "Regular", "Mushroom", "Sausage");
        Pizza pizza3 = new Pizza("Small", "Thick", "Banana Peppers", "Pineapple");

        //Create Order
        Order order1 = new Order(0001, customer1, pizza1, pizza2, pizza3);
        
        //Create PizzaShop
        PizzaShop PieroPizza = new PizzaShop();

        PieroPizza.addMenuItem(pizza1);
        PieroPizza.addMenuItem(pizza2);
        PieroPizza.addMenuItem(pizza3);

        //Place order 1
        PieroPizza.placeOrder(order1);


        //Create order 2
        PieroPizza.getMenu(); //Needs reformatting
        Order order2 = new Order(0001, customer1, pizza2, pizza3);

        PieroPizza.placeOrder(order2);
        PieroPizza.getOrders();
    }
}
