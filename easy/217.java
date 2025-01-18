package easy;
// Given an integer array nums, 
//return true if any value appears at least twice in the array, 
//and return false if every element is distinct.

import java.lang.reflect.Array;
import java.util.Arrays;

//Example 1:

//Input: nums = [1,2,3,1]

//Output: true

//Explanation:

//The element 1 occurs at the indices 0 and 3.


class Solution_217 {
    public boolean containsDuplicate(int[] nums){
        // Sort the array in ascending order
        Arrays.sort(nums); 
        // Iterate through the array to check adjacent elements
         for(int i =0; i < nums.length -1; i++){
            if (nums[i] == nums[i + 1]) {
                // Compare current and next element
                return true; // duplicate found
            }
         }
         return false; // no duplicate found
    }

    // Main method to test the solution
    public static void main(String[] args) {
        // Create a Solution object to call the method
        Solution_217 solution = new Solution_217();

        // Example array
        int[] nums = {1, 2, 3, 4, 2};

        // Call the containsDuplicate method
        boolean result = solution.containsDuplicate(nums);

        // Print the result
        System.out.println("Contains duplicate: " + result);
    }
}
