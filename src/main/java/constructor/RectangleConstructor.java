package constructor;

public class RectangleConstructor {

    // to avoid code repetition!

    private int x;
    private int y;
    private int width;
    private int height;

    // 1st constructor
    public RectangleConstructor() {
        this(0, 0); // calls the second constructor
    }

    // 2nd constructor
    public RectangleConstructor(int width, int height) {
        this(0, 0, width, height); // calling the third constructor
    }

    // 3rd constructor
    public RectangleConstructor(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
