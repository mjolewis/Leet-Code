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
        Solution solution6 = new Solution();
        Solution solution7 = new Solution();
        Solution solution8 = new Solution();
        Solution solution9 = new Solution();

        assertEquals(1, solution1.fib(1));
        assertEquals(1, solution2.fib(2));
        assertEquals(2, solution3.fib(3));
        assertEquals(3, solution4.fib(4));
        assertEquals(5, solution5.fib(5));
        assertEquals(8, solution6.fib(6));
        assertEquals(13, solution7.fib(7));
        assertEquals(21, solution8.fib(8));
        assertEquals(1346269, solution9.fib(31));
    }
}
