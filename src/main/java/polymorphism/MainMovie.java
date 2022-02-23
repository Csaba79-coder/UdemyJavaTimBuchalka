package polymorphism;

public class MainMovie {

    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " title: " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie() {
        int randomNum = (int) (Math.random() * 5) + 1 ; // random number between 0-4 ... + 1 makes it from 1-5 :)
        System.out.println("Random number generated was: " + randomNum);
        return switch (randomNum) {
            case 1 -> new Jaws();
            case 2 -> new IndependenceDay();
            case 3 -> new MazeRunner();
            case 4 -> new StarWars();
            case 5 -> new Forgettable();
            default -> null;
        };
    }
}
