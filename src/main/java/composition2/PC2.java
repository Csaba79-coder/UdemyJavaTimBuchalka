package composition2;

public class PC2 {

    private Case2 aCase2; // case is a reserved word!!! ... that reason aCase or theCase
    private Monitor2 monitor2;
    private MotherBoard2 motherBoard2;

    public PC2(Case2 aCase2, Monitor2 monitor2, MotherBoard2 motherBoard2) {
        this.aCase2 = aCase2;
        this.monitor2 = monitor2;
        this.motherBoard2 = motherBoard2;
    }

    public void powerUp2() {
        // getACase2().pressPowerButton2();
        aCase2.pressPowerButton2();
        drawLogo();
        motherBoard2.loadProgram2("Windows 1.0");
    }

    private void drawLogo() {
        // getMonitor2().drawPixelAt2(1200, 50, "yellow");
        monitor2.drawPixelAt2(1200, 50, "yellow");
    }

    /* private Case2 getACase2() {
        return aCase2;
    }

    public void setACase2(Case2 aCase2) {
        this.aCase2 = aCase2;
    }

    private Monitor2 getMonitor2() {
        return monitor2;
    } */

    public void setMonitor2(Monitor2 monitor2) {
        this.monitor2 = monitor2;
    }

    private MotherBoard2 getMotherBoard2() {
        return motherBoard2;
    }

    public void setMotherBoard2(MotherBoard2 motherBoard2) {
        this.motherBoard2 = motherBoard2;
    }
}
