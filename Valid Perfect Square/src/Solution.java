/**
 * Given a positive integer num, write a function which returns True if num is a perfect square else False.
 *
 */
public class Solution {
    public boolean isPerfectSquare(int num) {
        return (num % Math.sqrt(num) == 0);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.isPerfectSquare(12);
    }
}
