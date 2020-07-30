import java.util.*;
public class RunningArraySum
{
	public static void main(String[] args) {
	    int[] a = {3,4,6,7};	    // example array
	    System.out.println("Running Array Sum"+ Arrays.toString(runningSum(a)));
	}
	
	private static int[] runningSum(int[] nums){
	    int[] b = new int[nums.length];
	    for(int i = 0; i < nums.length; i++){
	        int value = 0;
	        for(int j = 0; j <= i; j++){
	            value = value + nums[j];
	        }
	        b[i] = value;
	    }
	    return b;
	}
}
