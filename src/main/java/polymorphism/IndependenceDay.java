package polymorphism;

public class IndependenceDay extends Movie {

    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        // return super.plot(); // instead of super I override it!
        return "Aliens attempt to take over planet earth";
    }
}
