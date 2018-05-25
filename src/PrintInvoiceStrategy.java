import java.util.ArrayList;

public interface PrintInvoiceStrategy {
    public void printInvoice(ArrayList<LineItem> lineItems, int totalAmount, SelectedIOType selectedIOType);
}