

public class Adventure {
private Player player = new Player();
    Map map = new Map();
    public void moveNorth(Room northRoom) {
        if (map.currentRoom.getNorthRoom() == null) {
            System.out.println("There is no room to the north.");
        } else if (!map.currentRoom.getNorthRoom().isVisited()) {
            System.out.println(map.currentRoom.getDescription());
            map.currentRoom = map.currentRoom.getNorthRoom();
            player.setPlayerPostion(map.getCurrentRoom());
        }
        else if (map.currentRoom != northRoom) {
            map.currentRoom = map.currentRoom.getNorthRoom();
            System.out.println("You delve deeper into the keep");
            System.out.println(map.currentRoom.getDescription());
            player.setPlayerPostion(map.getCurrentRoom());
            map.currentRoom.setIsVisited(true);
        }
    }

    public void moveEast(Room eastRoom) {
        if (map.currentRoom.getEastRoom() == null) {
            System.out.println("There is no room to the east.");
        } else if (!map.currentRoom.getEastRoom().isVisited()) {
            System.out.println(map.currentRoom.getDescription());
            map.currentRoom = map.currentRoom.getEastRoom();
            player.setPlayerPostion(map.getCurrentRoom());
        }
        else if (map.currentRoom != eastRoom) {
            map.currentRoom = map.currentRoom.getEastRoom();
            System.out.println("You delve deeper into the keep");
            System.out.println(map.currentRoom.getDescription());
            player.setPlayerPostion(map.getCurrentRoom());
            map.currentRoom.setIsVisited(true);
        }
    }

    public void moveSouth(Room southRoom) {
        if (map.currentRoom.getSouthRoom() == null) {
            System.out.println("There is no room to the south.");
        } else if (!map.currentRoom.getSouthRoom().isVisited()) {
            System.out.println(map.currentRoom.getDescription());
            map.currentRoom = map.currentRoom.getSouthRoom();
            player.setPlayerPostion(map.getCurrentRoom());
        }
        else if (map.currentRoom != southRoom) {
            map.currentRoom = map.currentRoom.getSouthRoom();
            System.out.println("You delve deeper into the keep");
            System.out.println(map.currentRoom.getDescription());
            player.setPlayerPostion(map.getCurrentRoom());
            map.currentRoom.setIsVisited(true);
        }
    }

    public void moveWest(Room westRoom) {
        if (map.currentRoom.getWestRoom() == null) {
            System.out.println("There is no room to the west.");
        } else if (!map.currentRoom.getWestRoom().isVisited()) {
            System.out.println(map.currentRoom.getDescription());
            map.currentRoom = map.currentRoom.getWestRoom();
            player.setPlayerPostion(map.getCurrentRoom());
        }
        else if (map.currentRoom != westRoom) {
            map.currentRoom = map.currentRoom.getWestRoom();
            System.out.println("You delve deeper into the keep");
            System.out.println(map.currentRoom.getDescription());
            map.currentRoom.setIsVisited(true);
        }
    }
public Player getPlayer(){
        return player;
}

}









