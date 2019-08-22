import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void solutionTest() {
        Solution solution1 = new Solution();
        Solution solution2 = new Solution();
        Solution solution3 = new Solution();

        assertTrue(solution1.isPerfectSquare(16));
        assertTrue(solution2.isPerfectSquare(100));
        assertFalse(solution3.isPerfectSquare(14));
    }
}
