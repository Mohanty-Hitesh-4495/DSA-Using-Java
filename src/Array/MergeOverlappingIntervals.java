package Array;
import java.util.*;

public class MergeOverlappingIntervals {
    public static void main(String[] args) {
        int[][] intervals = { {1, 3}, {2, 6}, {8, 10}, {15, 18} };
        List<int[]> merged = solution(intervals);

        System.out.println("Merged Intervals:");
        for (int[] interval : merged) {
            System.out.println(Arrays.toString(interval));
        }
    }

    private static List<int[]> solution(int[][] intervals) {
        int n = intervals.length;
        List<int[]> merged = new ArrayList<>();

        Arrays.sort(intervals,(a, b) -> a[0] - b[0]);

        for(int i=0; i<n; i++){
            if(merged.isEmpty() || intervals[i][0] > merged.get(merged.size()-1)[1]){
                merged.add(new int[] {intervals[i][0], intervals[i][1]});
            } else {
                merged.get(merged.size()-1)[1] = Math.max(merged.get(merged.size()-1)[1], intervals[i][1]);
            }
        }
        return merged;
    }

}
