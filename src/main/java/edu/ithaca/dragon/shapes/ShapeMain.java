package edu.ithaca.dragon.shapes;

import org.w3c.dom.css.Rect;
import java.util.*;
import java.io.*;

public class ShapeMain {

    public static void main(String[] args)
            throws IOException {
        // Make a list of 5 randomly-sized rectangles and print their area and the
        // largest line that can be drawn through them
        List<Rectangle> rectangles = new ArrayList<Rectangle>();
        for (int i = 0; i < 5; i++) {
            rectangles.add(new Rectangle(Math.random() * 10, Math.random() * 10));
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(i + 1 + " : " + rectangles.get(i).calcArea());
        }

        // Allow the user to choose one, double the size of that one, and print them all
        // again
        // Use a loop to repeat the process 5 times

        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Choose rectangle to be Doubled: ");
2
            int choice = scanner.nextInt();
            rectangles.get(choice - 1).doubleSize();

            for (int j = 0; j < 5; j++) {
                System.out.println(j + 1 + " : " + rectangles.get(j).calcArea());
            }
        }

    }
}
