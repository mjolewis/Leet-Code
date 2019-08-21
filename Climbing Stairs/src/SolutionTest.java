import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void solutionTest() {
        Solution solution1 = new Solution();
        Solution solution2 = new Solution();
        Solution solution3 = new Solution();

        assertEquals(2, solution1.climbStairs(2));
        assertEquals(3, solution2.climbStairs(3));
        assertEquals(12, solution3.climbStairs(9));
    }
}
