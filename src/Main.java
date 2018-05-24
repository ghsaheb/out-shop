public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.addItem(new Item("LCD",10000));
        cart.addItem(new Item("Dish",2000));
        cart.addItem(new Item("Laptop",500));
        System.out.println("Total Amount"+cart.calculateTotal("simple"));
    }
}