import java.util.Scanner;

public class Adventure {
    public Room currentRoom;
    //private Room room1, room2, room3, room4, room5, room6, room7, room8, room9;
    // Laver 8 rooms

    public Adventure() {
        Room room1 = new Room("Room 1 - the Entry Hall\n", "A grand chamber with faded tapestries that once depicted heroic battles.\nThe once-marble floor is now cracked and worn, and a chandelier hangs precariously from the ceiling.\n");
        Room room2 = new Room("Room 2 - Hallway of Echoes\n", "A long, narrow corridor lined with dusty suits of armor that stand like silent sentinels.\nTorches, long extinguished, still line the walls, casting eerie shadows.\n");
        Room room3 = new Room("Room 3 - Forgotten Smithy\n", "A blacksmith's workshop, filled with rusted tools and broken anvils.\nThe air is thick with the scent of old metalwork, and the forge lies cold and lifeless.\n");
        Room room4 = new Room("Room 4 - Guard Room of Yore\n", "The remains of a guard room, with ancient weapons rusting on the racks.\nFaded banners hang from the walls, bearing the insignia of a long-lost kingdom.\n");
        Room room5 = new Room("Room 5 - Library of Lost Knowledge\n", "Rows of rotting bookshelves filled with disintegrating tomes.\nMotes of dust dance in the faint rays of light filtering through boarded-up windows.\n");
        Room room6 = new Room("Room 6 - Shrine of the Forgotten Gods\n", "An ornate room dedicated to long-forgotten deities.\nBroken statues lie toppled on the floor, and the once-sacred altar is now covered in spiderwebs.\n");
        Room room7 = new Room("Room 7 - Macabre Art Room\n", "A chilling gallery displaying gruesome paintings and sculptures.\nThe artwork seems to come to life in the dim light, evoking a sense of dread.\n");
        Room room8 = new Room("Room 8 - Chamber of Whispers\n", "A small, eerie room filled with tattered curtains that billow mysteriously in the stagnant air.\nFaint whispers seem to emanate from the walls themselves, carrying ancient secrets.\n");
        Room room9 = new Room("Room 9 - Throne Room of Decay\n", "A decaying chamber where a tarnished throne sits atop a dais.\nTattered banners hang from the walls, and the ceiling is adorned with faded frescoes.\n");


        // Sætter hvilke veje man kan gå i hvert rum

        room1.setEastRoom(room2);
        room1.setSouthRoom(room4);
        //
        room2.setEastRoom(room3);
        room2.setWestRoom(room1);
        //
        room3.setSouthRoom(room6);
        room3.setWestRoom(room2);
        //
        room4.setNorthRoom(room1);
        room4.setSouthRoom(room7);
        //
        room5.setSouthRoom(room8);
        //
        room6.setNorthRoom(room3);
        room6.setSouthRoom(room9);
        //
        room7.setNorthRoom(room4);
        room7.setEastRoom(room8);
        //
        room8.setNorthRoom(room5);
        room8.setEastRoom(room9);
        room8.setWestRoom(room7);
        //
        room9.setNorthRoom(room6);
        room9.setWestRoom(room8);

        currentRoom = room1;
    }
        // look funtionen
            public void look() {
            System.out.println("You are standing in " + currentRoom.getRoomName() + currentRoom.getDescription());
        }
    public void moveNorth(Room northRoom) {
        if (currentRoom != northRoom && northRoom == null) {
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
        if (currentRoom != eastRoom && eastRoom == null) {
            System.out.println("There is no room to the east.");
        } else if (!currentRoom.getEastRoom().isVisited()) {
            System.out.println(currentRoom.getDescription());
            currentRoom = currentRoom.getEastRoom();
        }
        else if (currentRoom != currentRoom.getEastRoom()) {
            currentRoom = currentRoom.getEastRoom();
            System.out.println("You delve deeper into the keep");
            System.out.println(currentRoom.getDescription());
            currentRoom.setIsVisited(true);
        }
    }

    public void moveSouth(Room southRoom) {
        if (currentRoom != southRoom && southRoom == null) {
            System.out.println("There is no room to the south.");
        } else if (!currentRoom.getSouthRoom().isVisited()) {
            System.out.println(currentRoom.getDescription());
            currentRoom = currentRoom.getSouthRoom();
        }
        else if (currentRoom != southRoom) {
            currentRoom = currentRoom.getSouthRoom();
            System.out.println("You delve deeper into the keep");
            System.out.println(currentRoom.getDescription());
            currentRoom.setIsVisited(true);
        }
    }

    public void moveWest(Room westRoom) {
        if (currentRoom != westRoom && westRoom == null) {
            System.out.println("There is no room to the west.");
        } else if (!currentRoom.getWestRoom().isVisited()) {
            System.out.println(currentRoom.getDescription());
            currentRoom = currentRoom.getWestRoom();
        }
        else if (currentRoom != westRoom) {
            currentRoom = currentRoom.getWestRoom();
            System.out.println("You delve deeper into the keep");
            System.out.println(currentRoom.getDescription());
            currentRoom.setIsVisited(true);
        }

    }




    // metoden for hvis man skal bruge hjælp
    public void help() {
        System.out.println("You are standing in " + currentRoom.getRoomName());
        System.out.println("In this game you can move in 4 directions");
        System.out.println("North, South, East, West");
        System.out.println("Type 'look around to to see which directions you may move to");
        System.out.println("Type exit to exit the game");
    }

    public void play() {
        Scanner keyboard = new Scanner(System.in);
        boolean exit = false;
        System.out.println("Welcome to game you are standing in " + currentRoom.getRoomName());
        System.out.println("Start by going south or east ");
        System.out.println("Type help for help");
        while (!exit) {
            String userInput = keyboard.nextLine().toLowerCase(); // Converter input så man kan skrive med små og store bogstaver.
            // Fjerner mellemrum og go hvis det bliver skrevet
            String Input = userInput.replace("go", "").replace("around", "").trim();
            switch (Input) {
                case "north", "n" -> {
                    System.out.println("Going North");
                    moveNorth(currentRoom.getNorthRoom());

                }
                case "south", "s" -> {
                    System.out.println("Going South");
                    moveSouth(currentRoom.getSouthRoom());

                }
                case "west", "w" -> {
                    System.out.println("Going West");
                    moveWest(currentRoom.getWestRoom());

                }
                case "east", "e" -> {
                    System.out.println("Going East");
                    moveEast(currentRoom.getEastRoom());

                }
                case "look", "look around" -> look();
                case "help" -> help();
                case "exit" -> exit = true;
                default -> System.out.println("Unknown input");

            }


        }

    }

    public Room getCurrentRoom() {
        return currentRoom;
    }
}









