public class Main {
    public static void main(String[] args) {
        addProductsToDB();
        ShoppingFacade shoppingFacade = new ShoppingFacade(ItemDatabaseControllerSingleton.getInstance().select());
        shoppingFacade.checkout();
    }

    private static void addProductsToDB() {
        ItemDatabaseControllerSingleton itemDatabaseControllerSingleton = ItemDatabaseControllerSingleton.getInstance();
        itemDatabaseControllerSingleton.insert(new Item("LCD",1000));
        itemDatabaseControllerSingleton.insert(new Item("Dishwasher",2000));
        itemDatabaseControllerSingleton.insert(new Item("Laptop",3000));
    }
}