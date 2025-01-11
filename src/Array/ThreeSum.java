package Array;
import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        System.out.println("3Sum problem solution for arr:" + Arrays.toString(arr));
        System.out.println("Better Solution:" + Better(arr));
        System.out.println("Optimal Solution:" + Optimal(arr).toString());
    }

    public static List<List<Integer>> Better(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            Set<Integer> hashset = new HashSet<>();
            for(int j=i+1; j<n; j++){
                int third = -(nums[i]+nums[j]);

                if(hashset.contains(third)){
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], third);
                    temp.sort(null);
                    set.add(temp);
                }
                hashset.add(nums[j]);
            }
        }
        return new ArrayList<>(set);
        }

    public static List<List<Integer>> Optimal(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0; i<n; i++){
            if(i!=0 && nums[i] == nums[i-1]) continue;
            int j = i+1;
            int k = n-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum > 0){
                    k--;
                } else if(sum < 0){
                    j++;
                } else{
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while(j<k && nums[j] == nums[j-1]) j++;
                    while(j<k && nums[k] == nums[k+1]) k--;
                }
            }
        }
        return ans;
    }
}