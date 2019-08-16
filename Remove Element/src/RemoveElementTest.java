import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveElementTest {

    @Test
    public void removeElementTest() {
        RemoveElement removeElement1 = new RemoveElement();
        RemoveElement removeElement2 = new RemoveElement();
        RemoveElement removeElement3 = new RemoveElement();

        assertEquals(2, removeElement1.removeElement(new int[] {1, 2, 2, 1}, 1));
        assertEquals(2, removeElement2.removeElement(new int[] {3,2,2,3}, 3));
        assertEquals(5, removeElement3.removeElement(new int[] {0,1,2,2,3,0,4,2}, 2));
    }
}
