import java.util.HashMap;

public class ProductListPrinter {

    public void printProductList(HashMap<Integer,Item>itemsByIndex, SelectedIOType selectedIOType) {
        for (int i = 1; i < itemsByIndex.size()+1; i++) {
            Item product = itemsByIndex.get(i);
            selectedIOType.print(i + "-" + product.getName() + " " + product.getPrice() + "$");
        }
        selectedIOType.print("0-Finish");
    }
}
