/*
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

Example 1:

Input: [3,0,1]
Output: 2
Example 2:

Input: [9,6,4,2,3,5,7,0,1]
Output: 8
 * 
 * */

import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {
        int[] a = {1};
        System.out.println(missingNumber(a));
    }

    public static int missingNumber(int[] nums) {
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0)
                a.add(nums[i]);
        }
        Collections.sort(a);
        int req = 0;
        for(int j = 0; j <= a.size(); j++){
            req = j;
            if(!a.contains(j))
                break;
        }
        return req;
    }

}





