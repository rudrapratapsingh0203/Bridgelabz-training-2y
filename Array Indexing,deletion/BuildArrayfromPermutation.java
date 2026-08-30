public class BuildArrayfromPermutation {
    public static void main(String[] args) {
        BuildArrayfromPermutation obj = new BuildArrayfromPermutation();
        int[] nums = {0, 2, 1, 5, 3, 4};
        int[] result = obj.buildArray(nums);
        System.out.println("Resulting Array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = nums[nums[i]];
        }
        return result;
    }
}
