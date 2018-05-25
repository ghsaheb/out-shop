import java.util.ArrayList;

public class InvoicePrinterSimple implements PrintInvoiceStrategy{
    public void printInvoice(ArrayList<LineItem> lineItems,int totalAmount,SelectedIOType selectedIOType){
        selectedIOType.print("Product Price Quantity Total");
        for (int i = 0; i < lineItems.size(); i++) {
            selectedIOType.print(lineItems.get(i).getItem().getName()+" "+lineItems.get(i).getItem().getPrice()+"$ "+ lineItems.get(i).getQuantity() +" " +lineItems.get(i).getTotalPrice());
        }
        selectedIOType.print("-------------------------------------");
        selectedIOType.print("Total: " + totalAmount);
    }
}