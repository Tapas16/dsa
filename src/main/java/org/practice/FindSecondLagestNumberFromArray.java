package org.practice;

public class FindSecondLagestNumberFromArray {
    public static void main(String[] args) {
        //write a program for calculating the second largest number from a given array with best time complextity and space complexity
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,6,5,12};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }
        System.out.println("Second largest number is: " + second);
        //what is the time compleitity and space complexitity here
        //Time complexity is O(n) and space complexity is O(1)
    }
}
