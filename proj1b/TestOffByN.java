import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestOffByN {

    @Test
    public void testOffBy5() {
        OffByN offBy5 = new OffByN(5);
        assertTrue(offBy5.equalChars('a', 'f'));
        assertFalse(offBy5.equalChars('F', 'h'));
        OffByN offBy6 = new OffByN(6);
        assertTrue(offBy6.equalChars('a', 'g'));
    }

    @Test
    public void testOffBy4() {
        OffByN offBy4 = new OffByN(4);
        assertFalse(offBy4.equalChars('a', 'g'));
        assertFalse(offBy4.equalChars('%', '&'));
    }

    @Test
    public void testOffBy3() {
        OffByN offBy3 = new OffByN(3);
        assertFalse(offBy3.equalChars('f', 'b'));
        assertFalse(offBy3.equalChars('a', 'c'));
    }
}
