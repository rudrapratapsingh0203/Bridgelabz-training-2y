public class PatchingArray {
    public static void main(String[] args) {
        PatchingArray obj = new PatchingArray();
        int[] nums = {1, 3};
        int n = 6;
        int patches = obj.minPatches(nums, n);
        System.out.println("Minimum patches required: " + patches);
    }

public int minPatches(int[] nums, int n) {
        long sum = 0;
        int patches = 0;
        int i = 0;
        while (sum < n) {
            if (i < nums.length && nums[i] <= sum + 1) {
                sum += nums[i];
                i++;
            } else {
                sum += sum + 1;
                patches++;
            }
        }
        return patches;
    }
}