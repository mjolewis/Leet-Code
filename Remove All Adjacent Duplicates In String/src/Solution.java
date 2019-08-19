import java.util.*;

/**
 * Given a string S of lowercase letters, a duplicate removal consists of choosing two adjacent and equal letters,
 * and removing them.
 *
 * We repeatedly make duplicate removals on S until we no longer can.
 *
 * Return the final string after all such duplicate removals have been made.  It is guaranteed the answer is unique.
 *
 *
 *
 * Example 1:
 *
 * Input: "abbaca"
 * Output: "ca"
 * Explanation:
 * For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible
 * move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is
 * "ca".
 *
 *
 * Note:
 *
 * 1 <= S.length <= 20000
 * S consists only of English lowercase letters.
 */
public class Solution {
    public String removeDuplicates(String S) {
        ArrayList<Character> temp = new ArrayList<>();
        for (int i = 0; i < S.length(); i++) {
            temp.add(S.charAt(i));
        }

        int i = 0;
        while (i < temp.size() - 1) {
            if (temp.get(i) == temp.get(i + 1)) {
                temp.remove(i);
                temp.remove(i);
                i = 0;
            } else i++;
        }
        StringBuilder sb = new StringBuilder();
        for (Character j : temp) {
            sb.append(j);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicates("abbaca"));
    }
}
