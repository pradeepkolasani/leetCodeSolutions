/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1]*/

import java.util.*;
public class TwoSum
{
	public static void main(String[] args) {
	    int[] a = {3,2,4};
	    
	    System.out.println("Hello World"+ Arrays.toString(twoSum(a,6)));
	}
	
public static int[] twoSum(int[] nums, int target) {
    int[] a = new int[2];
    for(int i = 0; i < nums.length; i++){
        for(int j = i+1; j < nums.length; j++){
            if((nums[i] + nums[j]) == target){
                a[0] = i;
                a[1] = j;
            }
        }
        if(a[0] == -1)
            break;
    }
        return a;
    }
}
