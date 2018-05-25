import java.sql.*;
import java.util.ArrayList;

public class ItemDatabaseControllerSingleton{
    private static Connection c = null;

    private static ItemDatabaseControllerSingleton ourInstance = new ItemDatabaseControllerSingleton();

    public static ItemDatabaseControllerSingleton getInstance() {
        return ourInstance;
    }

    private ItemDatabaseControllerSingleton() {
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = getConnection();
            stmt = c.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS \"item\" (\n" +
                    "  \"id\" char PRIMARY KEY NOT NULL,\n" +
                    "  \"name\" char(128) NOT NULL, \n" +
                    "  \"price\" integer(128) NOT NULL\n" +
                    ");";
            stmt.executeUpdate(sql);
            stmt.close();
            c.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:sqlite:outshop.db");
    }

    public void insert(Item item) {
        PreparedStatement stmt = null;
        try {
            c = getConnection();
            stmt = c.prepareStatement("INSERT INTO item (id,name,price) VALUES (?,?,?);");
            stmt.setString(1, item.getId());
            stmt.setString(2, item.getName());
            stmt.setInt(3, item.getPrice());
            stmt.executeUpdate();
            stmt.close();
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Item> select() {
        Statement stmt = null;
        ArrayList<Item> items = new ArrayList<Item>();
        try {
            c = getConnection();
            c.setAutoCommit(false);
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT * FROM item;");
            while ( rs.next() ) {
                String id = rs.getString("id");
                String name  = rs.getString("name");
                int price  = rs.getInt("price");
                items.add(new Item(name,price,id));
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return items;
    }

    public void truncate(){
        PreparedStatement stmt = null;
        try {
            c = getConnection();
            stmt = c.prepareStatement("DELETE FROM item;");
            stmt.executeUpdate();
            stmt.close();
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
