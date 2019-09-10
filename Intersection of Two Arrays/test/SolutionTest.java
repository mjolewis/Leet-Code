import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void solutionTest() {
        Solution solution = new Solution();
        int[] nums1 = new int[] {1,2,2,1};
        int[] nums2 = new int[] {2,2};

        assertEquals(new int[] {2}, solution.intersection(nums1, nums2));
    }
}