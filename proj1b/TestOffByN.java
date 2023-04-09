import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestOffByN {

  @Test
  public void equalChars() {
    OffByN OffBy5 = new OffByN(5);
    assertTrue(OffBy5.equalChars('a', 'f'));
    assertFalse(OffBy5.equalChars('f', 'h'));
    OffByN OffBy6 = new OffByN(6);
    assertTrue(OffBy6.equalChars('a', 'g'));
  }
}
