public class MeleeWeapon extends Weapon {
    private int ammunition;
    public MeleeWeapon(String itemName, String itemDescription, int damage) {
        super(itemName, itemDescription, damage);
    }
    public Adventure.AttackEnum attack(){
        return Adventure.AttackEnum.MELEE;
    }
    @Override
    public int getAmmunition(){
        return ammunition;
    }
}
