public class Main {
    public static void main(String[] args) {
        addProductsToDB();
        ShoppingFacade shoppingFacade = new ShoppingFacade(ItemDatabaseControllerSingleton.getInstance().select());
        shoppingFacade.checkout();
    }

    private static void addProductsToDB() {
        ItemDatabaseControllerSingleton.getInstance().insert(new Item("LCD",1000));
        ItemDatabaseControllerSingleton.getInstance().insert(new Item("Dish",2000));
        ItemDatabaseControllerSingleton.getInstance().insert(new Item("Laptop",3000));
    }
}