package com.java.geometry;

import java.util.Scanner;

public class Cylinder {
    private final double radius;
    private final double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the Cylinder");
        double radius = sc.nextDouble();
        System.out.println("Enter the height of the Cylinder");
        double height = sc.nextDouble();
        Cylinder cylinder = new Cylinder(radius, height);
        cylinder.calculateVolume();
        cylinder.calculateCurvedSurfaceArea();
        sc.close();
    }

    /* Volume Of Cylinder
	    1. Start
	    2. Take the values for radius and height of the Cylinder.
	    3. calculate volume = Math.PI * Math.pow(radius, 2) * height.
	    4. Print ("Volume of the cylinder with radius " + radius + " and height " + height + " is " + volume)
	    5. Stop
     */
    public void calculateVolume() {
        double volume = Math.PI * Math.pow(this.radius, 2) * this.height;
        System.out.println("Volume of the cylinder with radius " + this.radius + " and height " + this.height + " is "
                + volume);
    }

    /* Curved Surface Area Of Cylinder
	    1. Start
	    2. Take the values for radius and height of the Cylinder.
	    3. calculate curvedSurfaceArea = 2 * Math.PI * radius * height.
	    4. Print ("Curved Surface Area of the cylinder with radius " + radius + " and height " + height + " is " +
	    curvedSurfaceArea)
	    5. Stop
     */
    public void calculateCurvedSurfaceArea() {
        double curvedSurfaceArea = 2 * Math.PI * radius * height;
        System.out.println("Curved Surface Area of the cylinder with radius " + this.radius + " and height " +
                this.height + " is " + curvedSurfaceArea);
    }
}
