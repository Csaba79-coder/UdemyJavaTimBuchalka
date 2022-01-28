package composition;

public class CreatePC {

    public static void main(String[] args) {

        // COMPOSITION as follows:

        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case aCase = new Case("220B", "Dell", "240", dimensions);

        Monitor monitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        MotherBoard motherBoard = new MotherBoard("BJ-200", "Asus", 4, 6, "v2.44");

        PC personalComputer = new PC(aCase, monitor, motherBoard);

        personalComputer.getMonitor().drawPixelAt(1500, 1200, "red"); // because lack of override!!! ...
        personalComputer.getMotherBoard().loadProgram("Windows 1.0");
        personalComputer.getACase().pressPowerButton();
    }
}
