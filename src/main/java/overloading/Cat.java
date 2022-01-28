package overloading;

public class Cat {

    public void mew() {
        System.out.println("Miaow");
    }

    public void mew(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println("Miaow");
        }
    }
}
