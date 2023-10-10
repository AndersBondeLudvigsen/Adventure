import java.util.ArrayList;

public class Adventure {
    Player player = new Player();
    Map map = new Map();
    private Enemy enemy;

    public void moveNorth() {
        if (map.currentRoom.getNorthRoom() == null) {
            System.out.println("There is no room to the north.");
            System.out.println("Awaiting your command");
        } else {
            map.currentRoom = map.currentRoom.getNorthRoom();
            System.out.println(map.getCurrentRoom().getRoomName());
            System.out.println(map.currentRoom.getDescription());
            ArrayList<Item> itemArrayList = map.getCurrentRoom().getItems();
            for (Item item : itemArrayList) {
                System.out.println(item.getItemName() + ":" + item.getItemDescription());
            }
            ArrayList<Enemy> enemyArrayList = map.getCurrentRoom().getEnemyArrayList();
            for (Enemy enemy : enemyArrayList) {
                System.out.println(enemy.getName() + " : " + enemy.getDecription());
            }
                player.setPlayerPostion(map.getCurrentRoom());
                System.out.println("Awaiting your command");

        }
    }

    public void moveEast() {
        if (map.currentRoom.getEastRoom() == null) {
            System.out.println("There is no room to the east.");
            System.out.println("Awaiting your command");
        } else {
            map.currentRoom = map.currentRoom.getEastRoom();
            System.out.println(map.getCurrentRoom().getRoomName());
            System.out.println(map.currentRoom.getDescription());
            ArrayList<Item> itemArrayList = map.getCurrentRoom().getItems();
            for (Item item : itemArrayList) {
                System.out.println(item.getItemName() + ":" + item.getItemDescription());
            }
            ArrayList<Enemy> enemyArrayList = map.getCurrentRoom().getEnemyArrayList();
            for (Enemy enemy : enemyArrayList) {
                System.out.println(enemy.getName() + " : " + enemy.getDescription());
            }
                player.setPlayerPostion(map.getCurrentRoom());
                System.out.println("Awaiting your command");

        }
    }


    public void moveSouth() {
        if (map.currentRoom.getSouthRoom() == null) {
            System.out.println("There is no room to the south.");
            System.out.println("Awaiting your command");
        } else {
            map.currentRoom = map.currentRoom.getSouthRoom();
            System.out.println(map.getCurrentRoom().getRoomName());
            System.out.println(map.currentRoom.getDescription());
            ArrayList<Item> itemArrayList = map.getCurrentRoom().getItems();
            for (Item item : itemArrayList) {
                System.out.println(item.getItemName() + ":" + item.getItemDescription());
            }
            ArrayList<Enemy> enemyArrayList = map.getCurrentRoom().getEnemyArrayList();
            for (Enemy enemy : enemyArrayList) {
                System.out.println(enemy.getName() + " : " + enemy.getDescription());
            }
                player.setPlayerPostion(map.getCurrentRoom());
                System.out.println("Awaiting your command");

        }
    }
    public void moveWest() {
        if (map.currentRoom.getWestRoom() == null) {
            System.out.println("There is no room to the west.");
            System.out.println("Awaiting your command");
        } else {
            map.currentRoom = map.currentRoom.getWestRoom();
            System.out.println(map.getCurrentRoom().getRoomName());
            System.out.println(map.currentRoom.getDescription());
            ArrayList<Item> itemArrayList = map.getCurrentRoom().getItems();
            for (Item item : itemArrayList) {
                System.out.println(item.getItemName() + ":" + item.getItemDescription());
            }
            ArrayList<Enemy> enemyArrayList = map.getCurrentRoom().getEnemyArrayList();
            for (Enemy enemy : enemyArrayList) {
                System.out.println(enemy.getName() + " : " + enemy.getDecription());
            }
                player.setPlayerPostion(map.getCurrentRoom());
                System.out.println("Awaiting your command");

        }
    }
    public void pickUpItem() {
        player.pickUpItem(map.getCurrentRoom());
    }

    public void dropItem() {
        player.leaveItem(map.getCurrentRoom());
    }
    public enum Eatable {
        CAN_EAT,
        CANNOT_EAT,
        NOT_IN_INVENTORY
    }

    public enum Equip {
        CAN_EQUIP,
        CANNOT_EQUIP,
        NOT_IN_INVENTORY
    }
    public enum AttackEnum{
        MELEE,
        FIRED,
        NO_AMMO,
        ENEMY_DEAD,
        NO_WEAPON_EQUIPED,



    }
}










