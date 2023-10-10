import java.util.ArrayList;

public class Room {

    private String roomName;
    private String description;
    private Room northRoom;
    private Room eastRoom;
    private Room southRoom;
    private Room westRoom;
    private ArrayList<Item> itemArrayList = new ArrayList<>();
    private ArrayList<Enemy>enemyArrayList = new ArrayList<>();


    public void removeEnemy(Enemy enemy){
        enemyArrayList.remove(enemy);
    }
    public void addEnemyItem (Item enemyItem){
        itemArrayList.add(enemyItem);

    }

    public ArrayList<Enemy> getEnemyArrayList() {
        return enemyArrayList;
    }

    public Room(String roomName, String description) {
        this.roomName = roomName;
        this.description = description;
        this.northRoom = null;
        this.eastRoom = null;
        this.southRoom = null;
        this.westRoom = null;
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

    public String toString() {
        return roomName;
    }

    public void addItem(Item item) {
        itemArrayList.add(item);
    }
    public void addEnemy(Enemy enemy){
        enemyArrayList.add(enemy);

    }

    public ArrayList<Item> getItems() {
        return itemArrayList;
    }
    public Enemy getEnemy(){
        return enemyArrayList.get(0);
    }
}
