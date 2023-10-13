public class Enemy {
    private String enemyName;
    private String enemyDescription;
    private int enemyHealth;
    private Weapon enemyWeapon;


    public Enemy(String enemyName, String enemyDescription, int enemyHealth, Weapon enemyWeapon) {
        this.enemyName = enemyName;
        this.enemyDescription = enemyDescription;
        this.enemyWeapon = enemyWeapon;
        this.enemyHealth = enemyHealth;

    }

    public String getName() {
        return enemyName;
    }

    public String getEnemyDescription() {
        return enemyDescription;
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

    public void setEnemyDescription(String description) {
        this.enemyDescription = enemyDescription;
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
