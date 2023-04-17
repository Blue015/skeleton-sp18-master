import static org.junit.Assert.*;
import org.junit.Test;
public class FlikTest {
    @Test
    public void testisSameNumber() {
        assertTrue(Flik.isSameNumber(129, 129));
        assertTrue(Flik.isSameNumber(459, 459));
    }
}
