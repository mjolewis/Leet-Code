/*
Author: Michael Lewis
Date: 9/10/19
 */

import java.util.*;

/**
 * Given two arrays, write a function to compute their intersection.
 *
 * Example 1:
 *
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2,2]
 * Example 2:
 *
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [4,9]
 * Note:
 *
 * Each element in the result should appear as many times as it shows in both arrays.
 * The result can be in any order.
 * Follow up:
 *
 * What if the given array is already sorted? How would you optimize your algorithm?
 * What if nums1's size is small compared to nums2's size? Which algorithm is better?
 * What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into
 * the memory at once?
 */
public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();

        for (Integer num : nums1) map1.put(num, map1.getOrDefault(num, 0) + 1);
        for (Integer num : nums2) map2.put(num, map2.getOrDefault(num, 0) + 1);

        int size = Math.max(nums1.length, nums2.length);
        List<Integer> result = new ArrayList<>(size);

        // If the number is in both num1 and num2, then find how many times we should return the number and store it
        // in the result array
        for (int i = 0; i < nums1.length; i++) {
            int item = nums1[i];
            if (map2.containsKey(item)) {
                int frequency1 = map1.get(item);
                int frequency2 = map2.get(item);

                // The result should contain the fewest occurrences of the intersected number
                for (int j = 0; j < Math.min(frequency1, frequency2); j++) {
                    result.add(item);
                }
            }
            map2.remove(item);
        }

        int[] intersection = new int[result.size()];
        int index = 0;
        for (Integer num : result) intersection[index++] = num;

        return intersection;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.intersect(new int[] {1,2,2,1}, new int[] {2,2});
    }
}
