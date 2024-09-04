package edu.ithaca.dragon.shapes;

import org.w3c.dom.css.Rect;
import java.util.*;
import java.io.*;

public class ShapeMain {

    public static void main(String[] args)
            throws IOException {
        List<Shape> shapes = new ArrayList<Shape>();
        for (int i = 0; i < 10; i++) {
            Random rand = new Random();
            int shapeInt = rand.nextInt(0, 3);
            if (shapeInt == 0) {
                shapes.add(new Rectangle(Math.random() * 10, Math.random() * 10));
            }
            if (shapeInt == 1) {
                shapes.add(new Circle(Math.random() * 10));
            }
            if (shapeInt == 2) {
                double side1 = Math.random() * 10;
                double side2 = Math.random() * 10;
                double side3 = Math.random() * 10;
                while (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
                    side1 = Math.random() * 10;
                    side2 = Math.random() * 10;
                    side3 = Math.random() * 10;
                }
                shapes.add(new Triangle(side1, side2, side3));
            }
        }

        System.out.println("Shapes list: ");

        for (int i = 0; i < 10; i++) {
            System.out.println(shapes.get(i).toString());
        }

        System.out.println("Doubled shapes list: ");

        for (int i = 0; i < 10; i++) {
            shapes.get(i).doubleSize();
            System.out.println(shapes.get(i).toString());
        }

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
            int choice = scanner.nextInt();
            rectangles.get(choice - 1).doubleSize();

            for (int j = 0; j < 5; j++) {
                System.out.println(j + 1 + " : " + rectangles.get(j).calcArea());
            }
        }

    }
}
