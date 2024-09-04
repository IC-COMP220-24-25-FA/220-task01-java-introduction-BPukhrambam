package edu.ithaca.dragon.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class FunctionPracticeTest {

    @Test
    public void largestOfThreeTest() {
        assertEquals(5, FunctionPractice.largestOfThree(4, 5, 2)); /*
                                                                    * verifies if largest number
                                                                    * is retrieved when it is the second number
                                                                    */
        assertEquals(5, FunctionPractice.largestOfThree(5, 4, 2)); /*
                                                                    * verifies if largest number
                                                                    * is retrieved when it is the first number
                                                                    */
        assertEquals(5, FunctionPractice.largestOfThree(4, 2, 5)); /*
                                                                    * verifies if largest number
                                                                    * is retrieved when it is the third number
                                                                    */
        assertEquals(5, FunctionPractice.largestOfThree(5, 5, 5)); /*
                                                                    * verifies if largest number
                                                                    * is retrieved when all numbers are equal
                                                                    */

        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(-1, -1, -1)); /*
                                                                                                          * verifies
                                                                                                          * if an error
                                                                                                          * is thrown
                                                                                                          * when all
                                                                                                          * numbers are
                                                                                                          * negative
                                                                                                          */
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, -1, 3)); /*
                                                                                                        * verifies
                                                                                                        * if an error is
                                                                                                        * thrown when
                                                                                                        * the second
                                                                                                        * number is
                                                                                                        * negative
                                                                                                        */
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, 3, -1)); /*
                                                                                                        * verifies
                                                                                                        * if an error is
                                                                                                        * thrown when
                                                                                                        * the third
                                                                                                        * number is
                                                                                                        * negative
                                                                                                        */
    }

    @Test
    public void calcSalePriceTest() {
        assertEquals(85, FunctionPractice.calcSalePrice(100, 20, 5));
        assertEquals(950, FunctionPractice.calcSalePrice(1000, 10, 50));

        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.calcSalePrice(1000, 200, 50));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.calcSalePrice(-10, 200, 50));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.calcSalePrice(100, -20, 50));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.calcSalePrice(100, 20, -50));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.calcSalePrice(-100, -20, -50));

    }

}
