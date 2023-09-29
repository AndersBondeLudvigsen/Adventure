public class Item {

    private String itemName;
    private String itemDecription;

    public Item(String itemName, String itemDecription) {
        this.itemName = itemName;
        this.itemDecription = itemDecription;
    }

    public String getItemName() {
        return itemName;
    }


    public String getItemDescription() {
        return itemDecription;
    }
}
