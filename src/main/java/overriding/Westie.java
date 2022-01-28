package overriding;

public class Westie extends Dog {

    @Override
    public void bark() {
        System.out.println("Woof, woof, woof");
    }
}
