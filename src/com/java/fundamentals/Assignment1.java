package com.java.fundamentals;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
//        findLeapYear();
//        printSumOfTwoNumbers();
//        printMultiplicationTable();
//        printHCFAndLCM();
        printSumOfAll();
    }

    /*
     *1. Input a year and find whether it is a leap year or not.
	    1. Start
	    2. Take the year input as integer
	    3. if year%4==0, if false, return false
	    4. if true, if year%100!=0 || year%1000==0, if false, return false
	    5. if true return true
	    6. Stop
     */
    public static void findLeapYear(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a year");
        int year = sc.nextInt();
        if (year%4==0){
            if(year%100!=0||year%1000==0){
                System.out.println(year+" is leap year");
            }else{
                System.out.println(year+" is not leap year");
            }
        }else{
            System.out.println(year+" is not leap year");
        }
    }

    /*
    2. Take two numbers and print the sum of both.
	    1. Start
	    2. Take two integers as input
	    3. process (add) the input
	    4. print the result
	    5. Stop
     */
    public static void printSumOfTwoNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input two numbers which as to be added");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1+num2;
        System.out.println("the sum of "+num1+" "+num2+" = "+sum);
    }

    /*
    3. Take a number as input and print the multiplication table for it.
	    1. Start
	    2. Take an integer as input for which multiplication table has to be printed
	    3. process start a for loop with i as 1 till i<=10
	    4. print for every iteration "num"+" * "+i+" = "+(num*i)
	    5. Stop
     */
    public static void printMultiplicationTable(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number to get its multiplication table");
        int num = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num+" * "+i+" = "+(num*i));
        }
    }

    /*
    4. Take 2 numbers as inputs and find their HCF and LCM.
	    1. Start
	    2. Take two integers as input
	    3. initialize hcf = 1, lcm = num1*num2;
	    4. to find HCF (use Euclidean algorithm) (steps repeated until num2 == 0)
		    a. start while loop
		    b. initialize temp as num2
		    c. num2 = num1 % num2
		    d. num1 = temp
		    e. after the loop exits whatever the value is num1 that is hcf
	    5. lcm	= lcm/HCF
	    6. print "HCF and LCM of "+num1+" "num2+" is "+hcf+" "+lcm
	    7. Stop
     */
    public static void printHCFAndLCM(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input two numbers whose HCF and LCM has to be outputted");
        int num1  = sc.nextInt();
        int num2 = sc.nextInt();
        int a = num1;
        int b =num2;
        while(b!=0){
            int temp = b;
            b = a/b;
            a = temp;
        }

        int hcf = a;
        int lcm = (num1*num2)/hcf;

        System.out.println("HCF and LCM of "+num1+" "+num2+" is "+hcf+" "+lcm );
    }

    /*
    5. Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
	    1. Start
	    2. initialize a flag to true, sum = 0
	    3. start a while loop
	    4. take input from the user
	    5. if the input is x print sum and set flag too false to exit while loop
	    6. else sum=+Integer.parsInt(input)
	    7. Stop
     */

    public static void printSumOfAll(){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int sum =0;
        while(flag){
            System.out.println("Input number to add or x to get sum till now");
            String value = sc.nextLine();
            if(value.equalsIgnoreCase("x")){
                flag =false;
                System.out.println("Sum ="+sum);
            }else {
                sum += Integer.parseInt(value);
            }
        }
    }
}
