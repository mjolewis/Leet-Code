import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void solutionTest() {
        Solution solution1 = new Solution();
        Solution solution2 = new Solution();
        Solution solution3 = new Solution();

        int[] result1 = solution1.sortedSquares(new int[] {-4, -1, 0, 3, 10});
        int[] result2 = solution1.sortedSquares(new int[] {-7,-3,2,3,11});

        assertEquals("[0, 1, 9, 16, 100]", Arrays.toString(result1));
        assertEquals("[4, 9, 9, 49, 121]", Arrays.toString(result2));
    }
}
