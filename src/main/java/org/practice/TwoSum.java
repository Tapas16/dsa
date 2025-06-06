package org.practice;

import java.util.HashMap;
import java.util.Map;
public class TwoSum {
    public static void main(String[] args) {
        // Write a program to find two numbers in an array that add up to a specific target
        int[] nums = {2, 7, 12, 15, 3, 5, 6};
        int target = 11;
        int[] result=null;
        try{
            result = twoSum(nums, target);
        }catch(Exception exp){
            System.out.println(exp.getMessage());
        }

        if (result != null) {
            System.out.println("Indices of the two numbers are: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No two numbers add up to the target.");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                return new int[] {map.get(complement)+1, i+1}; // Return indices of the two numbers
            }
            map.put(nums[i], i); // Store the index of the current number
        }
        throw new IllegalArgumentException("No Two Sum Solution");// No solution found
    }
}
