import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaxProfitTest {
    @Test
    public void maxProfitTest() {
        MaxProfit maxProfit1 = new MaxProfit();
        MaxProfit maxProfit2 = new MaxProfit();
        MaxProfit maxProfit3 = new MaxProfit();

        assertEquals(5, maxProfit1.maxProfit(new int[] {7,1,5,3,6,4}));
        assertEquals(0, maxProfit2.maxProfit(new int[] {7,6,4,3,1}));
        assertEquals(1, maxProfit3.maxProfit(new int[] {1,2}));
    }

}
