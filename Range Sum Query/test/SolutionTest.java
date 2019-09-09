import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void solutionTest() {
        int[] nums = new int[] {-2, 0, 3, -5, 2, -1};
        NumArray obj = new NumArray();
        obj.NumArray(nums);
        int param_1 = obj.sumRange(0, 2);

        assertEquals(1, obj.sumRange(0, 2));
    }
}