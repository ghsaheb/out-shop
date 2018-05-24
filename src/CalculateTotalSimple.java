import java.util.ArrayList;

public class CalculateTotalSimple implements CalculateTotalStrategy{
    private int totalAmount = 0;

    @Override
    public int calculateTotal(ArrayList<LineItem> lineItems) {
        for (LineItem lineItem:lineItems) {
            totalAmount += lineItem.getTotalPrice();
        }
        return totalAmount;
    }
}