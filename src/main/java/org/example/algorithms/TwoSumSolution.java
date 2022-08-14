package org.example.algorithms;

public class TwoSumSolution {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[j] + nums[i]) {
                    System.out.printf("i = %d, j = %d\n", i, j);
                    System.out.println("i = " + i + ", j = " + j);
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}