public class Main {
    public static void main(String[] args) {
        DatabaseSeeder databaseSeeder = DatabaseSeeder.getInstance();
        databaseSeeder.addProductsToDB();
        ShoppingFacade shoppingFacade = new ShoppingFacade(ItemDatabaseControllerSingleton.getInstance().select());
        shoppingFacade.checkout();
    }
}