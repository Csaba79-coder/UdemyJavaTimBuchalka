package composition2;

public class Monitor2 {

    private String model2;
    private String manufacturer2;
    private int size2;
    // Monitor class has a Resolution ... that is when a class has another --> called composition!
    // Resolution class is a part of a Monitor (it is not a Resolution, but has a Resolution!)
    private Resolution2 nativeResolution2; // this is composition, when another class is a part of another class!

    public Monitor2(String model2, String manufacturer2, int size2, Resolution2 nativeResolution2) {
        this.model2 = model2;
        this.manufacturer2 = manufacturer2;
        this.size2 = size2;
        this.nativeResolution2 = nativeResolution2;
    }

    public void drawPixelAt2(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + ", " + y + " in colour: " + color);
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

    public int getSize2() {
        return size2;
    }

    public void setSize2(int size2) {
        this.size2 = size2;
    }

    public Resolution2 getNativeResolution2() {
        return nativeResolution2;
    }

    public void setNativeResolution2(Resolution2 nativeResolution2) {
        this.nativeResolution2 = nativeResolution2;
    }
}
