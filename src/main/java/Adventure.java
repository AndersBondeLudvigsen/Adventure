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
/*public void moveSouth(Room southRoom){
if (room.equals("mother")) {
            current = current.getMother();
        } else {
            current = current.getFather();
        }*/


}



