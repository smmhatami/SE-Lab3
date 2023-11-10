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

    @Test
    void testGetWidth(){
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
    void testGetHeight(){
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
    void testSetWidth(){
        Rectangle rectangle;
        rectangle = new Rectangle(2, 3);
        rectanlge.setWidth(20);
        assertEquals(rectangle.getWidth(), 20);
        rectangle = new Rectangle(1, 1);
        rectanlge.setWidth(3);
        assertEquals(rectangle.getWidth(), 3);
        rectangle = new Rectangle(150, 200);
        rectanlge.setWidth(1);
        assertEquals(rectangle.getWidth(), 1);
        rectangle = new Rectangle(1, 10000);
        rectanlge.setWidth(200);
        assertEquals(rectangle.getWidth(), 200);
        rectangle = new Rectangle(7, 9);
        rectanlge.setWidth(10000);
        assertEquals(rectangle.getWidth(), 10000);
    }

    @Test
    void testSetHeight(){
        Rectangle rectangle;
        rectangle = new Rectangle(2, 3);
        rectanlge.setHeight(20);
        assertEquals(rectangle.getHeight(), 20);
        rectangle = new Rectangle(1, 1);
        rectanlge.setHeight(3);
        assertEquals(rectangle.getHeight(), 3);
        rectangle = new Rectangle(150, 200);
        rectanlge.setHeight(1);
        assertEquals(rectangle.getHeight(), 1);
        rectangle = new Rectangle(1, 10000);
        rectanlge.setHeight(200);
        assertEquals(rectangle.getHeight(), 200);
        rectangle = new Rectangle(7, 9);
        rectanlge.setHeight(10000);
        assertEquals(rectangle.getHeight(), 10000);
    }

}