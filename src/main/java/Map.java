public class Map {
    public static Room currentRoom;

    public Map() {

        // Laver 9 rooms

        //Room 1
        Room room1 = new Room("Room 1 - the Entry Hall\n", "A grand chamber with faded tapestries that once depicted heroic battles.\nThe once-marble floor is now cracked and worn, and a chandelier hangs precariously from the ceiling.\n");
        room1.addItem(new Item("shield", " Basic wooden shield for blocking attacks in your adventure."));
        room1.addItem(new Food("elf bread", " Light and sweet golden loaf.", 30));
        room1.addItem(new RangedWeapon("longbow", " Elegant and precise with long range.", -20, 5));

        //Room 2
        Room room2 = new Room("Room 2 - Hallway of Echoes\n", "A long, narrow corridor lined with dusty suits of armor that stand like silent sentinels.\nTorches, long extinguished, still line the walls, casting eerie shadows.\n");
        room2.addItem(new Item("compass", " Always points towards safety."));
        room2.addItem(new Food("goblin cheese", " Strong and pungent magical cheese.", 20));

        //Room 3
        Room room3 = new Room("Room 3 - Forgotten Smithy\n", "A blacksmith's workshop, filled with rusted tools and broken anvils.\nThe air is thick with the scent of old metalwork, and the forge lies cold and lifeless.\n");
        room3.addItem(new Item("potion", " a vital resource on your perilous journey."));
        room3.addItem(new MeleeWeapon("broadsword", "A weathered blade with jagged edges.", 50));

        //Room 4
        Room room4 = new Room("Room 4 - Guard Room of Yore\n", "The remains of a guard room, with ancient weapons rusting on the racks.\nFaded banners hang from the walls, bearing the insignia of a long-lost kingdom.\n");
        room4.addItem(new Item("backpack", " Sturdy pack to carry provisions and equipment for your travels."));
        room4.addItem(new Food("fish", "A fresh, glimmering silver trout", 60));
        room4.addItem(new RangedWeapon("crossbow", "Ancient, enchanted, delivering powerful bolts.", -40, 5));

        //Room 5
        Room room5 = new Room("Room 5 - Throne Room of Decay\n", "A decaying chamber where a tarnished throne sits atop a dais.\nTattered banners hang from the walls, and the ceiling is adorned with faded frescoes.\n");
        room5.addItem(new Item("torch", " Illuminates your path in dimly lit caves and mysterious forests."));
        room5.addItem(new MeleeWeapon("warhammer", "A heavy, ominous hammer wreathed in dark energy", 50));

        //Room6
        Room room6 = new Room("Room 6 - Shrine of the Forgotten Gods\n", "An ornate room dedicated to long-forgotten deities.\nBroken statues lie toppled on the floor, and the once-sacred altar is now covered in spiderwebs.\n");
        room6.addItem(new Item("armor", " Light armor for protection during encounters with menacing foes."));
        room6.addItem(new Food("mushrooms", "poison mushrooms that may kill u", -40));

        //Room 7
        Room room7 = new Room("Room 7 - Macabre Art Room\n", "A chilling gallery displaying gruesome paintings and sculptures.\nThe artwork seems to come to life in the dim light, evoking a sense of dread.\n");
        room7.addItem(new Item("hook", " Versatile tool for climbing, exploring, and crossing treacherous terrain."));
        room7.addItem(new RangedWeapon("axe", " Forged by dwarves, strikes like thunder.", -30, 5));

        //Room 8
        Room room8 = new Room("Room 8 - Chamber of Whispers\n", "A small, eerie room filled with tattered curtains that billow mysteriously in the stagnant air.\nFaint whispers seem to emanate from the walls themselves, carrying ancient secrets.\n");
        room8.addItem(new Item("fireball", " Unleashes a powerful fire spell to vanquish enemies from afar."));
        room8.addItem(new MeleeWeapon("dagger", "A concealed dagger that thrives in the darkness.", 40));

        //Room 9
        Room room9 = new Room("Room 9 - Library of Lost Knowledge\n", "Rows of rotting bookshelves filled with disintegrating tomes.\nMotes of dust dance in the faint rays of light filtering through boarded-up windows.\n");
        room9.addItem(new Item("Book", " Nutritious provisions for sustenance during your daring escapades."));
        room9.addItem(new Food("apple", " A disgustingly mushy apple with a rancid smell,", -20));
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