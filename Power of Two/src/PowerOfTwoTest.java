import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PowerOfTwoTest {
    @Test
    public void powerOfTwoTest() {
        PowerOfTwo powerOfTwo1 = new PowerOfTwo();
        PowerOfTwo powerOfTwo2 = new PowerOfTwo();
        PowerOfTwo powerOfTwo3 = new PowerOfTwo();
        PowerOfTwo powerOfTwo4 = new PowerOfTwo();

        assertEquals(true, powerOfTwo1.isPowerOfTwo(0));
        assertEquals(true, powerOfTwo2.isPowerOfTwo(4));
        assertEquals(false, powerOfTwo3.isPowerOfTwo(218));
        assertEquals(true, powerOfTwo3.isPowerOfTwo(1));

    }
}
