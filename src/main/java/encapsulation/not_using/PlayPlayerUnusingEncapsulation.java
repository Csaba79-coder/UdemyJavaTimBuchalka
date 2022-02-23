package encapsulation.not_using;

public class PlayPlayerUnusingEncapsulation {

    public static void main(String[] args) {
        PlayerNotUsingEncapsulation player = new PlayerNotUsingEncapsulation();
        player.name = "Tim";
        player.health = 20; // this one takes the whole control out of the Player class! --> need encapsulation!
        player.weapon = "Sword";

        int damage = 10;

        player.looseHealth(damage);
        player.healthRemaining();

        System.out.println(player.health);

        damage = 11;

        player.looseHealth(damage);
        System.out.println(player.healthRemaining());
    }
}
