package polymorphism;

public class Forgettable extends Movie {

    public Forgettable() {
        super("Forgettable");
    }

    // no plot method!!! --> polymorphism!!! --> this reason gives back the mother class plot() method!!!
}
