import java.util.ArrayList;

public class Cart {
    private ArrayList<LineItem> lineItems = new ArrayList<>();

    public void addItem(LineItem lineItem){
        this.lineItems.add(lineItem);
    }

    public ArrayList<LineItem> getLineItems() {
        return lineItems;
    }
}