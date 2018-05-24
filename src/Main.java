import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ItemDatabaseControllerSingleton.getInstance().insert(new Item("LCD",1000));
        ItemDatabaseControllerSingleton.getInstance().insert(new Item("Dish",2000));
        ItemDatabaseControllerSingleton.getInstance().insert(new Item("Laptop",3000));
        ArrayList<Item> products = ItemDatabaseControllerSingleton.getInstance().select();
        for (Item product : products) {
            System.out.println(product.getName() + " " + product.getPrice());
        }
        Cart cart = new Cart();
        cart.addItem(new LineItem("LCD",1000,2));
        cart.addItem(new LineItem("Dish",2000,1));
        cart.addItem(new LineItem("Laptop",500,1));
        Invoice invoice = new Invoice();
        IOFactory io = new IOFactory();
        io.getIOType("commandline").print("Welcome to out shop . please choose your options:");
        System.out.println(Integer.parseInt(io.getIOType("commandline").read()));
        System.out.println("Total Amount"+invoice.calculateTotal("simple",cart.getLineItems()));
    }
}