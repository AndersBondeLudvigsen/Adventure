public class Room {

    private String roomName;

    private Room northRoom;
    private Room eastRoom;
    private Room southRoom;
    private Room westRoom;

    public Room(String roomName){
        this.roomName = roomName;
    }
    public void setNorthRoom(Room room) {
        this.northRoom = northRoom;
    } public void setEastRoom(Room room) {
        this.eastRoom = eastRoom;
    } public void setSouthRoom(Room room) {
        this.southRoom = southRoom;
    } public void setWestRoom(Room room) {
        this.westRoom = westRoom;
    }


}