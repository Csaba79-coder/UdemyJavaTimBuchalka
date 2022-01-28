package composition2;

public class CreatePC2 {

    public static void main(String[] args) {

        // COMPOSITION as follows:

        Dimensions2 dimensions2 = new Dimensions2(20, 20, 5);
        Case2 aCase2 = new Case2("220B", "Dell", "240", dimensions2);

        Monitor2 monitor2 = new Monitor2("27inch Beast", "Acer", 27, new Resolution2(2540, 1440));

        MotherBoard2 motherBoard2 = new MotherBoard2("BJ-200", "Asus", 4, 6, "v2.44");

        PC2 personalComputer2 = new PC2(aCase2, monitor2, motherBoard2);

        // creating objects within objects! that is also composition!

        personalComputer2.powerUp2();
    }
}
