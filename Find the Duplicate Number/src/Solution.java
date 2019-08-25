import java.util.Arrays;

/**
 * Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least
 * one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.
 *
 * Example 1:
 *
 * Input: [1,3,4,2,2]
 * Output: 2
 * Example 2:
 *
 * Input: [3,1,3,4,2]
 * Output: 3
 * Note:
 *
 * You must not modify the array (assume the array is read only).
 * You must use only constant, O(1) extra space.
 * Your runtime complexity should be less than O(n2).
 * There is only one duplicate number in the array, but it could be repeated more than once.
 */
public class Solution {
    public int findDuplicate(int[] nums) {
        if (nums.length == 0) return 0;

        int[] sortedArray = new int[nums.length];
        System.arraycopy(nums,0, sortedArray, 0, nums.length);
        Arrays.sort(sortedArray);
        int start = 0;
        int mid;
        int end = nums.length - 1;

        while (start < end) {
            mid = start + (end - start) / 2;
            if (sortedArray[mid] == sortedArray[mid + 1]) {
                return sortedArray[mid];
            } else if (sortedArray[mid] > sortedArray[mid - 1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return sortedArray[start];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.findDuplicate(new int[] {1,3,4,2,2});
    }
}
