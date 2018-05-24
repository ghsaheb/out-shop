public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.addItem(new LineItem("LCD",1000,2));
        cart.addItem(new LineItem("Dish",2000,1));
        cart.addItem(new LineItem("Laptop",500,1));
        Invoice invoice = new Invoice();
        System.out.println("Total Amount"+invoice.calculateTotal("simple",cart.getLineItems()));
    }
}