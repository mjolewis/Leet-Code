import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void solutionTest() {
        Solution solution1 = new Solution();
        Solution solution2 = new Solution();
        Solution solution3 = new Solution();
        Solution solution4 = new Solution();

        assertEquals(1, solution1.peakIndexInMountainArray(new int[] {0,1,0}));
        assertEquals(1, solution2.peakIndexInMountainArray(new int[] {0,2,1,0}));
        assertEquals(3, solution3.peakIndexInMountainArray(new int[] {0,2,3,4,0}));
        assertEquals(6, solution4.peakIndexInMountainArray(new int[] {0, 0 ,0, 5, 6, 6, 7, 0}));
    }
}
