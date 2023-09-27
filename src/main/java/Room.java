public class Room {

    private String roomName;
    private String description;
    private Room northRoom;
    private Room eastRoom;
    private Room southRoom;
    private Room westRoom;
    private boolean isVisited;

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
        this.isVisited = true;
    }

    public boolean isVisited() {
        return false;
    }
}