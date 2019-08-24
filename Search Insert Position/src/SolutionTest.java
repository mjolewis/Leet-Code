import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class SolutionTest {
    @Test
    public void solutionTest() {
        Solution solution1 = new Solution();
        Solution solution2 = new Solution();
        Solution solution3 = new Solution();
        Solution solution4 = new Solution();

        assertEquals(2, solution1.searchInsert(new int[] {1,3,5,6}, 5));
        assertEquals(1, solution2.searchInsert(new int[] {1,3,5,6}, 2));
        assertEquals(4, solution3.searchInsert(new int[] {1,3,5,6}, 7));
        assertEquals(0, solution4.searchInsert(new int[] {1,3,5,6}, 0));
    }
}
