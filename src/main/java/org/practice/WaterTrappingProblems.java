package org.practice;

public class WaterTrappingProblems {
    //two pointer approach
    //define the array
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("Trapped water: " + trap(height));
    }

    public static int trap(int[] blockArr){
        int result=0;
        int[] leftMax = new int[blockArr.length];
        int[] rightMax = new int[blockArr.length];
        // Fill leftMax array
        leftMax[0] = blockArr[0];
        for(int i=1;i<blockArr.length;i++){
            leftMax[i]=Math.max(leftMax[i-1],blockArr[i]);
        }
        System.out.println("Left Max Array: "+java.util.Arrays.toString(leftMax));
        // Fill rightMax array
        rightMax[blockArr.length-1] = blockArr[blockArr.length-1];
        for(int ii=blockArr.length-2;ii>=0;ii--){
            rightMax[ii]=Math.max(rightMax[ii+1],blockArr[ii]);
        }
        System.out.println("Right Max Array: "+java.util.Arrays.toString(rightMax));

        //Left Max Array: [0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3]
        //Right Max Array: [3, 3, 3, 3, 3, 3, 3, 3, 2, 2, 2, 1]
        // Calculate trapped water
        for(int i=0;i<blockArr.length;i++){
            // Water trapped at current index is the minimum of leftMax and rightMax minus the height at that index
            result += Math.min(leftMax[i], rightMax[i]) - blockArr[i];
        }

        return result;
    }
}
