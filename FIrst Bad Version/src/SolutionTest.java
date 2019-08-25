import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void solutionTest() {
        Solution solution1 = new Solution();
        Solution solution2 = new Solution();
        Solution solution3 = new Solution();

        assertEquals(false, solution1.firstBadVersion(3));
        assertEquals(true, solution2.firstBadVersion(5));
        assertEquals(true, solution3.firstBadVersion(4));
    }
}
