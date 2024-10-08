package edu.ithaca.dragon.shapes;

public class Circle implements Shape {
    private double radius;

    /**
     * @throws IllegalArgumentException if radius is not a positive number
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return "Cricle with radius " + this.radius;
    }

    /**
     * @return the area of this circle
     */
    public double calcArea() {
        double pi = 3.14159;
        return pi * this.radius * this.radius;
    }

    /**
     * @post doubles the size of this circle
     */
    public void doubleSize() {
        this.radius = this.radius * 2;
    }

    /**
     * @return the longest straight line that can be drawn within this circle
     */
    public double longestLineWithin() {
        return 2 * this.radius;
    }

    public double getRadius() {
        return this.radius;
    }
}
