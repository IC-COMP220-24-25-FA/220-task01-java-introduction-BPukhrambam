package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    public void calcAreaTest(){
        Rectangle myRectangle = new Rectangle(5, 4);
        assertEquals(20, myRectangle.calcArea(), 0.1);

        myRectangle = new Rectangle(3.2, 1.2);
        assertEquals(3.84, myRectangle.calcArea(), 0.1);

        myRectangle = new Rectangle(9, 0.2);
        assertEquals(1.8, myRectangle.calcArea(), 0.1);
    }

    @Test
    public void TestConstructorError(){
        assertThrows(IllegalArgumentException.class, () -> new Circle(0));
    }

    @Test
    public void longestLineWithinTest(){
        assertThrows(IllegalArgumentException.class, () -> new Circle(0));
    }
    
    @Test
    public void doubleSizeTest(){
        assertThrows(IllegalArgumentException.class, () -> new Circle(0));
    }
}
