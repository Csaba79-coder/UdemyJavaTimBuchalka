package polymorphism2;

// right click on class name can make a copy or move as well in refactor!
public class Holden extends Car {

    public Holden() {
    }

    public Holden(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        // return getClass().getName() + " -> startEngine()"; // output --> polymorphism2.Holden -> startEngine()
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> brake()";
    }
}
