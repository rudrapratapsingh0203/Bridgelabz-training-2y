public class Remove_Elements {
    public static void main(String[] args) {
        Remove_Elements obj = new Remove_Elements();
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int newLength = obj.removeElement(nums, val);
        System.out.println("New length: " + newLength);
        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
