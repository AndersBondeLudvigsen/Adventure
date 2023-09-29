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

    public Room getPlayerPostion() {
        return playerPostion;
    }

    public Player() {
        itemArrayList = new ArrayList<>();
    }


    public ArrayList<Item> getItemArrayList() {
        return itemArrayList;
    }


    // Method to pick up an item from the room
    public void pickUpItem(Room currentroom) {
        System.out.println("What would you like to pick up");
        String item = keyboard.nextLine();
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
        getInventoryList();
        String item = keyboard.nextLine();
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

    public void getInventoryList() {
        for (Item i : inventoryList) {
            System.out.println(i.getItemName());
        }
    }
}



