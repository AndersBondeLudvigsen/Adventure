import java.util.Scanner;

public class Userinterface {
    Player player = new Player();
    Adventure adventure = new Adventure();
    Map map = new Map();
    public void play() {
        Scanner keyboard = new Scanner(System.in);
        boolean exit = false;
        System.out.println("Welcome to game you are standing in " + map.currentRoom.getRoomName());
        System.out.println("Start by going south or east ");
        System.out.println("Type help for help");
        while (!exit) {
            String userInput = keyboard.nextLine().toLowerCase(); // Converter input så man kan skrive med små og store bogstaver.
            // Fjerner mellemrum og go hvis det bliver skrevet
            String Input = userInput.replace("go", "").replace("around", "").trim();
            switch (Input) {
                case "north", "n" -> {
                    System.out.println("Going North");
                    adventure.moveNorth(map.currentRoom.getNorthRoom());

                }
                case "south", "s" -> {
                    System.out.println("Going South");
                    player.moveSouth(map.currentRoom.getSouthRoom());

                }
                case "west", "w" -> {
                    System.out.println("Going West");
                   player.moveWest(map.currentRoom.getWestRoom());

                }
                case "east", "e" -> {
                    System.out.println("Going East");
                    player.moveEast(map.currentRoom.getEastRoom());

                }
                case "look", "look around" -> look();
                case "help" -> help();
                case "exit" -> exit = true;
                default -> System.out.println("Unknown input");

            }


        }

    }
    // metoden for hvis man skal bruge hjælp
    public void help() {
        System.out.println("You are standing in " + map.getCurrentRoom().getRoomName());
        System.out.println("In this game you can move in 4 directions");
        System.out.println("North, South, East, West");
        System.out.println("Type 'look around to to see which directions you may move to");
        System.out.println("Type exit to exit the game");
    }

    // look funtionen
    public void look() {
        Room currentRoom = map.getCurrentRoom();
        System.out.println("You are standing in " + currentRoom.getRoomName() + currentRoom.getDescription());
    }
}
