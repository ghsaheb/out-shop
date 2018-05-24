import java.util.ArrayList;

public class Invoice {
    private CalculateTotalFactory calculateTotalFactory = new CalculateTotalFactory();

    public int calculateTotal(String type, ArrayList<LineItem> lineItems){
        return calculateTotalFactory.getCalculationType(type).calculateTotal(lineItems);
    }
}