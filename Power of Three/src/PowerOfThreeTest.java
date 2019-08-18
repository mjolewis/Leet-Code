import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PowerOfThreeTest {
    @Test
    public void powerOfThreeTest() {
        PowerOfThree powerOfThree1 = new PowerOfThree();
        PowerOfThree powerOfThree2 = new PowerOfThree();
        PowerOfThree powerOfThree3 = new PowerOfThree();
        PowerOfThree powerOfThree4 = new PowerOfThree();
        PowerOfThree powerOfThree5 = new PowerOfThree();
        PowerOfThree powerOfThree6 = new PowerOfThree();

        assertEquals(false, powerOfThree1.isPowerOfThree(0));
        assertEquals(true, powerOfThree2.isPowerOfThree(1));
        assertEquals(true, powerOfThree3.isPowerOfThree(9));
        assertEquals(true, powerOfThree4.isPowerOfThree(27));
        assertEquals(false, powerOfThree5.isPowerOfThree(12));
        assertEquals(true, powerOfThree6.isPowerOfThree(81));
    }
}
