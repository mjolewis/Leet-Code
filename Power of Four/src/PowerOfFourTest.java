import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PowerOfFourTest {
    @Test
    public void powerOfFourTest() {
        PowerOfFour powerOfFour1 = new PowerOfFour();
        PowerOfFour powerOfFour2 = new PowerOfFour();
        PowerOfFour powerOfFour3 = new PowerOfFour();
        PowerOfFour powerOfFour4 = new PowerOfFour();
        PowerOfFour powerOfFour5 = new PowerOfFour();
        PowerOfFour powerOfFour6 = new PowerOfFour();
        PowerOfFour powerOfFour7 = new PowerOfFour();

        assertEquals(false, powerOfFour1.isPowerOfFour(0));
        assertEquals(true, powerOfFour2.isPowerOfFour(4));
        assertEquals(false, powerOfFour3.isPowerOfFour(5));
        assertEquals(true, powerOfFour4.isPowerOfFour(16));
        assertEquals(false, powerOfFour5.isPowerOfFour(32));
        assertEquals(true, powerOfFour6.isPowerOfFour(64));
        assertEquals(false, powerOfFour7.isPowerOfFour(128));

    }
}
