/*
Author: Michael Lewis
Date: 9/9/2019
 */

import java.util.*;

/**
 * Given two arrays, write a function to compute their intersection.
 *
 * Example 1:
 *
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 * Example 2:
 *
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4]
 * Note:
 *
 * Each element in the result must be unique.
 * The result can be in any order.
 */
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (Integer num : nums1) set1.add(num);
        for (Integer num : nums2) set2.add(num);

        set1.retainAll(set2); // Retains only the intersection of the two sets

        int[] output = new int[set1.size()];

        int index = 0;
        for (int i : set1) output[index++] = i;

        return output;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.intersection(new int[] {1,2,2,1}, new int[] {2,2});
    }
}
