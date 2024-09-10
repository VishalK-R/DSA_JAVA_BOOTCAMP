package com.java.geometry;

import java.util.Scanner;

public class Pyramid {
    private final double baseArea;
    private final double height;
    public  Pyramid(double baseArea, double height){
        this.baseArea = baseArea;
        this.height = height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base area of Pyramid");
        double baseArea = sc.nextDouble();
        System.out.println("Enter the height of Pyramid");
        double height = sc.nextDouble();
        Pyramid pyramid = new Pyramid(baseArea, height);
        pyramid.calculateVolume();
        sc.close();
    }

    /*Volume Of Pyramid
	    1. Start
	    2. Take the values of baseArea and height of the Pyramid.
	    3. calculate volume = (1/3)* baseArea * height. (base area can be found out using length*width)
	    4. Print ("Volume of the Pyramid with base area " + baseArea + " and height " + height + " is " + volume)
	    5. Stop
     */
    public void calculateVolume(){
        double volume = (1.0/3.0)* this.baseArea * this.height;
        System.out.println("Volume of the Pyramid with base area " + this.baseArea + " and height " + this.height + " is " + volume);
    }
}
