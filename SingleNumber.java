/*
 * 	Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1
Example 2:

Input: [4,1,2,1,2]
Output: 4
 * */
public class SingleNumber  {
    public static void main(String[] args) {
        int[] a = {2,2,1};
        System.out.println(singleNumber(a));
    }
    public static int singleNumber(int[] nums) {
        int req = 0;
        if(nums.length > 0){
            for(int index = 0; index < nums.length; index++){
                int count = 0;
                for(int i = 0; i < nums.length; i++){
                    if(nums[index] == nums[i])
                        count = count + 1;
                    if(count == 2)
                        break;
                }
                if(count == 1)
                    req = nums[index];
            }

        }
        return req;

    }
}




