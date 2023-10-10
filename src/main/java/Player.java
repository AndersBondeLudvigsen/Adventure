
import java.util.ArrayList;
import java.util.Scanner;


public class Player {
    private ArrayList<Item> inventoryList = new ArrayList<>();
    private Scanner keyboard = new Scanner(System.in);
    private Room playerPostion;
    private Weapon currentWeapon;
    private Enemy enemy;


    public int updateHealth(int healthPoints) {
        return currentHealth += healthPoints;
    }


    public Weapon getCurrentWeapon() {
        return currentWeapon;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    private int currentHealth = 20;

    public void setPlayerPostion(Room playerPostion) {
        this.playerPostion = playerPostion;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    // Method to pick up an item from the room
    public void pickUpItem(Room currentroom) {
        System.out.println("What would you like to pick up");
        String item = keyboard.nextLine().toLowerCase();
        Item itemToHandle = null;
        boolean itemFound = false;  // Initialize a flag to track if the item is found.

        for (Item i : currentroom.getItems()) {
            if (i.getItemName().contains(item)) {
                inventoryList.add(i);
                System.out.println("You picked up " + item + ".");
                itemToHandle = i;
                itemFound = true;  // Set the flag to true since the item was found.
                break;
            }
        }

        if (!itemFound) {
            System.out.println("This item is not in the room.");  // Print this message if the item was not found.
        } else {
            currentroom.getItems().remove(itemToHandle);
        }

        System.out.println("Awaiting your command");
    }

    //Method to leave an item in the room

    public void leaveItem(Room currentroom) {
        System.out.println("What item would you like to drop");
        showInventory();
        String item = keyboard.nextLine().toLowerCase();
        Item toRemove = null;

        // Create a copy of the inventory list
        ArrayList<Item> itemsToRemove = new ArrayList<>();
        for (Item i : inventoryList) {
            if (i.getItemName().contains(item)) {
                System.out.println("You left " + i.getItemName() + " in the room.");
                System.out.println("Awaiting your command");
                toRemove = i;
                itemsToRemove.add(i); // Add items to remove to the copy list
                break;
            } else {
                System.out.println("You don't have that item in your inventory.");
            }
        }

        if (toRemove != null) {
            for (Item i : itemsToRemove) {
                inventoryList.remove(i); // Remove items from the original list
                currentroom.addItem(i);
            }
        }
    }

    public void showInventory() {
        ArrayList<Item> playerInventory = getInventory();
        if (!playerInventory.isEmpty()) {
            System.out.println("Your inventory:");
            for (Item item : playerInventory) {
                System.out.println(item.getItemName() + " ");
            }
        } else {
            System.out.println("Your inventory is empty.");
        }
    }

    private ArrayList<Item> getInventory() {
        return inventoryList;
    }

    public Adventure.Eatable EAT(String foodName) {
        Item found = null;
        for (Item item : inventoryList) {
            if (item.getItemName().equals(foodName)) {
                found = item;
                break; // Exit the loop once you find a matching item
            }
        }

        if (found != null) {
            if (found instanceof Food) {
                System.out.println(found.getItemName() + " has been eaten");
                inventoryList.remove(found);
                currentHealth += ((Food) found).getHealth();
                return Adventure.Eatable.CAN_EAT; // If it's Food
            } else {
                return Adventure.Eatable.CANNOT_EAT; // If it's not food
            }
        } else {
            return Adventure.Eatable.NOT_IN_INVENTORY; // If the item is not in the inventory
        }
    }

    public Adventure.Equip Equip(String weaponName) {
        Item found = null;
        for (Item item : inventoryList) {
            if (item.getItemName().equals(weaponName)) {
                found = item;
                break; // Exit the loop once you find a matching item
            }
        }

        if (found != null) {
            if (found instanceof Weapon) {
                this.currentWeapon = (Weapon) found;
                return Adventure.Equip.CAN_EQUIP; // If it's a weapon
            } else {
                return Adventure.Equip.CANNOT_EQUIP; // If it's not weapon
            }
        } else {
            return Adventure.Equip.NOT_IN_INVENTORY; // If the item is not in the inventory
        }
    }

    public int enemyAttack() {
        return playerPostion.getEnemy().getHealth();
    }

    public Adventure.AttackEnum attack() {
        Enemy attackEnemy = playerPostion.getEnemyArrayList().isEmpty() ? null : playerPostion.getEnemyArrayList().get(0);
        if (currentWeapon != null) {
            // Equiped weapon
            if (currentWeapon instanceof RangedWeapon) {
                if (currentWeapon.getAmmunition() > 0) {
                    return Adventure.AttackEnum.FIRED;
                }
                    if (attackEnemy != null) {
                        attackEnemy.setHealth(playerPostion.getEnemy().getHealth());
                        updateHealth(enemyAttack());
                        enemy.enemyAttackPlayer();
                        if (attackEnemy.enemyDead()) {
                            playerPostion.removeEnemy(attackEnemy);
                            attackEnemy.dropEnemyWeapon(playerPostion);
                            return Adventure.AttackEnum.ENEMY_DEAD;
                        }
                        Adventure.AttackEnum weaponAttackResult = currentWeapon.attack();
                        if (weaponAttackResult != null) {
                            return weaponAttackResult;
                        }
                    } else if (currentWeapon instanceof MeleeWeapon) {
                        return Adventure.AttackEnum.MELEE;
                    }
                        if (attackEnemy != null) {
                            attackEnemy.setHealth(playerPostion.getEnemy().getHealth());
                            updateHealth(enemyAttack());
                            enemy.enemyAttackPlayer();
                            if (attackEnemy.enemyDead()) {
                                playerPostion.removeEnemy(attackEnemy);
                                attackEnemy.dropEnemyWeapon(playerPostion);
                                return Adventure.AttackEnum.ENEMY_DEAD;
                            }
                        } else if (currentWeapon != null) {
                            if (currentWeapon instanceof RangedWeapon) {
                                if (currentWeapon.getAmmunition() < 1)
                                    return Adventure.AttackEnum.NO_AMMO;
                            }
                        }

                    } else {
                        return Adventure.AttackEnum.NO_WEAPON_EQUIPED;
                    }
                }
        return Adventure.AttackEnum.NO_WEAPON_EQUIPED;
            }



    }




