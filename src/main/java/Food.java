public class Food extends Item {

    private int health;


    public Food(String itemName, String itemDecription, int health) {
        super(itemName, itemDecription);
        this.health = health;
    }

    /*public Food updateHealth(){
        currentHealth + adventure.player.EAT(foodName);
    return updateHealth();
    }*/
    public int getHealth(){
        return health;
    }




}
