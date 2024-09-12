package com.java.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountItemsMatchingARule {

    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>(Arrays.asList(
                Arrays.asList("phone","blue","pixel"),
                Arrays.asList("computer","silver","lenovo"),
                Arrays.asList("phone","gold","iphone")
        ));
        String ruleKey = "color";
        String ruleValue = "silver";
        System.out.println(countMatches(list,ruleKey,ruleValue));
    }
    /*You are given an array items, where each items[i] = [typei, colori, namei]
    describes the type, color, and name of the ith item. You are also given a rule
    represented by two strings, ruleKey and ruleValue.

    The ith item is said to match the rule if one of the following is true:
            ruleKey == "type" and ruleValue == typei.
            ruleKey == "color" and ruleValue == colori.
            ruleKey == "name" and ruleValue == namei.
    Return the number of items that match the given rule.
     */
    public static int countMatches(List<List<String>> items, String ruleKey,
                                   String ruleValue) {
        int count = 0;
        int index = 0;
        switch (ruleKey) {
            case "color":
                index = 1;
                break;
            case "name":
                index = 2;
                break;
        }
        for (List<String> item : items){
            if(item.get(index).equals(ruleValue)) count++;
        }
        return count;
    }
}
