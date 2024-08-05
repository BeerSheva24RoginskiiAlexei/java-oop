package telran.shapes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CanvasTest {
    @Test()
    void testPerimeter() {
        Canvas canvas = new Canvas();
        assertEquals(0, canvas.perimeter());
        canvas.addShape(new Rectangle(10, 20));
        canvas.addShape(new Square(10));
        assertEquals(100, canvas.perimeter());
    }

    @Test()
    void testSquare() {
        Canvas canvas = new Canvas();
        assertEquals(0, canvas.square());
        canvas.addShape(new Rectangle(10, 20));
        canvas.addShape(new Square(10));
        assertEquals(300, canvas.square());
    }

    @Test
    void countTest() {
        //TODO
        //returns number of all shapes in a canvas object
        //example: canvas has one rectangle, one square, one canvas containing two squares 
        //for this example the method should return 5
        Canvas canvas = new Canvas();
        canvas.addShape(new Square(5));
        canvas.addShape(new Square(6));


        Canvas newCanvas=new Canvas();
        newCanvas.addShape(canvas);
        newCanvas.addShape(new Rectangle(10, 20));
        newCanvas.addShape(new Square(20));

        assertEquals(5, newCanvas.count());
    }
    
}
