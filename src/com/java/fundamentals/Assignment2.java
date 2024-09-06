package com.java.fundamentals;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment2 {

    public static void main(String[] args) {
//        findEvenOrOdd();
//        greetName();
//        findSimpleInterest();
//        calculate();
//        findLargestOfTwoNumber();
//        convertRupeesToDollars();
//        findFibonacci();
//        findIfPalindrome();
        findFirstArmstrongNumberBetweenTwoNumbers();
    }

    /* 1. Write a program to print whether a number is even or odd, also take input from the user.
	    1. Start
	    2. Take an integer as input
	    3. if input%2==0, if false return odd
	    4. if true return even
	    5. Stop
     */
    public static void findEvenOrOdd(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an integer to find whether its odd or even");
        int num = sc.nextInt();
        if (num%2==0){
            System.out.println(num+" is a Even number");
        }else{
            System.out.println(num+" is a Odd number");
        }
        sc.close();
    }

    /* 2. Take name as input and print a greeting message for that particular name.
	    1. Start
	    2. Take an input(Name) as String
	    3. Print Hello + name
	    4. Stop
     */
    public static void greetName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your name");
        String name = sc.nextLine();
        System.out.println("Hello "+name);
        sc.close();
    }

    /* 3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
	    1. Start
	    2. Take three double values as input, which represents principal, time and rate respectively
	    3. calculate Simple interest using the formula p*t*r/100.
	    4. print simple interest
	    5. Stop
     */
    public static void findSimpleInterest(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Principal amount");
        double principal = sc.nextDouble();
        System.out.println("Input time in terms of years, if its months divide by 12 and input the value as decimal");
        double time = sc.nextDouble();
        System.out.println("Input Rate of Interest");
        double rate = sc.nextDouble();
        double simpleInterest = (principal*time*rate)/100;
        System.out.println(simpleInterest);
        sc.close();
    }

    /* Take in two numbers and an operator (+, -, *, /) and calculate the value.(Use if conditions)
	    1. Start
	    2. Take an operator as char input, and two numbers to perform the operation
	    3. if char == +, add two numbers and store it in result value
	    4. else if char == -, subtract 2nd number from 1st number and store it in result value
	    5. else if char == +, Multiply two numbers and store it in result value
	    6. else if char == -, divide 2nd number from 1st number and store it in result value
	    7. Print the result value
	    8. Stop
     */
    public static void calculate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input two numbers");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        System.out.println("Input the operation u need to perform +,-,/,*");
        char operator = sc.next().trim().charAt(0);
        double value = 0.0;
        if(operator=='+'){
           value = num1+num2;
        }else if(operator=='-'){
            value = num1-num2;
        }else if(operator=='*'){
            value = num1*num2;
        }else if(operator=='/'){
            value = num1/num2;
        }
        System.out.println(value);
        sc.close();
    }

    /*5. Take 2 numbers as input and print the largest number.
	    1. Start
	    2. Take two integer as input
	    3. assume max number = num1.
	    4. if num2 is greater than num1, max =num2
	    5. Print max
	    6. Stop
     */
    public static void findLargestOfTwoNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int max = num1;
        if(num2>num1) max = num2;
        System.out.println("Largest of "+num1+", "+num2+" is: "+max);
        sc.close();
    }

    /* 6. Input currency in rupees and output in USD.
	    1. Start
	    2. Take a double value which represents currency in indian rupees
	    3. Divide the value by 83.950 and that gives the value in usd
	    4. print the value in usd
	    5. Stop
     */
    public static void convertRupeesToDollars() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the rupees value");
        double inr = sc.nextDouble();
        double usd = inr/83.95;
        System.out.println("The value of "+inr+"Rs in usd is "+usd+"$");
        sc.close();
    }

    /* 7. To calculate Fibonacci Series up to n numbers.
	    1. Start
	    2. Take a positive integer n as input upto which fibonacci numbers is needed
	    3. initialize a BigInteger array fib of size n to store fibonacci numbers (Big Integer helps to overcome the negative values we get after exceeding the maximum values for int or long.
	    4. if the size of fib is 1 initialize fib[0]=0,
	    5. else if size of fib>=2 initialize fib[0]=0 fib[1]=1
	    6. start a for loop with i = 2 and run until i<n
	    7. for every iteration ar[i] = ar[i-1]+ar[i-2]
	    8. After the for loop print the array Using Arrays class toString method
	    9. Stop
     */
    public static void findFibonacci() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a positive integer");
        int n = sc.nextInt();
        BigInteger[] fib = new BigInteger[n];
        if(n==1){
            fib[0]= BigInteger.ZERO;
        }else if(n>=1){
            fib[0]=BigInteger.ZERO;
            fib[1]=BigInteger.ONE;
        }
        for(int i=2;i<n;i++){
            fib[i]=fib[i-1].add(fib[i-2]);
        }
        System.out.println(Arrays.toString(fib));
        sc.close();
    }

    /*8. To find out whether the given String is Palindrome or not.
	    1. By Two pointer method
		    1. Start
		    2. Get the string as input
		    3. initialize i=0; j=String.length-1, palindromeFlag = true
		    4. Start a while loop unless i<j
		    5. if String.charAt(i) == String.charAt(j) , increment i and decrement Java
		    6. else set palindromeFlag = true  break the loop;
		    7. If palindromeFlag print Palindrome
		    8. else print not Palindrome
		    9. Stop
	    2. By using String methods
		    1. Start
		    2. Get the string as input
		    3. Reverse the string using stringbuilder class and store as reverseString
		    4. If reverseString.equals(inputString), Print Palindrome
		    5. Else print not palindrome.
		    6. Stop
     */
    public static void findIfPalindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a String");
        String input = sc.nextLine();
        //using two pointer approach
        boolean palindromeFlag = true;
        int i=0,j=input.length()-1;
        while(i<j){
            if(input.charAt(i)==input.charAt(j)){
                i++;
                j--;
            }else{
                palindromeFlag = false;
                break;
            }
        }
        if (palindromeFlag){
            System.out.println(input+" is palindrome");
        }else {
            System.out.println(input+" is not palindrome");
        }
//        convert input to StringBuilder class reverse it and then convert back to string
//        String result = new StringBuilder(input).reverse().toString();
//        if(input.equals(result)){
//            System.out.println(input+" is palindrome");
//        } else {
//            System.out.println(input+" is not palindrome");
//        }
        sc.close();
    }
    /* 9. To find Armstrong Number between two given number.
	    1. Start
	    2. get two integers as Input. start, end
	    3. For number = start to end
	    4. Convert number to string
	    5. Get the number of digits
	    6. Initialize sum to 0
	    7. For each digit in the number
	    8. Raise digit to the power of number of digits
	    9. Add the result to sum
	    10. Check if sum equals number
	    11. If true, print the number and end
	    12. If no Armstrong number found, print message
	    13. End
     */
    public static void findFirstArmstrongNumberBetweenTwoNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input starting Integer followed by ending integer");
        int start = sc.nextInt();
        int end = sc.nextInt();
        for (int num=start; num<=end;num++){
            String i = num+"";
            int size = i.length();
            int sum =0;
            for (int j=0;j<size;j++){
                sum += Math.pow(Integer.parseInt(i.charAt(j)+""),size);
            }
            if(sum==num){
                System.out.println("The 1st Armstrong number between "+start+" and "+end+" is "+sum);
                break;
            }
        }
        sc.close();
    }
}
