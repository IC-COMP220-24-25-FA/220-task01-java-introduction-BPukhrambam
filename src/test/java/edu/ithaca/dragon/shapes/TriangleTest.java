package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    public void calcAreaTest() {
        Triangle myTriangle = new Triangle(3, 3, 3);
        assertEquals(3.897, myTriangle.calcArea(), 0.001);

        myTriangle = new Triangle(4.8, 3.2, 5.2);
        assertEquals(7.52, myTriangle.calcArea(), 0.01);

        myTriangle = new Triangle(9, 7, 3);
        assertEquals(8.786, myTriangle.calcArea(), 0.001);

        assertThrows(IllegalArgumentException.class, () -> new Triangle(9, 5, 3));
        assertThrows(IllegalArgumentException.class, () -> new Triangle(5, 9, 3));
        assertThrows(IllegalArgumentException.class, () -> new Triangle(3, 5, 9));
    }

    @Test
    public void longestLineWithinTest() {
        Triangle myTriangle = new Triangle(3, 3, 3);
        assertEquals(3, myTriangle.longestLineWithin(), 0.1);

        myTriangle = new Triangle(4.8, 3.2, 5.2);
        assertEquals(5.2, myTriangle.longestLineWithin(), 0.1);

        myTriangle = new Triangle(9, 7, 3);
        assertEquals(9, myTriangle.longestLineWithin(), 0.1);
    }

    @Test
    public void doubleSizeTest() {
        Triangle myTriangle = new Triangle(3, 3, 3);
        myTriangle.doubleSize();
        assertEquals(7.794, myTriangle.calcArea(), 0.001);

        myTriangle = new Triangle(4.8, 3.2, 5.2);
        myTriangle.doubleSize();

        assertEquals(15.04, myTriangle.calcArea(), 0.01);

        myTriangle = new Triangle(9, 7, 3);
        myTriangle.doubleSize();
        assertEquals(17.572, myTriangle.calcArea(), 0.001);
    }
}
