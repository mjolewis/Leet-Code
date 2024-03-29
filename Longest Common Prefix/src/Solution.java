/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 * Example 1:
 *
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * Note:
 *
 * All given inputs are in lowercase letters a-z.
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        String commonCharacters = "";
        int shortestWord = 0;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < shortestWord) { // Use the shortest word to ensure no out of bounds exceptions
                shortestWord = strs[i].length();
            }
        }

        for (int j = 0; j < shortestWord; j++) {
            if (strs[0][j] == strs[])
        }
    }
}
