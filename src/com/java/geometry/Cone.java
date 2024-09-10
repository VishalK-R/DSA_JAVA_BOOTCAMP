package com.java.geometry;

import java.util.Scanner;

public class Cone {
    private final double radius;
    private final double height;
    public Cone(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of Cone");
        double radius = sc.nextDouble();
        System.out.println("Enter the height of Cone");
        double height = sc.nextDouble();
        Cone cone = new Cone(radius, height);
        cone.calculateVolume();
        sc.close();
    }

    /*Volume Of Cone
	    1. Start
	    2. Take the values of radius and height of the cone. r, h
	    3. calculate volume = (1.0 / 3) * Math.PI * radius * radius * height.
	    4. Print ("Volume of the cone with radius " + radius + " and height " + height + " is " + volume)
	    5. Stop
     */
    public void calculateVolume(){
        double  volume = (1.0 / 3) * Math.PI * this.radius * this.radius * this.height;
        System.out.println("Volume of the cone with radius " + this.radius + " and height " + this.height + " is " + volume);
    }
}
