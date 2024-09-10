package com.java.geometry;

import java.util.Scanner;

public class Prism {
    private final double length;
    private final double width;
    private final double height;

    public Prism(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Prism");
        double length = sc.nextDouble();
        System.out.println("Enter the width of Prism");
        double width = sc.nextDouble();
        System.out.println("Enter the height of Prism");
        double height = sc.nextDouble();
        Prism prism = new Prism(length, width, height);
        prism.calculateVolume();
        sc.close();
    }
    /* Volume Of Prism
	    1. Start
	    2. Take the values of baseArea and height of the prism.
	    3. calculate volume = baseArea * height. (base area can be found out using length*width)
	    4. Print ("Volume of the prism with base area " + baseArea + " and height " + height + " is " + volume)
	    5. Stop
     */
    public void calculateVolume() {
        double baseArea = this.length * this.width;
        double volume = baseArea * this.height;
        System.out.println("Volume of the prism with length " + this.length + ", width " + this.width + " and height "
                + this.height + " is " + volume);
    }
}
