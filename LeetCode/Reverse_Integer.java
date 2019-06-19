//  https://leetcode.com/problems/reverse-integer

public class Reverse_Integer {

    public static void main(String[] args) {

        System.out.println(reverse(-123));
        System.out.println(reverse(1534236469));

    }

    private static int reverse(int x) {
        if (x == 0) {
            return 0;
        }

        int res = 0;
        int sign = 1;

        if (x < 0) {
            sign = -1;
            x = sign * x;
        }

        while (x > 0) {
            int digit = x % 10;
            x = x / 10;
            if (res > Integer.MAX_VALUE / 10 || res == Integer.MAX_VALUE / 10 && digit > 7) {
                return 0;
            }
            if (res < Integer.MIN_VALUE / 10) {
                return 0;
            }
            res = res * 10 + digit;
        }
        return res * sign;
    }

}
