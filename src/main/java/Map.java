public class Map {
    public static Room currentRoom;

    public Map() {

        // Laver 9 rooms

        //Room 1
        Room room1 = new Room("Room 1 - the Entry Hall\n", "A grand chamber with faded tapestries that once depicted heroic battles.\nThe once-marble floor is now cracked and worn, and a chandelier hangs precariously from the ceiling.\n");
        room1.addItem(new Item("Shield", " basic wooden shield for blocking attacks in your adventure."));
        room1.addItem(new Food("Elf bread", " light and sweet golden loaf.", 30));
        room1.addItem(new RangedWeapon("Longbow", " elegant and precise with long range.", 20, 5));

        //Room 2
        Room room2 = new Room("Room 2 - Hallway of Echoes\n", "A long, narrow corridor lined with dusty suits of armor that stand like silent sentinels.\nTorches, long extinguished, still line the walls, casting eerie shadows.\n");
        room2.addItem(new Item("Compass", " always points towards safety."));
        room2.addItem(new Food("Goblin cheese", " strong and pungent magical cheese.", 20));
        room2.addEnemy(new Enemy("Assassin", " stealthy, elusive, dark, silent killer", 40, new MeleeWeapon("daggers", "Sharp, dual-wielded ", 20)));

        //Room 3
        Room room3 = new Room("Room 3 - Forgotten Smithy\n", "A blacksmith's workshop, filled with rusted tools and broken anvils.\nThe air is thick with the scent of old metalwork, and the forge lies cold and lifeless.\n");
        room3.addItem(new Item("Potion", " a vital resource on your perilous journey."));
        room3.addItem(new MeleeWeapon("Broadsword", " a weathered blade with jagged edges.", 15));

        //Room 4
        Room room4 = new Room("Room 4 - Guard Room of Yore\n", "The remains of a guard room, with ancient weapons rusting on the racks.\nFaded banners hang from the walls, bearing the insignia of a long-lost kingdom.\n");
        room4.addItem(new Item("Backpack", " sturdy pack to carry provisions and equipment for your travels."));
        room4.addItem(new Food("Fish", " a fresh, glimmering silver trout", 25));
        room4.addItem(new RangedWeapon("Crossbow", " ancient, enchanted, delivering powerful bolts.", 15, 10));

        //Room 5
        Room room5 = new Room("Room 5 - Throne Room of Decay\n", "A decaying chamber where a tarnished throne sits atop a dais.\nTattered banners hang from the walls, and the ceiling is adorned with faded frescoes.\n");
        room5.addItem(new Item("Torch", " illuminates your path in dimly lit caves and mysterious forests."));
        room5.addItem(new MeleeWeapon("Warhammer", " a heavy, ominous hammer wreathed in dark energy", 50));
        room5.addEnemy(new Enemy("Shadow overlord", " dark, mystical and extremely powerful" , 120  ,new MeleeWeapon("shadow pulse" , "eruptive burst of dark energy" , 60) ));

        //Room6
        Room room6 = new Room("Room 6 - Shrine of the Forgotten Gods\n", "An ornate room dedicated to long-forgotten deities.\nBroken statues lie toppled on the floor, and the once-sacred altar is now covered in spiderwebs.\n");
        room6.addItem(new Item("Armor", " light armor for protection during encounters with menacing foes."));
        room6.addItem(new Food("Mushrooms", " poisonous mushrooms that may kill u", -40));
        room6.addEnemy(new Enemy("Goblin", " sneaky, small, and agile, with a nasty temperament.", 20, new MeleeWeapon("club", "crude wooden club, imbued with the strength to crush stones" , 10)));

        //Room 7
        Room room7 = new Room("Room 7 - Macabre Art Room\n", "A chilling gallery displaying gruesome paintings and sculptures.\nThe artwork seems to come to life in the dim light, evoking a sense of dread.\n");
        room7.addItem(new Item("Hook", " versatile tool for climbing, exploring, and crossing treacherous terrain."));
        room7.addItem(new MeleeWeapon("Axe", " forged by dwarves, strikes like thunder.", 30));

        //Room 8
        Room room8 = new Room("Room 8 - Chamber of Whispers\n", "A small, eerie room filled with tattered curtains that billow mysteriously in the stagnant air.\nFaint whispers seem to emanate from the walls themselves, carrying ancient secrets.\n");
        room8.addItem(new Item("Rune stone", " mysterious symbols with hidden powers."));
        room8.addItem(new MeleeWeapon("Dagger", " a concealed dagger that thrives in the darkness.", 10));
        room8.addEnemy(new Enemy("Orc shaman" , " wise, mystical, green-skinned.", 50,new MeleeWeapon("staff", "Darkened wooden staff, pulsating with malevolent, unpredictable magic", 20)));

        //Room 9
        Room room9 = new Room("Room 9 - Library of Lost Knowledge\n", "Rows of rotting bookshelves filled with disintegrating tomes.\nMotes of dust dance in the faint rays of light filtering through boarded-up windows.\n");
        room9.addItem(new Item("Book", " nutritious provisions for sustenance during your daring escapades."));
        room9.addItem(new Food("Apple", " a disgustingly mushy apple with a rancid smell,", -20));
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