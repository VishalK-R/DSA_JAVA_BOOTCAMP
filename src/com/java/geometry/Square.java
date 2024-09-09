package com.java.geometry;

import java.util.Scanner;

public class Square {
    private final double side;
    public Square(double side){
        this.side = side;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the side square");
        double side = sc.nextDouble();
        Square square = new Square(side);
        square.calculateArea();
        square.calculatePerimeter();
        sc.close();
    }

    /* Area Of Square
	    1. Start
	    2. Take the values of side. s.
	    3. calculate area = s * s.
	    4. Print ("Area of the square with side length " + s + " is " + area)
	    6. Stop
     */
    public void calculateArea(){
        double area = this.side*this.side;
        System.out.println("Area of the square with side length " + this.side + " is " + area);
    }

    /* Perimeter Of Square
	    1. Start
	    2. Take the values of the side. s
	    3. calculate perimeter = 4*s.
	    4. Print ("Perimeter of the square with side length " + side + " is " + perimeter)
	    6. Stop
     */

    public void calculatePerimeter(){
        double perimeter = 4*this.side;
        System.out.println("Perimeter of the square with side length " + this.side + " is " + perimeter);
    }

}
