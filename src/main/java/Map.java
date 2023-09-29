public class Map {
    public static Room currentRoom;

    public Map() {

        // Laver 9 rooms
        Room room1 = new Room("Room 1 - the Entry Hall\n", "A grand chamber with faded tapestries that once depicted heroic battles.\nThe once-marble floor is now cracked and worn, and a chandelier hangs precariously from the ceiling.\n");
        room1.addItem("shield", "Basic wooden shield for blocking attacks in your adventure.");
        Room room2 = new Room("Room 2 - Hallway of Echoes\n", "A long, narrow corridor lined with dusty suits of armor that stand like silent sentinels.\nTorches, long extinguished, still line the walls, casting eerie shadows.\n");
        room2.addItem("dagger", " A worn dagger suitable for close combat in dark dungeons.");
        Room room3 = new Room("Room 3 - Forgotten Smithy\n", "A blacksmith's workshop, filled with rusted tools and broken anvils.\nThe air is thick with the scent of old metalwork, and the forge lies cold and lifeless.\n");
        room3.addItem("potion", " a vital resource on your perilous journey.");
        Room room4 = new Room("Room 4 - Guard Room of Yore\n", "The remains of a guard room, with ancient weapons rusting on the racks.\nFaded banners hang from the walls, bearing the insignia of a long-lost kingdom.\n");
        room4.addItem("backpack", " Sturdy pack to carry provisions and equipment for your travels.");
        Room room5 = new Room("Room 5 - Throne Room of Decay\n", "A decaying chamber where a tarnished throne sits atop a dais.\nTattered banners hang from the walls, and the ceiling is adorned with faded frescoes.\n");
        room5.addItem("torch", " Illuminates your path in dimly lit caves and mysterious forests.");
        Room room6 = new Room("Room 6 - Shrine of the Forgotten Gods\n", "An ornate room dedicated to long-forgotten deities.\nBroken statues lie toppled on the floor, and the once-sacred altar is now covered in spiderwebs.\n");
        room6.addItem("armor", " Light armor for protection during encounters with menacing foes.");
        Room room7 = new Room("Room 7 - Macabre Art Room\n", "A chilling gallery displaying gruesome paintings and sculptures.\nThe artwork seems to come to life in the dim light, evoking a sense of dread.\n");
        room7.addItem("hook", " Versatile tool for climbing, exploring, and crossing treacherous terrain.");
        Room room8 = new Room("Room 8 - Chamber of Whispers\n", "A small, eerie room filled with tattered curtains that billow mysteriously in the stagnant air.\nFaint whispers seem to emanate from the walls themselves, carrying ancient secrets.\n");
        room8.addItem("fireball", " Unleashes a powerful fire spell to vanquish enemies from afar.");
        Room room9 = new Room("Room 9 - Library of Lost Knowledge\n", "Rows of rotting bookshelves filled with disintegrating tomes.\nMotes of dust dance in the faint rays of light filtering through boarded-up windows.\n");
        room9.addItem("rations", " Nutritious provisions for sustenance during your daring escapades.");
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

    public Room getCurrentRoom() {
        return currentRoom;
    }

}