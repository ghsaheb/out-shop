import java.util.UUID;

public class Item {
    private String name;
    private int price;
    private String id;

    public Item(String name, int price, String id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public Item(String name, int price) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getId() {
        return id;
    }
}