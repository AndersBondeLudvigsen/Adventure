
import java.util.Scanner;

public class Userinterface {
    Adventure adventure = new Adventure();


    public void play() {
        Scanner keyboard = new Scanner(System.in);
        boolean exit = false;
        System.out.println("Welcome to game you are standing in " + adventure.map.getCurrentRoom());
        System.out.println("Start by going south or east ");
        System.out.println("Type help for help");
        System.out.println("Awaiting your command");

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
                case "take" ->{ adventure.pickUpItem();
                }
                case "drop" -> adventure.dropItem();
                case "equip" -> {
                    System.out.println("What weapon would you like to equip");
                    String weaponName = keyboard.nextLine().toLowerCase();
                    Adventure.Equip equip = adventure.player.Equip(weaponName);
                    switch (equip) {
                        case CAN_EQUIP -> System.out.println("You have equiped " + weaponName);
                        case CANNOT_EQUIP -> System.out.println(weaponName + " is not a weapon");
                        case NOT_IN_INVENTORY ->
                                System.out.println("You don't have " + weaponName + " in your inventory.");
                    }
                }
                case "inventory" -> adventure.player.showInventory();
                case "look", "look around" -> look();
                case "eat" -> {
                    System.out.print("What food would you like to eat: ");
                    System.out.println(adventure.player.getInventoryList());
                    String foodName = keyboard.nextLine().toLowerCase();
                    Adventure.Eatable eatable = adventure.player.EAT(foodName);
                    switch (eatable) {
                        case CAN_EAT -> System.out.println("You ate the " + foodName + ". Your health improved.");
                        case CANNOT_EAT -> System.out.println("You can't eat the " + foodName + ". It's not food.");
                        case NOT_IN_INVENTORY ->
                                System.out.println("You don't have the " + foodName + " in your inventory.");
                    }
                }

                case "attack" -> {
                    Adventure.AttackEnum result = adventure.player.attack();
                    // Handle the result as needed
                    switch (result) {
                        case FIRED:
                            System.out.println("You fired your ranged weapon.");
                            break;
                        case MELEE:
                            System.out.println("You performed a melee attack.");
                            break;
                        case ENEMY_DEAD:
                            System.out.println("You defeated the enemy.");
                            break;
                        case NO_AMMO:
                            System.out.println("You are out of ammunition.");
                            break;
                        case NO_WEAPON_EQUIPED:
                            System.out.println("You don't have a weapon equipped.");
                            break;
                        case NONE:
                            System.out.println("Something went wrong");
                            break;
                        case PLAYER_DEAD:
                            System.out.println("You have been killed");
                            System.out.println("The game will now end");
                            exit = true;
                            break;
                        default:
                            System.out.println("You can't attack right now.");
                            break;
                    }
                }
                case "health" -> System.out.println("Your health is " + adventure.player.getCurrentHealth());
                case "help" -> help();
                case "exit" -> exit = true;
                default -> System.out.println("Unknown input\nAwaiting your command");
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
        System.out.println("Type 'eat' if you have food in your inventory");
    }


    // look funtionen
    public void look() {
        System.out.println("You are standing in " + adventure.map.getCurrentRoom() + adventure.map.currentRoom.getDescription());
        System.out.println("items in room " + adventure.map.getCurrentRoom().getItems());
        if (adventure.map.getCurrentRoom().getEnemyArrayList().size() != 0) {
            Enemy enemy = adventure.map.getCurrentRoom().getEnemy();
            if (enemy != null) {
                System.out.println("Enemies in the room: " + adventure.map.getCurrentRoom().getEnemy().getName());
            } else {
                System.out.println("There are no enemies in the room.");
            }
        }
    }
    }

