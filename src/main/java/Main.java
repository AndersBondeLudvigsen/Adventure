import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Adventure adventure = new Adventure();
        Scanner keyboard = new Scanner(System.in);
        boolean exit = false;
        adventure.buildRoom();
        while (!exit) {

        String userInput = keyboard.nextLine().toLowerCase(); // Converter input så man kan skrive med små og store bogstaver.
        // Fjerner mellemrum og go hvis det bliver skrevet
        String Input = userInput.replace("go", "").trim();
            System.out.println("hej");

            switch (Input) {
                case "north", "n" -> System.out.println("Going North");
                case "south", "s" -> System.out.println("Going South");
                case "west", "w" -> System.out.println("Going West");
                case "east", "e" -> System.out.println("Going East");
                case "look" -> adventure.look();
                case "exit" -> exit= true;
                default -> System.out.println("Unknown input");

            }
        }
    }
}

