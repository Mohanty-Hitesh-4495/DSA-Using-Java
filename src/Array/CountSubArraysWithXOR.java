package Array;

import java.util.HashMap;

public class CountSubArraysWithXOR {
    public static void main(String[] args) {
        int[] a = {4, 2, 2, 6, 4};
        int k = 6;
        int ans = solution(a, k);
        System.out.println("The number of subarrays with XOR k is: " + ans);
    }

    private static int solution(int[] nums, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int xor = 0;
        int count =0;
        map.put(xor,1);

        for(int i=0; i<n; i++){
            xor ^= nums[i];
            int x = xor ^ k;
            if(map.containsKey(x)){
                count += map.get(x);
            }
            if(map.containsKey(xor)){
                map.put(xor,map.get(xor)+1);
            } else {
                map.put(xor,1);
            }
        }
        return count;
    }
}
