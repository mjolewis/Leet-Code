import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void solutionTest() {
        Solution solution1 = new Solution();

        assertEquals(new int[] {1,2}, solution1.twoSum(new int[] {2,7,11,15}, 9));
    }
}
