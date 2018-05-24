import java.util.ArrayList;

public class CalculateTotalSimple implements CalculateTotalStrategy{
    private int totalAmount = 0;

    @Override
    public int calculateTotal(ArrayList<Item> items) {
        for (Item item:items) {
            totalAmount += item.getPrice();
        }
        return totalAmount;
    }
}