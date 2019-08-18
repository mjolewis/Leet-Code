import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PowerOfTwoTest {
    @Test
    public void powerOfTwoTest() {
        PowerOfTwo powerOfTwo1 = new PowerOfTwo();
        PowerOfTwo powerOfTwo2 = new PowerOfTwo();
        PowerOfTwo powerOfTwo3 = new PowerOfTwo();
        PowerOfTwo powerOfTwo4 = new PowerOfTwo();
        PowerOfTwo powerOfTwo5 = new PowerOfTwo();
        PowerOfTwo powerOfTwo6 = new PowerOfTwo();
        PowerOfTwo powerOfTwo7 = new PowerOfTwo();
        PowerOfTwo powerOfTwo8 = new PowerOfTwo();
        PowerOfTwo powerOfTwo9 = new PowerOfTwo();

        //assertEquals(false, powerOfTwo1.isPowerOfTwo(0));
        assertEquals(true, powerOfTwo2.isPowerOfTwo(1));
        assertEquals(true, powerOfTwo3.isPowerOfTwo(2));
        assertEquals(true, powerOfTwo4.isPowerOfTwo(4));
        assertEquals(true, powerOfTwo5.isPowerOfTwo(8));
        assertEquals(true, powerOfTwo6.isPowerOfTwo(16));
        assertEquals(true, powerOfTwo7.isPowerOfTwo(32));
        assertEquals(true, powerOfTwo8.isPowerOfTwo(64));
        assertEquals(true, powerOfTwo9.isPowerOfTwo(536870912));

    }
}
