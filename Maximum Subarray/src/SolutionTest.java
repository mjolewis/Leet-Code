import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void solutionTest() {

        Solution solution1 = new Solution();
        //Solution solution2 = new Solution();

        assertEquals(6, solution1.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
    }
}
