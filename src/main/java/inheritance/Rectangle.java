package inheritance;

public class Rectangle extends Shape {

    private int width;
    private int height;

    // this() or super() in same constructor only can be used one of them! and must be in the first line!

    // 1st constructor
    public Rectangle(int x, int y) {
        // this() must be the first line always!
        this(x, y, 0, 0); // calls the second constructor
    }

    // 2nd constructor
    public Rectangle(int x, int y, int width, int height) {
        // super() must be the first line  always!
        super(x, y); // calls the constructor from parent (Shape)
        this.width = width;
        this.height = height;
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
