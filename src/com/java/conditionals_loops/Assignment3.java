package com.java.conditionals_loops;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
//        System.out.println(subtractProductAndSum(33));
//        printFactorials(1202392);
        printLargestNUmber();
    }

    /*Subtract the Product and Sum of Digits of an Integer*/
    public static int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        while (n != 0) {
            int rem = n % 10;
            sum += rem;
            product *= rem;
            n = n / 10;
        }
        return product - sum;
    }

    /*  Input a number and print all the factors of that number (use loops). */
    public static void printFactorials(int n) {
        int num = 1;
//        while(num<=n){
//            if(n%num==0){
//                System.out.print(num+" ");
//            }
//            num++;
//        }

        while (n >= num * num) {
            if (n % num == 0) {
                System.out.print(num + " " + (n / num) + " ");
            }
            num++;
        }
    }

    /* Take integer inputs till the user enters 0 and print the largest number from all.*/
    public static void printLargestNUmber(){
        Scanner sc = new Scanner(System.in);
        int num = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        System.out.println("Enter the integer if 0 is entered you exit the program and " +
                "get the largest num entered till now,");
        while(num!=0) {
            num = sc.nextInt();
            if(num>max){
                max = num;
            }
        }
        System.out.println(max);
        sc.close();
    }
}
