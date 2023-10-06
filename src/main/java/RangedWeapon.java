public class  RangedWeapon extends Weapon {
    private int ammunition;
    //private String
    public RangedWeapon(String itemName, String itemDescription, int damage, int ammunition) {
        super(itemName, itemDescription, damage);
        this.ammunition = ammunition;
    }
    public int getAmmunition(){
        return ammunition;
    }
    public void setAmmunition(){
    }
    public void useWeapon(){
        ammunition--;
    }
    }

