import java.util.*;

/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 *
 * Note:
 *
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Example 1:
 *
 * Input: [2,2,1]
 * Output: 1
 * Example 2:
 *
 * Input: [4,1,2,1,2]
 * Output: 4
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        HashSet<Integer> result = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (result.contains(nums[i])) {
                result.remove(nums[i]);
            } else {
                result.add(nums[i]);
            }
        }
        Iterator iterator = result.iterator();
        while (iterator.hasNext()) {
            return (int) iterator.next();
        }
        return 0;
    }

    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        int result = singleNumber.singleNumber(new int[] {3, 2, 3});
        System.out.println(result);
    }
}