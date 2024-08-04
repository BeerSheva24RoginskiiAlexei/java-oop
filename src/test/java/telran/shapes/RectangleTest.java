package telran.shapes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test()
    void testPerimeter() {
        assertEquals(0, new Rectangle(0, 0).perimeter());
        assertEquals(80, new Rectangle(20, 20).perimeter());
    }

    @Test()
    void testSquare() {
        assertEquals(0, new Rectangle(0, 0).square());
        assertEquals(400, new Rectangle(20, 20).square());
    }
}