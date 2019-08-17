/**
 * Given an integer, write a function to determine if it is a power of two.
 *
 * Example 1:
 *
 * Input: 1
 * Output: true
 * Explanation: 20 = 1
 * Example 2:
 *
 * Input: 16
 * Output: true
 * Explanation: 24 = 16
 * Example 3:
 *
 * Input: 218
 * Output: false
 */
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n == 1 || n == 4) {
            return true;
        } else {
            return (n % 4 == 0);
        }
    }

    public static void main(String[] args) {
        PowerOfTwo powerOfTwo = new PowerOfTwo();
        System.out.println(powerOfTwo.isPowerOfTwo(4));
    }
}
