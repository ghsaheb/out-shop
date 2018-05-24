import java.util.ArrayList;

public class Cart {
    private ArrayList<Item> items = new ArrayList<Item>();
    private CalculateTotalFactory calculateTotalFactory = new CalculateTotalFactory();

    public void addItem(Item item){
        this.items.add(item);
    }

    public int calculateTotal(String type){
        return calculateTotalFactory.getCalculationType(type).calculateTotal(items);
    }
}