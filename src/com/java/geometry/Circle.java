package com.java.geometry;

import java.util.Scanner;

public class Circle {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        double radius = sc.nextDouble();
        Circle circleObj = new Circle(radius);
        circleObj.calculateArea();
        circleObj.calculatePerimeter();
        sc.close();
    }

    /*Area Of Circle Java Program
            1. Start
	        2. Take a double value as input for radius
	        3. area = Math.pi*radius*radius
	        4. Print System.out.println("Area of the circle with radius " + radius + " is " + area)
	        5. Stop
     */
    public void calculateArea() {
        double area = Math.PI * this.radius * this.radius;
        System.out.println("Area of the circle with radius " + this.radius + " is " + area);
    }

    /*Perimeter Of Circle
        1. Start
	    2. Take a double as input value for radius
	    3. perimeter = 2*Math.pi*radius
	    4. Print System.out.println("Perimeter of the circle with radius " + radius + " is " + perimeter)
	    5. Stop
 */
    public void calculatePerimeter() {
        double perimeter = 2 * Math.PI * this.radius;
        System.out.println("Perimeter of the equilateral triangle with side length " + this.radius + " is " + perimeter);
    }

}
