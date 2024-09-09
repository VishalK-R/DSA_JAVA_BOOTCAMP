package com.java.geometry;

import java.util.Scanner;

public class ScaleneTriangle {
    private final double side1;
    private final double side2;
    private final double side3;

    public ScaleneTriangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter side 1 value");
        double side1 = sc.nextDouble();
        System.out.println("Please enter side 2 value");
        double side2 = sc.nextDouble();
        System.out.println("Please enter side 3 value");
        double side3 = sc.nextDouble();
        ScaleneTriangle st = new ScaleneTriangle(side1, side2, side3);
        st.calculateArea();
        sc.close();
    }

    /*2. Area Of Triangle with three sides
	    1. Start
	    2. Take the values of 3 sides, a,b,c
	    3. calculate semi periemeter s = (a+b+c)/2
	    4. area = Math.sqrt(s*(s-a)*(s-b)*(s-c))
	    5. Print ("Area of the triangle with sides " + a + ", " + b + ", and " + c + " is " + area)
	    6. Stop
     */
    public void calculateArea() {
        double s = (this.side1 + this.side2 + this.side3) / 2;
        double area = Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
        System.out.println("Area of the triangle with sides " + this.side1 + ", " + this.side2 + ", and " + this.side3 + " is " + area);
    }
}
