package com.java.geometry;

import java.util.Scanner;

public class IsoscelesTriangle {
    private final double side;
    private final double base;

    public IsoscelesTriangle(double side, double base) {
        this.side = side;
        this.base = base;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the equivalent side");
        double side = sc.nextDouble();
        System.out.println("Enter the value of base");
        double base = sc.nextDouble();
        IsoscelesTriangle it = new IsoscelesTriangle(side, base);
        it.calculateArea();
        sc.close();
    }

    /* Area Of Isosceles Triangle with base and side values
	    1. Start
	    2. Take the values of side and base, a,b
	    3. calculate height h = Math.sqrt(side * side - Math.pow((base/2),2))
	    4. area = 0.5*b*h
	    5. Print ("Area of the isosceles triangle with side " + a + " and base " + b + " is " + area)
	    6. Stop
     */

    public void calculateArea() {
        double height = Math.sqrt(side * side - Math.pow((base / 2), 2));//using pythogoras theorem to get height a^2
        // = b^2+c^2
        double area = 0.5 * base * height;
        System.out.println("Area of the isosceles triangle with side " + this.side + " and base " + this.base + " is "
                + area);
    }
}
