import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void solutionTest() {
        Solution solution1 = new Solution();
        Solution solution2 = new Solution();

        assertEquals(3, solution1.majorityElement(new int[] {3, 2, 3}));
        assertEquals(2, solution1.majorityElement(new int[] {2,2,1,1,1,2,2}));
    }
}
