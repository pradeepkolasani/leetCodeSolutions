/*
 * Given an unsorted integer array, find the smallest missing positive integer.

Example 1:

Input: [1,2,0]
Output: 3
Example 2:

Input: [3,4,-1,1]
Output: 2
Example 3:

Input: [7,8,9,11,12]
Output: 1
 * */

import java.util.*;


public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] a = {1,2,2,1,3,1,0,4,0};
        System.out.println(firstMissingPositive(a));
    }

    public static int firstMissingPositive(int[] nums) {
        if (nums.length > 0) {
            List<Integer> a = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] >= 0)
                    a.add(nums[i]);

            }
            Collections.sort(a);
            List<Integer> b = removeDuplicates(a);
            if(b.size() == 0)
                return 1;
            int g = b.get(0);
            if (g > 1) {
                g = 1;
            } else {
                for (int j = 1; j < b.size(); j++) {
                    g = g + 1;
                    if (g == b.get(j))
                        continue;
                    else
                        break;
                }

                if (g == b.get(b.size() - 1))
                    g = g + 1;
            }
            return g;

        } else
            return 1;


    }

    private static List<Integer> removeDuplicates(List<Integer> a) {
        List<Integer> c = new ArrayList<>();
        for(int j = 0 ; j < a.size(); j++){
            if(!c.contains(a.get(j)))
                c.add(a.get(j));
        }
        return c;
    }
}





