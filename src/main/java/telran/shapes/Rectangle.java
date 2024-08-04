package telran.shapes;

public class Rectangle implements Shape{
    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public int perimeter() {
        return 2*(width + length);
    }

    @Override
    public int square() {
        return width * length;
    }


}
