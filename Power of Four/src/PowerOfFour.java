/**
 * Given an integer (signed 32 bits), write a function to check whether it is a power of 4.
 *
 * Example 1:
 *
 * Input: 16
 * Output: true
 * Example 2:
 *
 * Input: 5
 * Output: false
 */
public class PowerOfFour {
    public boolean isPowerOfFour(int num) {
        if (num == 0) return false;
        while (num % 4 == 0 ) num /= 4;
        return num == 1;
    }

    public static void main (String[] args) {
        PowerOfFour powerOfFour = new PowerOfFour();
        System.out.println(powerOfFour.isPowerOfFour(16));
    }
}
