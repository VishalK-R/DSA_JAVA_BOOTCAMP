package com.java.Arrays;

import java.util.Arrays;

public class FlippingAnImage {

    public static void main(String[] args) {
        int[][] images = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        System.out.println(Arrays.toString(flipAndInvertImage(images)));
    }

    /*Given an n x n binary matrix image, flip the image horizontally, then invert it,
        and return the resulting image.
        To flip an image horizontally means that each row of the image is reversed.
     */
    public static int[][] flipAndInvertImage(int[][] images) {
        int[][] invertedArray= new int[images.length][];
        for (int j = 0; j < images.length; j++){
            int [] image = images[j];
            invertedArray[j] = new int[image.length];
            for (int i = 0; i < image.length; i++) {
                invertedArray[j][image.length-1-i] = image[i]^1;
            }
        }
        return invertedArray;
    }
}
