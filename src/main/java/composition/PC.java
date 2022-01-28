package composition;

public class PC {

    private Case aCase; // case is a reserved word!!! ... that reason aCase or theCase
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PC(Case aCase, Monitor monitor, MotherBoard motherBoard) {
        this.aCase = aCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    public Case getACase() {
        return aCase;
    }

    public void setACase(Case aCase) {
        this.aCase = aCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }
}
