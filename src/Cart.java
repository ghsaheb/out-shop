import java.util.ArrayList;

public class Cart {
    private ArrayList<LineItem> lineItems = new ArrayList<>();

    public void addItem(LineItem lineItem){
        boolean notExists = true;
        for (LineItem lineItem1 : lineItems) {
            if (lineItem1.getItem().equals(lineItem.getItem())){
                notExists = false;
                lineItem1.setQuantity(lineItem1.getQuantity()+lineItem.getQuantity());
            }
        }
        if(notExists)
            this.lineItems.add(lineItem);
    }

    public ArrayList<LineItem> getLineItems() {
        return lineItems;
    }
}