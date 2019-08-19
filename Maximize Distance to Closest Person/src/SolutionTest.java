import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void solutionTest() {
        Solution solution1 = new Solution();
        Solution solution2 = new Solution();
        Solution solution3 = new Solution();

        assertEquals(2, solution1.maxDistanceToClosest(new int[] {1,0,0,0,1,0,1}));
        assertEquals(3, solution1.maxDistanceToClosest(new int[] {1,0,0,0}));
    }
}
