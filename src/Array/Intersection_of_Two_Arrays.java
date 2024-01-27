package Array;
import java.util.Arrays;
import java.util.HashSet;

// 349. Intersection of Two Arrays
// https://leetcode.com/problems/intersection-of-two-arrays/description/
/*
    Example 1:
        Input: nums1 = [1,2,2,1], nums2 = [2,2]
        Output: [2]
    Example 2:
        Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
        Output: [9,4]
        Explanation: [4,9] is also accepted.
 */

public class Intersection_of_Two_Arrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] result = intersection(nums1,nums2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> list1 = new HashSet<>();
        HashSet <Integer> list2 = new HashSet<>();

        for(int value : nums1)
            list1.add(value);

        for(int value : nums2)
            if(list1.contains(value))
                list2.add(value);

        int[] ans = new int[list2.size()];
        int i = 0;
        for(int value : list2){
            ans[i] = value;
            i++;
        }

        return ans;
    }
}
