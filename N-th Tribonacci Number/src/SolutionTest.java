import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void solutionTest() {
        Solution solution1 = new Solution();
        Solution solution2 = new Solution();

        assertEquals(4, solution1.tribonacci(4));
        assertEquals(1389537, solution2.tribonacci(25));
    }
}
