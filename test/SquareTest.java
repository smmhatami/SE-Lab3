import static org.junit.Assert.assertEquals;

import Model.Square;
import org.junit.Test;

public class SquareTest {

    @Test
    public void testComputeArea(){
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
    public void testGetSide(){
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
    public void testSetSide(){
        Square square;
        square = new Square(2);
        square.setSide(20);
        assertEquals(square.getSide(), 20);
        square = new Square(1);
        square.setSide(3);
        assertEquals(square.getSide(), 3);
        square = new Square(150);
        square.setSide(1);
        assertEquals(square.getSide(), 1);
        square = new Square(1);
        square.setSide(200);
        assertEquals(square.getSide(), 200);
        square = new Square(7);
        square.setSide(10000);
        assertEquals(square.getSide(), 10000);
    }

}