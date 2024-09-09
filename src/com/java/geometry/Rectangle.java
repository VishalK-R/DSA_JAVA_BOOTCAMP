package com.java.geometry;

import java.util.Scanner;

public class Rectangle {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter length");
        double length = sc.nextDouble();
        System.out.println("Please enter width");
        double width = sc.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();
        sc.close();
    }

    /* Area Of Rectangle Program
	    1. Start
	    2. Take the values of length and breadth, l,b
	    3. area = a*b
	    4. Print ("Area of the rectangle with length " + l + " and width " + b + " is " + area)
	    5. Stop
     */
    public void calculateArea() {
        double area = this.length * this.width;
        System.out.println("Area of the rectangle with length " + this.length + " and width " + this.width + " is " + area);
    }

    /* Perimeter Of Rectangle
	    1. Start
	    2. Take the values for length and breadth. l,w.
	    3. calculate perimeter = 2*(l+w).
	    4. Print ("Perimeter of the Rectangle with length " + l + " and width " + w + " is " + perimeter)
	    6. Stop
     */

    public void calculatePerimeter() {
        double perimeter = 2 * (this.length + this.width);
        System.out.println("Perimeter of the Rectangle with length " + this.length + " and width " + this.width + " " + "is " + perimeter);
    }
}
