/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range:
 * [−2^31,  2^31 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer
 * overflows.
 */
public class ReverseInteger {
    public int reverse(int x) {
        double reversedNum = 0;
        while (x != 0) {
            int digit = x % 10;
            reversedNum = reversedNum * 10 + digit;
            x /= 10;
        }

        if (reversedNum < (int) -(Math.pow(2, 31)) || reversedNum >= (int) (Math.pow(2, 31) - 1)) {
            return 0;
        }
        return (int) reversedNum;
    }

    public static void main(String[] args) {
        ReverseInteger reverseInteger1 = new ReverseInteger();
        ReverseInteger reverseInteger2 = new ReverseInteger();
        ReverseInteger reverseInteger3 = new ReverseInteger();
//        System.out.println(reverseInteger1.reverse(-123));
//        System.out.println(reverseInteger2.reverse(-123));
//        System.out.println(reverseInteger3.reverse(992));
        System.out.println(reverseInteger3.reverse(1534236469));
    }
}
