package com.java.Arrays;

public class CheckIfTheSentenceIsPangram {

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
        System.out.println(checkPanagramBetterApproach(sentence));
    }
    /*  A pangram is a sentence where every letter of the English alphabet appears at
        least once.

        Given a string sentence containing only lowercase English letters, return true
        if sentence is a pangram, or false otherwise.
     */

    public static boolean checkIfPangram(String sentence) {
        int [] countAlphabetsArray = new int[26];
        for (int i = 0; i < sentence.length(); i++) {
            countAlphabetsArray[sentence.charAt(i)-97]++;
        }
        for(int count : countAlphabetsArray){
            if (count==0) return false;
        }
        return true;
    }

    public static boolean checkPanagramBetterApproach(String sentence){
        char ch = 'a';
        while(ch<='z'){
            if (sentence.indexOf(ch)==-1) return false;
            ch++;
        }
        return true;
    }
}
