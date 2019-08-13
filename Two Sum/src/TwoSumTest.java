import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Testing TwoSum
 */
public class TwoSumTest {

    @Test
    public void testTwoSum() {
        TwoSum twoSum = new TwoSum();
        int[] expected = new int[] {0, 1};
        assertEquals(expected, twoSum.twoSum(new int[] {2, 7, 11, 15}, 9));
    }
}
