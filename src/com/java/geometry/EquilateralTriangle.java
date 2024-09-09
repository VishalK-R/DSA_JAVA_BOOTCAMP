package com.java.geometry;

import java.util.Scanner;

public class EquilateralTriangle {
    private final double side;

    public EquilateralTriangle(double side) {
        this.side = side;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the side for Equilateral Triangle");
        double side = sc.nextDouble();
        EquilateralTriangle et = new EquilateralTriangle(side);
        et.calculateArea();
        et.calculatePerimeter();
        sc.close();
    }

    /* Area Of Equilateral Triangle
        1. Start
        2. Take the values of side. s.
        3. calculate area = (Math.sqrt(3) / 4) * side * side.
        4. Print ("Area of the equilateral triangle with side length " + s + " is " + area)
        6. Stop
     */
    public void calculateArea() {
        double area = (Math.sqrt(3) / 4) * this.side * this.side;
        System.out.println("Area of the equilateral triangle with side length " + this.side + " is " + area);
    }

    /* Perimeter Of Equilateral Triangle
	    1. Start
	    2. Take the values of side. s.
	    3. calculate perimeter = 3*s.
	    4. Print ("Perimeter of the equilateral triangle with side length " + s + " is " + perimeter)
	    6. Stop
     */

    public void calculatePerimeter(){
        double perimeter = 3*this.side;
        System.out.println("Perimeter of the equilateral triangle with side length " + this.side + " is " + perimeter);
    }

}
