import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleNumberTest {

    @Test
    public void singleNumberTest() {
        SingleNumber singleNumber1 = new SingleNumber();
        SingleNumber singleNumber2 = new SingleNumber();
        SingleNumber singleNumber3 = new SingleNumber();

        //assertEquals(2, singleNumber1.singleNumber(new int[] {3, 2, 3}));
        //assertEquals(1, singleNumber2.singleNumber(new int[] {2, 2, 1}));
        assertEquals(4, singleNumber3.singleNumber(new int[] {4, 1, 2, 1, 2}));
    }
}
