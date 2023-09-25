import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String userInput = keyboard.nextLine();
        String north = "north";
        userInput.toLowerCase();
        switch (userInput) {
            case "go North" -> System.out.println("Going North");
            case "go South" -> System.out.println("Going South");
            case "go West" -> System.out.println("Going West");
            case "go East" -> System.out.println("Going East");
            case "Look" -> System.out.println("Looking around");
            default -> System.out.println("Unknown input");
        }


    }
}




        /*switch (keyboard) {

            case1 ->
                    String commandN = "go north";
            commandN.split(" ");

            case 2 ->
                    String commandS = "go south";
            commandS.split(" ");
            case 3 ->
                    String commandE = "go east";
            commandE.split(" ");
            case 4 ->
            String commandW = "go west";
            commandW.split(" ");


        }

    }
}
*/