/*
Author: Michael Lewis
Date: 9/10/19
 */

import java.util.*;

/**
 *
 Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such
 * that nums[i] = nums[j] and the absolute difference between i and j is at most k.
 *
 * Example 1:
 * Input: nums = [1,2,3,1], k = 3
 * Output: true
 *
 * Example 2:
 * Input: nums = [1,0,1,1], k = 1
 * Output: true
 *
 * Example 3:
 * Input: nums = [1,2,3,1,2,3], k = 2
 * Output: false
 */
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int difference = i - map.get(nums[i]);
                if (difference <= k) return true;
                map.put(nums[i], i);
            } else {
                map.put(nums[i], i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.containsNearbyDuplicate(new int[] {1,2,3,1,2,3}, 2);
    }
}
