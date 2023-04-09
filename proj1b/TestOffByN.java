import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestOffByN {

    @Test
    public void testOffBy5() {
        OffByN OffBy5 = new OffByN(5);
        assertTrue(OffBy5.equalChars('a', 'f'));
        assertFalse(OffBy5.equalChars('F', 'h'));
        OffByN OffBy6 = new OffByN(6);
        assertTrue(OffBy6.equalChars('a', 'g'));
    }

    @Test
    public void testOffBy4() {
        OffByN OffBy4 = new OffByN(4);
        assertFalse(OffBy4.equalChars('a', 'g'));
        assertFalse(OffBy4.equalChars('%', '&'));
    }

    @Test
    public void testOffBy3() {
        OffByN OffBy3 = new OffByN(3);
        assertFalse(OffBy3.equalChars('f','b'));
        assertFalse(OffBy3.equalChars('a','c'));
    }
}
