package composition2;

public class Case2 {

    private String model2;
    private String manufacturer2;
    private String powerSupply2;
    private Dimensions2 dimensions2;

    public Case2(String model2, String manufacturer2, String powerSupply2, Dimensions2 dimensions2) {
        this.model2 = model2;
        this.manufacturer2 = manufacturer2;
        this.powerSupply2 = powerSupply2;
        this.dimensions2 = dimensions2;
    }

    public void pressPowerButton2() {
        System.out.println("Power button pressed!");
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

    public String getPowerSupply2() {
        return powerSupply2;
    }

    public void setPowerSupply2(String powerSupply2) {
        this.powerSupply2 = powerSupply2;
    }

    public Dimensions2 getDimensions2() {
        return dimensions2;
    }

    public void setDimensions2(Dimensions2 dimensions2) {
        this.dimensions2 = dimensions2;
    }
}
