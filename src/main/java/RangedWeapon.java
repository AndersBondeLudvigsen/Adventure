public class  RangedWeapon extends Weapon {
    private int ammunition;
    //private String
    public RangedWeapon(String itemName, String itemDescription, int damage, int ammunition) {
        super(itemName, itemDescription, damage);
        this.ammunition = ammunition;
    }
    @Override
    public int getAmmunition(){
        return ammunition;
    }
    public void setAmmunition(){
    }
    public Adventure.AttackEnum attack() {
        if (ammunition > 0) {
            ammunition -= 1;
            System.out.println(getAmmunition());
            return Adventure.AttackEnum.FIRED;
        } else {
            return Adventure.AttackEnum.NO_AMMO;
        }
    }

    }


