public abstract class Weapon extends Item {
   private int damage;
   private int ammunition;

    public int getDamage() {
        return damage;
    }

    public Weapon(String itemName, String itemDescription, int damage) {
        super(itemName, itemDescription);
        this.damage = damage;
    }
    public int getAmmunition() {
        return ammunition;
    }
    public abstract Adventure.AttackEnum attack();

}

