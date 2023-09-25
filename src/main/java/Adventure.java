public class Adventure {
    private Room currentRoom;
    Room room1 = new Room("", "");
    Room room2 = new Room("", "");
    Room room3 = new Room("", "");
    Room room4 = new Room("", "");
    Room room5 = new Room("", "");
    Room room6 = new Room("", "");
    Room room7 = new Room("", "");
    Room room8 = new Room("", "");

    public Adventure() {
    }


    public void buildRoom() {
        this.currentRoom = new Room("Room 5",
                " A derelict tailor's workshop, covered in cobwebs");


    }

    public void look() {
        System.out.println("You are standing in " + currentRoom.getRoomName() + currentRoom.getDescription());
    }

    public void moveSouth(Room southRoom) {
        if (currentRoom.equals(southRoom)) {
            currentRoom = currentRoom.getSouthRoom();
        } else {
            currentRoom = currentRoom.getSouthRoom();
        }


    }
}



