import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void solutionTest() {
        Solution solution1 = new Solution();
        Solution solution2 = new Solution();
        Solution solution3 = new Solution();

        assertEquals(4, solution1.search(new int[] {-1,0,3,5,9,12}, 9));
        assertEquals(-1, solution2.search(new int[] {-1,0,3,5,9,12}, 2));
        assertEquals(2, solution3.search(new int[] {-1,0,77,100,909,1200}, 77));
    }
}
