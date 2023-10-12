public class Enemy {
    private String enemyName;
    private String enemtdDcription;
    private int enemyHealth;
    private Weapon enemyWeapon;


    public Enemy(String enemyName, String enemyDecription, int enemyHealth, Weapon enemyWeapon) {
        this.enemyName = enemyName;
        this.enemtdDcription = enemyDecription;
        this.enemyWeapon = enemyWeapon;
        this.enemyHealth = enemyHealth;

    }

    public String getName() {
        return enemyName;
    }

    public String getDecription() {
        return enemtdDcription;
    }

    public int getHealth() {
        return enemyHealth;
    }


    public Weapon getWeapon() {
        return enemyWeapon;
    }

    public void setName(String name) {
        this.enemyName = enemyName;
    }

    public void setDecription(String decription) {
        this.enemtdDcription = enemtdDcription;
    }

    public void setWeapon(Weapon weapon) {
        this.enemyWeapon = enemyWeapon;
    }
    public void setHealth(int health){
        this.enemyHealth = health;
    }

    public boolean enemyDead(){
        return enemyHealth <= 0;
    }
    public void dropEnemyWeapon(Room currentroom){
        currentroom.addEnemyItem(enemyWeapon);
    }
    @Override
    public String toString() {
        return "Enemy{" +
                "enemyName='" + enemyName + '\'' +
                ", enemyDescription='" + enemyDescription + '\'' +
                ", enemyHealth=" + enemyHealth +
                ", enemyWeapon=" + enemyWeapon +
                '}';
    }
}
