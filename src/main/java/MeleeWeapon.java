public class MeleeWeapon extends Weapon {
    private int ammunition;
    public MeleeWeapon(String itemName, String itemDecription, int damage) {
        super(itemName, itemDecription, damage);
    }
    public Adventure.AttackEnum attack(){
        return Adventure.AttackEnum.MELEE;
    }
    @Override
    public int getAmmunition(){
        return ammunition;
    }
}
