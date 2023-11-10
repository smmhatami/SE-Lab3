import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SquareTest {

    @Test
    void testComputeArea(){
        Square square;
        square = new Square(2);
        assertEquals(square.computeArea(), 4);
        square = new Square(1);
        assertEquals(square.computeArea(), 1);
        square = new Square(150);
        assertEquals(square.computeArea(), 22500);
        square = new Square(10000);
        assertEquals(square.computeArea(), 100000000);
        square = new Square(7);
        assertEquals(square.computeArea(), 49);
    }


    @Test
    void testGetSide(){
        Square square;
        square = new Square(2);
        assertEquals(square.getSide(), 2);
        square = new Square(1);
        assertEquals(square.getSide(), 1);
        square = new Square(150);
        assertEquals(square.getSide(), 150);
        square = new Square(1);
        assertEquals(square.getSide(), 1);
        square = new Square(7);
        assertEquals(square.getSide(), 7);
    }

    @Test
    void testSetSide(){
        Square square;
        square = new Square(2);
        rectanlge.setSide(20);
        assertEquals(square.getSide(), 20);
        square = new Square(1);
        rectanlge.setSide(3);
        assertEquals(square.getSide(), 3);
        square = new Square(150);
        rectanlge.setSide(1);
        assertEquals(square.getSide(), 1);
        square = new Square(1);
        rectanlge.setSide(200);
        assertEquals(square.getSide(), 200);
        square = new Square(7);
        rectanlge.setSide(10000);
        assertEquals(square.getSide(), 10000);
    }

}