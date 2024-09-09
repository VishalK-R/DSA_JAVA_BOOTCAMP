package com.java.geometry;

import java.util.Scanner;

public class Parallelogram {
    private final double side1;
    private final double side2;
    private final double angleInRadians;

    public Parallelogram(double side1, double side2, double angleInRadians) {
        this.side1 = side1;
        this.side2 = side2;
        this.angleInRadians = angleInRadians;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of side1");
        double side1 = sc.nextDouble();
        System.out.println("Enter the value of side2");
        double side2 = sc.nextDouble();
        System.out.println("Enter the value of angle in radians");
        double angleInRadians = sc.nextDouble();
        Parallelogram parallelogram = new Parallelogram(side1, side2, angleInRadians);
        parallelogram.calculateArea();
        parallelogram.calculatePerimeter();
        sc.close();
    }

    /*Area Of Parallelogram
	    1. Start
	    2. Take the values of two sides and angle in radians. a,b, angleInRadians.
	    3. calculate area = a*b*Math.sin(angleInRadians).
	    4. Print ("Area of the parallelogram with sides " + a + " and " + b + " and angle " + angleInRadians + "
	    radians is " + area)
	    5. Stop
     */
    public void calculateArea() {
        double area = this.side1 * this.side2 * Math.sin(angleInRadians);
        System.out.println("Area of the parallelogram with sides " + this.side1 + " and " + this.side2 + " and angle "
                + this.angleInRadians + " radians is " + area);
    }

    /*Perimeter Of Parallelogram
	    1. Start
	    2. Take the values of two sides. a,b.
	    3. calculate perimeter = 2*(a+b).
	    4. Print ("Perimeter of the parallelogram with sides " + side1 + " and " + side2 + " is " + perimeter)
	    5. Stop
     */
    public void calculatePerimeter() {
        double perimeter = 2 * (this.side1 + this.side2);
        System.out.println("Perimeter of the parallelogram with sides " + this.side1 + " and " + this.side2 + " is " + perimeter);
    }
}
