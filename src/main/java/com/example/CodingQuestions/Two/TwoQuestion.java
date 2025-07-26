package com.example.CodingQuestions.Two;

public class TwoQuestion {
    /*
        Find a pair in the array which sums up to the target
        Input 1
        array = {1, 2, 3, 4, 5, 6}
        target = 8

        Output - true (2 + 6 == 8)


        Input 2
        array = {1, 2, 3}
        target = 6

        Output - false (There is no pair available which sums up to 6)
    */

    public boolean twoSum(int[] nums, int target) {
        TwoSolution twoSolution = new TwoSolution();
        return twoSolution.twoSum(nums, target);
    }
}
