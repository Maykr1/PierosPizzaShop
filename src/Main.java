import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> toppings = new ArrayList<>();
        toppings.add("Pepperoni");
        toppings.add("Sausage");
        toppings.add("Mushrooms");

        Pizza pizza1 = new Pizza("small", "thin", toppings);

        System.out.println(pizza1.getSize());
        System.out.println(pizza1.getCrust());
        System.out.println(pizza1.getToppings());
        System.out.println(pizza1.getPrice());
    }
}
