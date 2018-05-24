import java.util.ArrayList;

public class InvoicePrinter {
    public void printInvoice(ArrayList<LineItem> lineItems,int totalAmount){
        System.out.println("Product Price Quantity Total");
        for (int i = 0; i < lineItems.size(); i++) {
            System.out.println(lineItems.get(i).getItem().getName()+" "+lineItems.get(i).getItem().getPrice()+" "+ lineItems.get(i).getQuantity() +" " +lineItems.get(i).getTotalPrice());
        }
        System.out.println("-------------------------------------");
        System.out.println("Total: " + totalAmount);
    }
}
