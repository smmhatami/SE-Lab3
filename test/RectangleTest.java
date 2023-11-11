import static org.junit.Assert.assertEquals;

import Model.Rectangle;
import org.junit.Test;

public class RectangleTest {

    @Test
    public void testComputeArea(){
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

    @Test
    public void testGetWidth(){
        Rectangle rectangle;
        rectangle = new Rectangle(2, 3);
        assertEquals(rectangle.getWidth(), 2);
        rectangle = new Rectangle(1, 1);
        assertEquals(rectangle.getWidth(), 1);
        rectangle = new Rectangle(150, 200);
        assertEquals(rectangle.getWidth(), 150);
        rectangle = new Rectangle(1, 10000);
        assertEquals(rectangle.getWidth(), 1);
        rectangle = new Rectangle(7, 9);
        assertEquals(rectangle.getWidth(), 7);
    }

    @Test
    public void testGetHeight(){
        Rectangle rectangle;
        rectangle = new Rectangle(2, 3);
        assertEquals(rectangle.getHeight(), 3);
        rectangle = new Rectangle(1, 1);
        assertEquals(rectangle.getHeight(), 1);
        rectangle = new Rectangle(150, 200);
        assertEquals(rectangle.getHeight(), 200);
        rectangle = new Rectangle(1, 10000);
        assertEquals(rectangle.getHeight(), 10000);
        rectangle = new Rectangle(7, 9);
        assertEquals(rectangle.getHeight(), 9);
    }

    @Test
    public void testSetWidth(){
        Rectangle rectangle;
        rectangle = new Rectangle(2, 3);
        rectangle.setWidth(20);
        assertEquals(rectangle.getWidth(), 20);
        rectangle = new Rectangle(1, 1);
        rectangle.setWidth(3);
        assertEquals(rectangle.getWidth(), 3);
        rectangle = new Rectangle(150, 200);
        rectangle.setWidth(1);
        assertEquals(rectangle.getWidth(), 1);
        rectangle = new Rectangle(1, 10000);
        rectangle.setWidth(200);
        assertEquals(rectangle.getWidth(), 200);
        rectangle = new Rectangle(7, 9);
        rectangle.setWidth(10000);
        assertEquals(rectangle.getWidth(), 10000);
    }

    @Test
    public void testSetHeight(){
        Rectangle rectangle;
        rectangle = new Rectangle(2, 3);
        rectangle.setHeight(20);
        assertEquals(rectangle.getHeight(), 20);
        rectangle = new Rectangle(1, 1);
        rectangle.setHeight(3);
        assertEquals(rectangle.getHeight(), 3);
        rectangle = new Rectangle(150, 200);
        rectangle.setHeight(1);
        assertEquals(rectangle.getHeight(), 1);
        rectangle = new Rectangle(1, 10000);
        rectangle.setHeight(200);
        assertEquals(rectangle.getHeight(), 200);
        rectangle = new Rectangle(7, 9);
        rectangle.setHeight(10000);
        assertEquals(rectangle.getHeight(), 10000);
    }

}