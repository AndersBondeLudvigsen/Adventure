public class Adventure {
    public Room currentRoom;
    private Room room1, room2, room3, room4, room5, room6, room7, room8, room9;

    public Adventure() {
        room1 = new Room("Room 1", "Description for Room 1");
        room2 = new Room("Room 2", "Description for Room 2");
        room3 = new Room("Room 3", "Description for Room 3");
        room4 = new Room("Room 4", "Description for Room 4");
        room5 = new Room("Room 5", "Description for Room 5");
        room6 = new Room("Room 6", "Description for Room 6");
        room7 = new Room("Room 7", "Description for Room 7");
        room8 = new Room("Room 8", "Description for Room 8");
        room9 = new Room("Room 9", "Description for Room 9");

        currentRoom = room1;


        room1.setEastRoom(room2);
        room1.setSouthRoom(room4);
        room1.setNorthRoom(null);
        //
        room2.setEastRoom(room3);
        room2.setWestRoom(room1);
        //
        room3.setSouthRoom(room6);
        room3.setWestRoom(room2);
        //
        room4.setNorthRoom(room1);
        room4.setSouthRoom(room7);
        //
        room5.setSouthRoom(room8);
        //
        room6.setNorthRoom(room3);
        room6.setSouthRoom(room9);
        //
        room7.setNorthRoom(room4);
        room7.setEastRoom(room8);
        //
        room8.setNorthRoom(room5);
        room8.setEastRoom(room9);
        room8.setWestRoom(room7);
        //
        room9.setNorthRoom(room6);
        room9.setWestRoom(room8);
    }
            public void look() {
            System.out.println("You are standing in " + currentRoom.getRoomName() + currentRoom.getDescription());
        }

        public void moveNorth (Room northRoom){
            if (northRoom == null) {
                 System.out.println("There is no room to the north.");
            } else if (currentRoom != northRoom) {
                currentRoom = northRoom;
                System.out.println("You delve deeper into the keep");
            }
        }
        public void moveEast (Room eastRoom){
            if (currentRoom.getEastRoom() == null) {
                System.out.println("There is no room to the east.");
            } else if (currentRoom != eastRoom) {
                currentRoom = eastRoom;
                System.out.println("You delve deeper into the keep");
            }
        }
        public void moveSouth (Room southRoom){
            if (southRoom == null) {
                System.out.println("There is no room to the south.");
            } else if (currentRoom != southRoom) {
                currentRoom = southRoom;
                System.out.println("You delve deeper into the keep");
            }
        }


        public void moveWest (Room westRoom){
            if (westRoom == null) {
                System.out.println("There is no room to the west.");
            } else if (currentRoom != westRoom) {
                currentRoom = westRoom;
                System.out.println("You delve deeper into the keep");
            }


        }
    }








