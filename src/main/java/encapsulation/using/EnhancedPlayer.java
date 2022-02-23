package encapsulation.using;

public class EnhancedPlayer {
    // Encapsulation:
    // this is encapsulation to make the fields private, using getter setter and constructor, and hide the business logic
    // the class in not accessible, or the fields within the class aren't accessible to any classes that are outside!
    private String name;
    private int health;
    private String weapon;

    public EnhancedPlayer() {
    }

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <= 100) {
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void looseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("Player knocked out");
            // Reduced number of life remaining for the player
        }
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
