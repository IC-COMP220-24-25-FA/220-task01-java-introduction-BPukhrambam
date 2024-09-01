package edu.ithaca.dragon.shapes;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1In, double side2In, double side3In){
        side1 = side1In;
        side2 = side2In;
        side3 = side3In;
    }

    public double calcArea(){
        double semiPerimeter = (side1 + side2 + side3)/2;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
        return area;
    }

    public void doubleSize(){
        throw new RuntimeException("Not Implemented");
    }

    public double longestLineWithin(){
        throw new RuntimeException("Not Implemented");
    }
    
}
