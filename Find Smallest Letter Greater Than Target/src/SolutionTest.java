import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void solutionsTest() {
        Solution solution1 = new Solution();
        Solution solution2 = new Solution();
        Solution solution3 = new Solution();

        assertEquals('c', solution1.nextGreatestLetter(new char[] {'c', 'f', 'j'}, 'a'));
        assertEquals('f', solution2.nextGreatestLetter(new char[] {'c', 'f', 'j'}, 'c'));
        assertEquals('f', solution3.nextGreatestLetter(new char[] {'c', 'f', 'j'}, 'd'));
    }

}
