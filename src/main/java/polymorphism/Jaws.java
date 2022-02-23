package polymorphism;

public class Jaws extends Movie {

    public Jaws() {
        super("Jaws");
    }

    // this is actually an override! --> see better solution in IndependenceDay!
    public String plot() {
        return "A shark eats lots of people";
    }
}
