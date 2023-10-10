public class Enemy {
    private String enemyName;
    private String enemtdDcription;
    private int enemyHealth;
    private Weapon enemyWeapon;
    private Player player;

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
        this.enemyHealth = enemyHealth;
    }


    public void enemyAttackPlayer() {
        int damage = enemyWeapon.getDamage();
        int playerHealth = player.getCurrentHealth();
        player.setCurrentHealth(playerHealth - damage);
    }

    public void playerAttackEnemy(Player player, Enemy enemy){
        int damage = player.getCurrentWeapon().getDamage();
        int health = enemyHealth;
        enemy.setHealth(health-damage);
    }
    public boolean enemyDead(){
        return enemyHealth <= 0;
    }
    public void dropEnemyWeapon(Room currentroom){
        currentroom.addEnemyItem(enemyWeapon);
    }

}
