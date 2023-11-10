import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RectangleTest {

    @Test
    void testComputeArea(){
        Rectangle rectangle;
        rectangle = new Rectangle(2, 3);
        assertEquals(rectangle.computeArea(), 6);
        rectangle = new Rectangle(1, 1);
        assertEquals(rectangle.computeArea(), 1);
        rectangle = new Rectangle(150, 200);
        assertEquals(rectangle.computeArea(), 30000);
        rectangle = new Rectangle(1, 10000);
        assertEquals(rectangle.computeArea(), 10000);
        rectangle = new Rectangle(7, 9);
        assertEquals(rectangle.computeArea(), 63);
    }
}