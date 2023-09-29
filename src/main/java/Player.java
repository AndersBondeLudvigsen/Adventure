import java.util.ArrayList;
import java.util.Scanner;


public class Player {
    private ArrayList<Item> inventoryList = new ArrayList<>();
    private ArrayList<Item> roomItems = new ArrayList<>();
    private Scanner keyboard = new Scanner(System.in);
    private ArrayList<Item> itemArrayList;
    private Room playerPostion;

    public void setPlayerPostion(Room playerPostion) {
        this.playerPostion = playerPostion;
    }

    public Player() {
        itemArrayList = new ArrayList<>();
    }

    // Method to pick up an item from the room
    public void pickUpItem(Room currentroom) {
        System.out.println("What would you like to pick up");
        String item = keyboard.nextLine().toLowerCase();
        Item toRemove = null;
        for (Item i : currentroom.getItems()) {
            System.out.println(i.getItemName());
            if (i.getItemName().contains(item)) {
                inventoryList.add(i);
                System.out.println("You picked up " + item + ".");
                toRemove = i;
            } else {
                System.out.println("This item is not in the room.");
            }
        }
        if (toRemove != null) {
            currentroom.getItems().remove(toRemove);
        }
    }
    //Method to leave an item in the room

    public void leaveItem(Room currentroom) {
        System.out.println("What item would you like to drop");
        showInventory();
        String item = keyboard.nextLine().toLowerCase();
        Item toRemove = null;
        for (Item i : inventoryList) {
            System.out.println(i.getItemName());
            if (i.getItemName().contains(item)) {
                System.out.println("You left " + i.getItemName() + " in the room.");
                toRemove = i;
            } else {
                System.out.println("You don't have that item in your inventory.");
            }
        }
        if (toRemove != null) {
            currentroom.addItem(toRemove.getItemName(), toRemove.getItemDescription());
            inventoryList.remove(toRemove);
        }

    }
    public void showInventory() {
        ArrayList<Item> playerInventory = getInventory();
        if (!playerInventory.isEmpty()) {
            System.out.println("Your inventory:");
            for (Item item : playerInventory) {
                System.out.println(item.getItemName() + " ");
            }
        } else {
            System.out.println("Your inventory is empty.");
        }
    }

    private ArrayList<Item> getInventory() {
        return inventoryList;
    }


}



