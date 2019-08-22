/**
 * The Tribonacci sequence Tn is defined as follows:
 *
 * T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
 *
 * Given n, return the value of Tn.
 *
 *
 *
 * Example 1:
 *
 * Input: n = 4
 * Output: 4
 * Explanation:
 * T_3 = 0 + 1 + 1 = 2
 * T_4 = 1 + 1 + 2 = 4
 * Example 2:
 *
 * Input: n = 25
 * Output: 1389537
 */
public class Solution {
    public int tribonacci(int n) {
        //TODO: Implement dynamic programming
        if (n == 0) return 0;
        if (n <= 2) return 1;
        int dp0 = 0;
        int dp1 = 1;
        int dp2 = 1;
        int currentValue = 0;

        for (int i = 3; i <= n; i++) {
            currentValue = dp0 + dp1 + dp2;
            dp0 = dp1;
            dp1 = dp2;
            dp2 = currentValue;
        }
        return currentValue;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.tribonacci(4);
    }
}
