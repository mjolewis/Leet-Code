import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void solutionTest() {
        Solution solution = new Solution();

        assertTrue(solution.containsNearbyDuplicate(new int[] {1,2,3,1}, 3));
        assertTrue(solution.containsNearbyDuplicate(new int[] {1,0,1,1}, 1));
        assertFalse(solution.containsNearbyDuplicate(new int[] {1,2,3,1,2,3}, 2));
    }
}