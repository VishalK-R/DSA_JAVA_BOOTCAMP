package com.java.geometry;

import java.util.Scanner;

public class Cube {
    private final double side;
    public Cube(double side){
        this.side =side;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side length of the cube");
        double side = sc.nextDouble();
        Cube cube = new Cube(side);
        cube.calculateSurfaceArea();
        sc.close();
    }

    /*Total Surface Area Of Cube
	    1. Start
	    2. Take the side as input.
	    3. calculate surfaceArea = 6 * Math.pow(side, 2).
	    4. Print ("Total Surface Area of the cube with side length " + side + " is " + surfaceArea)
	    5. Stop
     */
    public void calculateSurfaceArea(){
        double surfaceArea = 6 * Math.pow(this.side, 2);
        System.out.println("Total Surface Area of the cube with side length " + this.side + " is " + surfaceArea);
    }
}
