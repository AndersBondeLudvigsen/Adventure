import java.util.ArrayList;

public class Room {

    private String roomName;
    private String description;
    private Room northRoom;
    private Room eastRoom;
    private Room southRoom;
    private Room westRoom;
    private boolean isVisited;
    private ArrayList<Item> itemArrayList = new ArrayList<>();

    public Room(String roomName, String description) {
        this.roomName = roomName;
        this.description = description;
        this.northRoom = null;
        this.eastRoom = null;
        this.southRoom = null;
        this.westRoom = null;
        this.isVisited = false;
    }
    public String getRoomName() {
        return roomName;
    }

    public String getRoomName() {
        return roomName;
    }

    public String getDescription() {
        return description;
    }

    // Getters og Setters
    public void setNorthRoom(Room northRoom) {
        this.northRoom = northRoom;
    }

    public void setEastRoom(Room eastRoom) {
        this.eastRoom = eastRoom;
    }

    public void setSouthRoom(Room southRoom) {
        this.southRoom = southRoom;
    }

    public void setWestRoom(Room westRoom) {
        this.westRoom = westRoom;
    }

    public Room getNorthRoom() {
        return northRoom;
    }

    public Room getEastRoom() {
        return eastRoom;
    }

    public Room getSouthRoom() {
        return southRoom;
    }

    public Room getWestRoom() {
        return westRoom;
    }

    public void setIsVisited(boolean isVisited) {
        this.isVisited = false;
    }

    public boolean isVisited() {
        return true;
    }

    public String toString() {
        return roomName;
    }

    public void addItem(String itemName, String itemDecription) {
        Item item = new Item(itemName, itemDecription);
        itemArrayList.add(item);
    }

    public void setItemArrayList(ArrayList<Item> itemlist) {
        this.itemArrayList = itemlist;
    }

    public void createItem(String itemName, String itemDecription) {
        Item item = new Item(itemName, itemDecription);
        itemArrayList.add(item);
    }

    public ArrayList<Item> getItems() {
        return itemArrayList;
    }
}
