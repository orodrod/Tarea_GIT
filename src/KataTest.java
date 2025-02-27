import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class KataTest {
    @Test

    public void BasicTests() {

        assertEquals(16, Kata.sum(new int[] { 6, 2, 1, 8, 10}));
        assertEquals(-5, Kata.sum(new int[] { 6, -2, 1, 8, -10, -10}));
        assertEquals(0, Kata.sum(new int[] {10}));

    }

}
