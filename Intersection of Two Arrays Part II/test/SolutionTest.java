import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void solutionTest() {
        Solution solution = new Solution();
        int[] result = new int[] {2,2};

        assertEquals(result.toString(), solution.intersect(new int[] {1,2,2,1}, new int[] {2,2}));
    }
}