package composition2;

public class MotherBoard2 {

    private String model2;
    private String manufacturer2;
    private int ramSlot2;
    private int cardSlot2;
    private String bios2;

    public MotherBoard2(String model2, String manufacturer2, int ramSlot2, int cardSlot2, String bios2) {
        this.model2 = model2;
        this.manufacturer2 = manufacturer2;
        this.ramSlot2 = ramSlot2;
        this.cardSlot2 = cardSlot2;
        this.bios2 = bios2;
    }

    public void loadProgram2(String programName) {
        System.out.println("The program " + programName + " is now loading ...");
    }

    public String getModel2() {
        return model2;
    }

    public void setModel2(String model2) {
        this.model2 = model2;
    }

    public String getManufacturer2() {
        return manufacturer2;
    }

    public void setManufacturer2(String manufacturer2) {
        this.manufacturer2 = manufacturer2;
    }

    public int getRamSlot2() {
        return ramSlot2;
    }

    public void setRamSlot2(int ramSlot2) {
        this.ramSlot2 = ramSlot2;
    }

    public int getCardSlot2() {
        return cardSlot2;
    }

    public void setCardSlot2(int cardSlot2) {
        this.cardSlot2 = cardSlot2;
    }

    public String getBios2() {
        return bios2;
    }

    public void setBios2(String bios2) {
        this.bios2 = bios2;
    }
}
