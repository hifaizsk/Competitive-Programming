import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        System.out.print(Arrays.toString(plusOne(new int[]{-1, -2, -3, -4, -5})));

    }

    private static int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = (digits[i] + carry) % 10;
            carry = (digits[i] + carry) / 10;
            digits[i] = sum;
            if (carry == 0) {
                return digits;
            }

        }

        int prev = carry;
        for (int i = 0; i < digits.length; i++) {
            int temp = prev;
            prev = digits[i];
            digits[i] = temp;
        }

        digits = Arrays.copyOf(digits, digits.length + 1);
        digits[digits.length - 1] = prev;
        return digits;
    }
}
