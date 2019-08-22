import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void solutionTest() {
        Solution solution1 = new Solution();
        Solution solution2 = new Solution();
        Solution solution3 = new Solution();
        Solution solution4 = new Solution();
        Solution solution5 = new Solution();

        assertEquals(3, solution1.rob(new int[] {2,3,2}));
        assertEquals(4, solution2.rob(new int[] {1,2,3,1}));
        assertEquals(12, solution3.rob(new int[] {2,3,2,4,8,3}));
        assertEquals(78, solution4.rob(new int[] {12, 15, 17, 0, 30, 32, 18, 29}));
        assertEquals(3, solution5.rob(new int[] {1,1,1,2}));
    }
}
