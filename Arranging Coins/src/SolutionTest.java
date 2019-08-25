import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class SolutionTest {
    @Test
    public void solutionTest() {
        Solution solution1 = new Solution();
        Solution solution2 = new Solution();

        assertEquals(2, solution1.arrangeCoins(5));
        assertEquals(3, solution2.arrangeCoins(8));
    }
}
