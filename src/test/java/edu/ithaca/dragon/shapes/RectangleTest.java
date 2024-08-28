package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    public void calcAreaTest(){
        assertThrows(IllegalArgumentException.class, () -> new Circle(0));
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
