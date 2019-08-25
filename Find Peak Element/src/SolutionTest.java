import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void solutionTest() {
        Solution solution1 = new Solution();
        Solution solution2 = new Solution();

        assertEquals(2, solution1.findPeakElement(new int[] {1,2,3,1}));
        assertEquals(5, solution1.findPeakElement(new int[] {1,2,1,3,5,6,4}));
    }
}
