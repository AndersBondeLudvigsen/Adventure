public class Player {

    Map map = new Map();


    public void moveNorth(Room northRoom) {
        if (map.currentRoom.getNorthRoom() == null) {
            System.out.println("There is no room to the north.");
        } else if (!map.currentRoom.getNorthRoom().isVisited()) {
            System.out.println(map.currentRoom.getDescription());
            map.currentRoom = map.currentRoom.getNorthRoom();
        }
        else if (map.currentRoom != northRoom) {
            map.currentRoom = map.currentRoom.getNorthRoom();
            System.out.println("You delve deeper into the keep");
            System.out.println(map.currentRoom.getDescription());
            map.currentRoom.setIsVisited(true);
        }
    }

    public void moveEast(Room eastRoom) {
        if (map.currentRoom.getEastRoom() == null) {
            System.out.println("There is no room to the east.");
        } else if (!map.currentRoom.getEastRoom().isVisited()) {
            System.out.println(map.currentRoom.getDescription());
            map.currentRoom = map.currentRoom.getEastRoom();
        }
        else if (map.currentRoom != eastRoom) {
            map.currentRoom = map.currentRoom.getEastRoom();
            System.out.println("You delve deeper into the keep");
            System.out.println(map.currentRoom.getDescription());
            map.currentRoom.setIsVisited(true);
        }
    }

    public void moveSouth(Room southRoom) {
        if (map.currentRoom.getSouthRoom() == null) {
            System.out.println("There is no room to the south.");
        } else if (!map.currentRoom.getSouthRoom().isVisited()) {
            System.out.println(map.currentRoom.getDescription());
            map.currentRoom = map.currentRoom.getSouthRoom();
        }
        else if (map.currentRoom != southRoom) {
            map.currentRoom = map.currentRoom.getSouthRoom();
            System.out.println("You delve deeper into the keep");
            System.out.println(map.currentRoom.getDescription());
            map.currentRoom.setIsVisited(true);
        }
    }

    public void moveWest(Room westRoom) {
        if (map.currentRoom.getWestRoom() == null) {
            System.out.println("There is no room to the west.");
        } else if (!map.currentRoom.getWestRoom().isVisited()) {
            System.out.println(map.currentRoom.getDescription());
            map.currentRoom = map.currentRoom.getWestRoom();
        }
        else if (map.currentRoom != westRoom) {
            map.currentRoom = map.currentRoom.getWestRoom();
            System.out.println("You delve deeper into the keep");
            System.out.println(map.currentRoom.getDescription());
            map.currentRoom.setIsVisited(true);
        }



    }

    public void move(String direction) {
        Room nextRoom = null;

        switch (direction) {
            case "north":
                nextRoom = map.currentRoom.getNorthRoom();
                break;
            case "east":
                nextRoom = map.currentRoom.getEastRoom();
                break;
            case "south":
                nextRoom = map.currentRoom.getSouthRoom();
                break;
            case "west":
                nextRoom = map.currentRoom.getWestRoom();
                break;
            default:
                System.out.println("Invalid direction.");
                return;
        }

        if (nextRoom == null) {
            System.out.println("There is no room to the " + direction + ".");
        } else if (!nextRoom.isVisited()) {
            System.out.println(map.currentRoom.getDescription());
            map.currentRoom = nextRoom;
        } else if (map.currentRoom != nextRoom) {
            map.currentRoom = nextRoom;
            System.out.println("You delve deeper into the keep");
            System.out.println(map.currentRoom.getDescription());
            nextRoom.setIsVisited(true);
        }
    }

}

