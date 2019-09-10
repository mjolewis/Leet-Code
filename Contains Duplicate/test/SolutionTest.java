import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void solutionTest() {
        Solution solution = new Solution();

        assertTrue(solution.containsDuplicate(new int[] {1,2,3,1}));
        assertFalse(solution.containsDuplicate(new int[] {1,2,3,4}));
        assertTrue(solution.containsDuplicate(new int[] {1,1,1,3,3,4,3,2,4,2}));
    }
}