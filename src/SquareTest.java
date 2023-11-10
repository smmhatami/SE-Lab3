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
}