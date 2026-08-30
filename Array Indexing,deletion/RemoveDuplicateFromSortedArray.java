public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        RemoveDuplicateFromSortedArray obj = new RemoveDuplicateFromSortedArray();
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        int newLength = obj.removeDuplicates(nums);
        System.out.println("New length: " + newLength);
        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
 