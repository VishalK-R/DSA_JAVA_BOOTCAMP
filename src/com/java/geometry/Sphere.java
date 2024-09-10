package com.java.geometry;

import java.util.Scanner;

public class Sphere {
    private final double radius;
    public Sphere(double radius){
        this.radius = radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the sphere");
        double radius = sc.nextDouble();
        Sphere sphere = new Sphere(radius);
        sphere.calculateVolume();
        sc.close();
    }
    /*Volume Of Sphere
	    1. Start
	    2. Take the values for radius of the Sphere.
	    3. calculate volume = (4/3) * Math.pow(radius, 3).
	    4. Print ("Volume of the sphere with radius " + radius + " is " + volume)
	    5. Stop
     */
    public void calculateVolume(){
        double volume = (4.0/3.0) * Math.pow(this.radius, 3);
        System.out.println("Volume of the sphere with radius " + radius + " is " + volume);
    }
}
