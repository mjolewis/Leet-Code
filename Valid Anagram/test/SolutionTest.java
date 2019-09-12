import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void solutionTest() {
        Solution solution = new Solution();
        assertTrue(solution.isAnagram("anagram", "nagaram"));
        assertFalse(solution.isAnagram("rat", "car"));
        assertFalse(solution.isAnagram("a", "ab"));
        assertFalse(solution.isAnagram("ac", "bb"));
        assertFalse(solution.isAnagram("fe", "ja"));
    }
}