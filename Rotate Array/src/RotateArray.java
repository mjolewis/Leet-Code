import java.util.Arrays;

/**
 *
 Example 1:

 Input: [1,2,3,4,5,6,7] and k = 3
 Output: [5,6,7,1,2,3,4]
 Explanation:
 rotate 1 steps to the right: [7,1,2,3,4,5,6]
 rotate 2 steps to the right: [6,7,1,2,3,4,5]
 rotate 3 steps to the right: [5,6,7,1,2,3,4]
 Example 2:

 Input: [-1,-100,3,99] and k = 2
 Output: [3,99,-1,-100]
 Explanation:
 rotate 1 steps to the right: [99,-1,-100,3]
 rotate 2 steps to the right: [3,99,-1,-100]
 */
public class RotateArray {
    public void rotate(int[] nums, int k) {
        int temp;

        for (int i = 0; i < k; i++) {
            temp = nums[i];
            nums[i] = nums[nums.length - k + i];
            nums[nums.length - k + i] = temp;
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] nums) {
        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(new int[] {1,2,3,4,5,6,7}, 3);
    }
}
