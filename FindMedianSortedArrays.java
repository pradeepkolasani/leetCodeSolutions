import java.util.Arrays;

public class FindMedianSortedArrays {
    public static void main(String[] args) {
        int[] a = {1,2};
        int[] b = {3,4};
        System.out.println(findMedianSortedArrays(a,b));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] result = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, result, 0, nums1.length);
        System.arraycopy(nums2, 0, result, nums1.length, nums2.length);
        Arrays.sort(result);
        int a = result.length;
        if(a%2 == 0){                     
            return ((result[(a/2)-1]+result[(a/2)])/2.0);
        }else{ 
            return result[Math.round(a/2)];
        }

    }
}

