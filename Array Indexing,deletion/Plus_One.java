//LC_Plus One
public class Plus_One {
    public static void main(String[] args) {
        Plus_One obj = new Plus_One();
        int[] digits = {9, 9, 9};
        int[] result = obj.plusOne(digits);
        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
    }
}