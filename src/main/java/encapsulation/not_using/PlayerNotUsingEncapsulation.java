package encapsulation.not_using;

public class PlayerNotUsingEncapsulation {

    public String name;
    public int health;
    public String weapon;

    public void looseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("Player knocked out");
            // Reduced number of life remaining for the player
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
