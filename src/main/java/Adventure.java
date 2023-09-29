import java.util.ArrayList;

public class Adventure {
    private Player player = new Player();
    Map map = new Map();

    public void moveNorth(Room northRoom) {
        if (map.currentRoom.getNorthRoom() == null) {
            System.out.println("There is no room to the north.");
        } else {
            map.currentRoom = map.currentRoom.getNorthRoom();
            System.out.println(map.getCurrentRoom().getRoomName());
            System.out.println(map.currentRoom.getDescription());
            ArrayList<Item> itemArrayList = map.getCurrentRoom().getItems();
            for (Item item : itemArrayList) {
                System.out.println(item.getItemName() + ":" + item.getItemDescription());

            }
            player.setPlayerPostion(map.getCurrentRoom());
        }
    }

    public void moveEast(Room eastRoom) {
        if (map.currentRoom.getEastRoom() == null) {
            System.out.println("There is no room to the east.");
        } else {
            map.currentRoom = map.currentRoom.getEastRoom();
            System.out.println(map.getCurrentRoom().getRoomName());
            System.out.println(map.currentRoom.getDescription());
            ArrayList<Item> itemArrayList = map.getCurrentRoom().getItems();
            for (Item item : itemArrayList) {
                System.out.println(item.getItemName() + ":" + item.getItemDescription());
            }
            player.setPlayerPostion(map.getCurrentRoom());
        }
    }


    public void moveSouth(Room southRoom) {
        if (map.currentRoom.getSouthRoom() == null) {
            System.out.println("There is no room to the south.");
        } else {
            map.currentRoom = map.currentRoom.getSouthRoom();
            System.out.println(map.getCurrentRoom().getRoomName());
            System.out.println(map.currentRoom.getDescription());
            ArrayList<Item> itemArrayList = map.getCurrentRoom().getItems();
            for (Item item : itemArrayList) {
                System.out.println(item.getItemName() + ":" + item.getItemDescription());
            }
            player.setPlayerPostion(map.getCurrentRoom());
        }
    }

    public void moveWest(Room westRoom) {
        if (map.currentRoom.getWestRoom() == null) {
            System.out.println("There is no room to the west.");
        } else {
            map.currentRoom = map.currentRoom.getWestRoom();
            System.out.println(map.getCurrentRoom().getRoomName());
            System.out.println(map.currentRoom.getDescription());
            ArrayList<Item> itemArrayList = map.getCurrentRoom().getItems();
            for (Item item : itemArrayList) {
                System.out.println(item.getItemName() + ":" + item.getItemDescription());
            }
            player.setPlayerPostion(map.getCurrentRoom());
        }
    }
}









