public class LineItem {
    private int quantity;
    private Item item;

    public LineItem(String name, int price, int quantity) {
        this.quantity = quantity;
        this.item = new Item(name,price);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getTotalPrice(){
        return this.quantity*this.item.getPrice();
    }
}
