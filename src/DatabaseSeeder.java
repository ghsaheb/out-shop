public class DatabaseSeeder {
    private static DatabaseSeeder mInstance;

    private DatabaseSeeder() {
    }

    public static DatabaseSeeder getInstance() {
        if (mInstance == null) {
            mInstance = new DatabaseSeeder();
        }
        return mInstance;
    }

    public void addProductsToDB() {
        ItemDatabaseControllerSingleton itemDatabaseControllerSingleton = ItemDatabaseControllerSingleton.getInstance();
        itemDatabaseControllerSingleton.truncate();
        itemDatabaseControllerSingleton.insert(new Item("LCD",1000));
        itemDatabaseControllerSingleton.insert(new Item("Dishwasher",2000));
        itemDatabaseControllerSingleton.insert(new Item("Laptop",3000));
    }
}
