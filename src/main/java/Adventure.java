import java.util.Scanner;

public class Adventure {

Map map = new Map();

    public void moveNorth(Room northRoom) {
        if (map.currentRoom != northRoom && northRoom == null) {
            System.out.println("There is no room to the north.");
        } else if (!currentRoom.getNorthRoom().isVisited()) {
            System.out.println(currentRoom.getDescription());
            currentRoom = currentRoom.getNorthRoom();
        }
        else if (currentRoom != currentRoom.getNorthRoom()) {
            currentRoom = currentRoom.getNorthRoom();
            System.out.println("You delve deeper into the keep");
            System.out.println(currentRoom.getDescription());
            currentRoom.setIsVisited(true);
        }
    }

    public void moveEast(Room eastRoom) {
        if (map.currentRoom != eastRoom && eastRoom == null) {
            System.out.println("There is no room to the east.");
        } else if (!map.currentRoom.getEastRoom().isVisited()) {
            System.out.println(map.currentRoom.getDescription());
            map.currentRoom = map.currentRoom.getEastRoom();
        }
        else if (map.currentRoom != map.currentRoom.getEastRoom()) {
            map.currentRoom = map.currentRoom.getEastRoom();
            System.out.println("You delve deeper into the keep");
            System.out.println(map.currentRoom.getDescription());
            map.currentRoom.setIsVisited(true);
        }
    }

    public void moveSouth(Room southRoom) {
        if (map.currentRoom != southRoom && southRoom == null) {
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
        if (map.currentRoom != westRoom && westRoom == null) {
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
}









