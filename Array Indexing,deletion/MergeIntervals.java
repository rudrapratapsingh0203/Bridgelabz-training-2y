import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class MergeIntervals {
   public static void main(String[] args) {
        MergeIntervals obj = new MergeIntervals();
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] mergedIntervals = obj.merge(intervals);
        System.out.println("Merged Intervals: ");
        for (int[] interval : mergedIntervals) {
            System.out.print("[" + interval[0] + ", " + interval[1] + "] ");
        }
    }
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[0][];
        }        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> merged = new ArrayList<>();
        int[] currentInterval = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (currentInterval[1] >= intervals[i][0]) {
                               currentInterval[1] = Math.max(currentInterval[1], intervals[i][1]);
            } else {
                               merged.add(currentInterval);
                currentInterval = intervals[i];
            }
        }
                merged.add(currentInterval);
        return merged.toArray(new int[merged.size()][]);
    } 
}
