public abstract class Weapon extends Item{
    int damage;


 public int getDamage(){
     return damage;
 }

    public Weapon(String itemName, String itemDecription, int damage) {
        super(itemName, itemDecription);
        this.damage = damage;
    }

}
