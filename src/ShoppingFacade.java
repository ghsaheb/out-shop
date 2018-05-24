import java.util.ArrayList;
import java.util.HashMap;

public class ShoppingFacade {
    private HashMap<Integer, Item> itemsByIndex = new HashMap<>();
    private IOFactory io = new IOFactory();
    private Cart cart = new Cart();
    private Invoice invoice = new Invoice();
    private SelectedIOType selectedIOType = new SelectedIOType(io.getIOType("commandline"));
    private ProductListPrinter productListPrinter = new ProductListPrinter();


    public ShoppingFacade(ArrayList<Item> products) {
        for (int i = 1; i < products.size()+1; i++) {
            Item product = products.get(i-1);
            itemsByIndex.put(i,product);
        }
    }

    public void checkout(){
        selectedIOType.print("Welcome to out shop. please choose your options:");
        while (true) {
            productListPrinter.printProductList(itemsByIndex,selectedIOType);
            int selectedNumber = Integer.parseInt(selectedIOType.read());
            if (selectedNumber != 0) {
                cart.addItem(selectProduct(selectedNumber));
            } else {
                InvoicePrinter invoicePrinter = new InvoicePrinter();
                invoicePrinter.printInvoice(cart.getLineItems(),invoice.calculateTotal("simple", cart.getLineItems()));
                break;
            }
        }
    }

    public LineItem selectProduct(int selectedNumber){
        Item item = itemsByIndex.get(selectedNumber);
        selectedIOType.print("Quantity: ");
        int quantity = Integer.parseInt(io.getIOType("commandline").read());
        return new LineItem(item, quantity);
    }


}
