/**
 * We are playing the Guess Game. The game is as follows:
 *
 * I pick a number from 1 to n. You have to guess which number I picked.
 *
 * Every time you guess wrong, I'll tell you whether the number is higher or lower.
 *
 * You call a pre-defined API guess(int num) which returns 3 possible results (-1, 1, or 0):
 *
 * -1 : My number is lower
 *  1 : My number is higher
 *  0 : Congrats! You got it!
 * Example :
 *
 * Input: n = 10, pick = 6
 * Output: 6
 */
public class Solution {
    public int guessNumber(int n) {
        int start = 1;
        int end = n;
        int mid = 0;

        while(start <= end) {
            mid = (start + end) / 2;
            if (guess(mid) == -1) end = mid - 1;
            if (guess(mid) == 0) return mid;
            if (guess(mid) == 1) start = mid + 1;
        }
        return mid;
    }

    public int guess(int num) {
        (int) ((Math.random() * num) + 1);
    }

    public static void main(String[] args) {
        Solution solution1 = new Solution();
        solution1.guessNumber(15);
    }
}
