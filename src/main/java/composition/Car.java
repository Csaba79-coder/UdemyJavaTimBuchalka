package composition;

public class Car extends Vehicle {

    private int door;
    private int engineCapacity;

    public Car(String name, int door, int engineCapacity) {
        super(name);
        this.door = door;
        this.engineCapacity = engineCapacity;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}
