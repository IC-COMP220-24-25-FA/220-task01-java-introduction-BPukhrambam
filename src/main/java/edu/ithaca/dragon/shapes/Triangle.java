package edu.ithaca.dragon.shapes;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1In, double side2In, double side3In) {
        side1 = side1In;
        side2 = side2In;
        side3 = side3In;
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalArgumentException("Sides do not make a triangle");
        }

    }

    public double calcArea() {
        double semiPerimeter = (side1 + side2 + side3) / 2;
        double area = Math
                .sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
        return area;
    }

    public void doubleSize() {
        side1 = side1 * Math.sqrt(2);
        side2 = side2 * Math.sqrt(2);
        side3 = side3 * Math.sqrt(2);
    }

    public double longestLineWithin() {
        if (side1 > side2 && side1 > side3) {
            return side1;
        }
        if (side2 > side1 && side2 > side3) {
            return side2;
        } else {
            return side3;
        }

    }
}
