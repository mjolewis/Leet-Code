import java.util.Arrays;

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 *
 * Note:
 *
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements
 * from nums2.
 * Example:
 *
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * Output: [1,2,2,3,5,6]
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int sortedNum;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] > nums2[j]) {
                    sortedNum = nums1[i];
                    nums1[i] = nums2[j];
                    nums2[j] = sortedNum;
                }
            }
        }
        for (int k = 0; k < nums2.length; k++) {
            for (int l = 0; l < nums2.length; l++) {
                if (nums2[k] < nums2[l]) {
                    sortedNum = nums2[k];
                    nums2[k] = nums2[l];
                    nums2[l] = sortedNum;
                }
            }
        }

        for (int z = 0; z < nums2.length; z++) {
            nums1[m] += nums2[z];
            m++;
        }
    }

    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] one = new int[] {1,2,3,0,0,0};
        int val1 = 3;
        int[] two = new int[] {2,5,6};
        int val2 = 3;
        int[] target = new int[]{1,2,2,3,5,6};
        mergeSortedArray.merge(one, val1, two, val2);
    }
}
