public class Room {

    public String getRoomName() {
        return roomName;
    }

    public String getDescription() {
        return description;
    }

    private String roomName;
    private String description;
    private Room northRoom;
    private Room eastRoom;
    private Room southRoom;
    private Room westRoom;

    public Room(String roomName, String description) {
        this.roomName = roomName;
        this.description = description;
    }

    public void setNorthRoom(Room room) {
        this.northRoom = northRoom;
    }

    public void setEastRoom(Room room) {
        this.eastRoom = eastRoom;
    }

    public void setSouthRoom(Room room) {
        this.southRoom = southRoom;
    }

    public void setWestRoom(Room room) {
        this.westRoom = westRoom;
    }


}