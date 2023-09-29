import java.util.ArrayList;
import java.util.Scanner;

public class Userinterface {
    Adventure adventure = new Adventure();

    public void play() {
        Scanner keyboard = new Scanner(System.in);
        boolean exit = false;
        System.out.println("Welcome to game you are standing in " + adventure.map.getCurrentRoom());
        System.out.println("Start by going south or east ");
        System.out.println("Type help for help");
        while (!exit) {
            String userInput = keyboard.nextLine().toLowerCase(); // Converter input så man kan skrive med små og store bogstaver.
            // Fjerner mellemrum og go hvis det bliver skrevet
            String Input = userInput.replace("go", "").replace("around", "").replace("item", "").trim();
            switch (Input) {
                case "north", "n" -> {
                    System.out.println("Going North");
                    adventure.moveNorth();
                }
                case "south", "s" -> {
                    System.out.println("Going South");
                    adventure.moveSouth();

                }
                case "west", "w" -> {
                    System.out.println("Going West");
                    adventure.moveWest();

                }
                case "east", "e" -> {
                    System.out.println("Going East");
                    adventure.moveEast();

                }
                case "take" -> adventure.pickUpItem();
                case "drop" -> adventure.dropItem();
                case "inventory" -> adventure.player.showInventory();
                case "look", "look around" -> look();
                case "help" -> help();
                case "exit" -> exit = true;
                default -> System.out.println("Unknown input");

            }


        }

    }

    // metoden for hvis man skal bruge hjælp
    public void help() {
        System.out.println("You are standing in " + adventure.map.getCurrentRoom());
        System.out.println("In this game you can move in 4 directions");
        System.out.println("North, South, East, West");
        System.out.println("Type 'look around to to see which directions you may move to");
        System.out.println("Type exit to exit the game");
        System.out.println("Type 'inventory' to see your items");
    }

    // look funtionen
    public void look() {

        System.out.println("You are standing in " + adventure.map.getCurrentRoom() + adventure.map.currentRoom.getDescription());
    }
}
