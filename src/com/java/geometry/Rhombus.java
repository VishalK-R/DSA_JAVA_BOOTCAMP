package com.java.geometry;

import java.util.Scanner;

public class Rhombus {
    private final double side;
    private final double angleInRadians;

    public Rhombus(double side, double angleInRadians) {
        this.side = side;
        this.angleInRadians = angleInRadians;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of side");
        double side = sc.nextDouble();
        System.out.println("Enter the value of angle in radians");
        double angleInRadians = sc.nextDouble();
        Rhombus rhombus = new Rhombus(side, angleInRadians);
        rhombus.calculateArea();
        rhombus.calculatePerimeter();
        sc.close();
    }


    /*Perimeter Of Rhombus
        1. Start
        2. Take the values of the side. s
        3. calculate perimeter = 4*s.
        4. Print ("Perimeter of the rhombus with side length " + side + " is " + perimeter)
        6. Stop
     */
    private void calculatePerimeter() {
        double perimeter = 4 * this.side;
        System.out.println("Perimeter of the rhombus with side length " + this.side + " is " + perimeter);
    }

    /*Area Of Rhombus
         1. Start
         2. Take the values of side and angle in radians. s, angleInRadians.
         3. calculate area = s * s * Math.sin(angleInRadians).
         4. Print ("Area of the rhombus with side length " + s + " and angle " + angleInRadians + " radians is " + area)
         5. Stop
    */
    public void calculateArea() {
        double area = this.side * this.side * Math.sin(angleInRadians);
        System.out.println("Area of the rhombus with side length " + this.side + " and angle " +
                this.angleInRadians + " radians is " + area);
    }
}
