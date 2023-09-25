public class Adventure {
    private Room currentRoom;


    public Adventure() {
    }


    public void buildRoom() {
        this.currentRoom = new Room("Room 5",
            " A derelict tailor's workshop, covered in cobwebs");


    }
public void look(){
    System.out.println("You are standing in " + currentRoom.getRoomName()+ currentRoom.getDescription());
}
public void moveSouth(Room southRoom){
if (currentRoom.equals(southRoom)) {
            currentRoom = currentRoom.getSouthRoom();
        } else {
            currentRoom = currentRoom.getSouthRoom();
        }


}



