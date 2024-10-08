package edu.ithaca.dragon.practice;

import java.util.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
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

    @Test
    public void isGoodDogTest() {
        assertTrue(FunctionPractice.isGoodDog(10, 4, true));
        assertFalse(FunctionPractice.isGoodDog(5, 2, true));
        assertFalse(FunctionPractice.isGoodDog(5, 2, false));

        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.isGoodDog(-2, 3, true));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.isGoodDog(2, -3, false));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.isGoodDog(-2, -3, true));

    }

    @Test
    public void findFirstLargestTest() {
        List<Integer> testList = new ArrayList<Integer>();
        assertEquals(-1, FunctionPractice.findFirstLargest(testList));
        testList.add(3);
        assertEquals(0, FunctionPractice.findFirstLargest(testList));
        testList.add(2);
        assertEquals(0, FunctionPractice.findFirstLargest(testList));
        testList.add(3);
        assertEquals(0, FunctionPractice.findFirstLargest(testList));
        testList.add(5);
        assertEquals(3, FunctionPractice.findFirstLargest(testList));
    }

    @Test
    public void findLastLargestTest() {
        List<Integer> testList = new ArrayList<Integer>();
        assertEquals(-1, FunctionPractice.findLastLargest(testList));
        testList.add(3);
        assertEquals(0, FunctionPractice.findLastLargest(testList));
        testList.add(2);
        assertEquals(0, FunctionPractice.findLastLargest(testList));
        testList.add(3);
        assertEquals(2, FunctionPractice.findLastLargest(testList));
        testList.add(5);
        assertEquals(3, FunctionPractice.findLastLargest(testList));
    }

    @Test
    public void findFirstMostOccurencesOfLetterTest() {
        List<String> testList = new ArrayList<String>();
        assertThrows(IllegalArgumentException.class,
                () -> FunctionPractice.findFirstMostOccurencesOfLetter(testList, 'a'));
        testList.add("Impossible");
        assertEquals("Impossible", FunctionPractice.findFirstMostOccurencesOfLetter(testList, 's'));
        testList.add("Highlander");
        assertEquals("Highlander", FunctionPractice.findFirstMostOccurencesOfLetter(testList, 'h'));
        testList.add("Impossibles");
        assertEquals("Impossibles", FunctionPractice.findFirstMostOccurencesOfLetter(testList, 's'));
        assertEquals("Char not present", FunctionPractice.findFirstMostOccurencesOfLetter(testList, 'u'));
    }

}
