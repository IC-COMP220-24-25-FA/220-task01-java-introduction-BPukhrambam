package edu.ithaca.dragon.shapes;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double calcArea(){
       return this.length * this.width;
    }

    public void doubleSize(){
        throw new RuntimeException("Not implemented yet");
    }

    public double longestLineWithin(){
        return Math.sqrt(Math.pow(this.length, 2) + Math.pow(this.width, 2));
    }

    public double getLength(){
        return this.length;
    }
    
}
