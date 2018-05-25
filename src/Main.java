public class Main {
    public static void main(String[] args) {
        ShoppingFacade shoppingFacade = new ShoppingFacade(ItemDatabaseControllerSingleton.getInstance().select());
        shoppingFacade.checkout();
    }
}