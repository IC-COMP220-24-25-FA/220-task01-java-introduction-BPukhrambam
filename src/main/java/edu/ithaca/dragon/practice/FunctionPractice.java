package edu.ithaca.dragon.practice;

import java.util.List;

public class FunctionPractice {

    /**
     * @return the largest of the 3 numbers
     * @throws IllegalArgumentException if any of the numbers is negative
     */
    public static int largestOfThree(int first, int second, int third) {
        if (first > 0 && second > 0 && third > 0) {
            if (first > second && first > third) {
                return first;
            }
            if (second > first && second > third) {
                return second;
            } else {
                return third;
            }
        } else {
            throw new IllegalArgumentException("At least one of the numbers is negative");
        }
    }

    /**
     * @return the final price at register of the given item after discount and tax
     *         applied
     */
    public static double calcSalePrice(double originalPrice, double discountPercent, double salesTax) {
        if (originalPrice > 0 && discountPercent > 0 && discountPercent <= 100 && salesTax > 0) {
            return originalPrice - (originalPrice * discountPercent) / 100 + salesTax;
        } else {
            throw new IllegalArgumentException("Check values");
        }
    }

    /**
     * @return true if the data collected shows the dog is good, false if bad dog
     *         today
     */
    public static boolean isGoodDog(int yearsOld, int daysSinceShoesChewed, boolean fetchedThePaperToday) {
        if (yearsOld > 0 && daysSinceShoesChewed > 0) {
            if (daysSinceShoesChewed > 3 && fetchedThePaperToday == true) {
                return true;
            } else {
                return false;
            }
        } else {
            throw new IllegalArgumentException("Year or Age cannot be negative");
        }
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is
     *         empty.
     *         If the largest number occurs more than once, return the index of the
     *         first occurence.
     */
    public static int findFirstLargest(List<Integer> numbers) {
        if (numbers.size() > 0) {
            int maxIndex = 0;
            for (int i = 1; i < numbers.size(); i++) {
                if (numbers.get(maxIndex) < numbers.get(i)) {
                    maxIndex = i;
                }
            }
            return maxIndex;
        } else {
            return -1;
        }
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is
     *         empty.
     *         If the largest number occurs more than once, return the index of the
     *         last occurence.
     */
    public static int findLastLargest(List<Integer> numbers) {
        if (numbers.size() > 0) {
            int maxIndex = 0;
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(maxIndex) <= numbers.get(i)) {
                    maxIndex = i;
                }
            }
            return maxIndex;
        } else {
            return -1;
        }
    }

    /**
     * @return the string that has contains the most occurences of the given letter
     * @throws
     */
    public static String findFirstMostOccurencesOfLetter(List<String> words, char letter) {
        if (words.size() > 0) {
            String word = "Char not present";
            int count = 0;
            for (int listIndex = 0; listIndex < words.size(); listIndex++) {
                int tempCount = 0;
                for (int i = 0; i < words.get(listIndex).length(); i++) {
                    if (words.get(listIndex).charAt(i) == letter) {
                        tempCount++;
                    }
                    if (tempCount > count) {
                        count = tempCount;
                        word = words.get(listIndex);
                    }
                }
            }
            return word;
        } else {
            throw new IllegalArgumentException("List is empty");
        }
    }
}
