package com.java.Arrays;

public class MinCostToMoveChipsToTheSamePosition {

    public static void main(String[] args) {
        int [] position = {1,2,3};
        System.out.println(minCostToMoveChips(position));
    }
    /*determining the minimum cost required to move multiple chips to the same position
    on a number line. It outlines the movement mechanics where moving chips by 2 units
    incurs no cost, while moving them by 1 unit incurs a cost of 1. Through illustrative
    examples, it demonstrates how the minimum cost is calculated based on chip
    distributions, clarifying that strategic movement can significantly reduce overall
    costs.
     */
    public static int minCostToMoveChips(int[] position) {
        int even_count = 0;
        for (int posValue : position){
            if(posValue%2==0){
                even_count++;
            }
        }
        int odd_count = position.length - even_count;
        return Math.min(odd_count,even_count);
    }
}
