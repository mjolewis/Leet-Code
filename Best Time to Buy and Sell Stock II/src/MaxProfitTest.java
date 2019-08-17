import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaxProfitTest {
    @Test
    public void maxProfitTest() {
        MaxProfit maxProfit1 = new MaxProfit();
        MaxProfit maxProfit2 = new MaxProfit();
        MaxProfit maxProfit3 = new MaxProfit();
        MaxProfit maxProfit4 = new MaxProfit();
        MaxProfit maxProfit5 = new MaxProfit();

        assertEquals(7, maxProfit1.maxProfit(new int[] {7,1,5,3,6,4}));
        assertEquals(4, maxProfit2.maxProfit(new int[] {1,2,3,4,5}));
        assertEquals(0, maxProfit3.maxProfit(new int[] {7,6,4,3,1}));
        assertEquals(7, maxProfit4.maxProfit(new int[] {6,1,3,2,4,7}));
        assertEquals(14, maxProfit5.maxProfit(new int[] {10,1,1,1,12,15}));
    }
}
