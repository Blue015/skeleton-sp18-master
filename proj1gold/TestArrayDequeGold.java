import static org.junit.Assert.*;

import org.junit.Test;

public class TestArrayDequeGold {
    private static Integer expected;
    private static Integer actual;

    @Test
    public void testAd() {
        StudentArrayDeque<Integer> tests = new StudentArrayDeque<>();
        ArrayDequeSolution<Integer> testa = new ArrayDequeSolution<>();
        for (int i = 0; i < 10; i += 1) {
            double numberBetweenZeroAndOne = StdRandom.uniform();

            if (numberBetweenZeroAndOne < 0.5) {
                tests.addLast(i);
                testa.addLast(i);
            } else {
                tests.addFirst(i);
                testa.addFirst(i);
            }
        }

        for (int i = 0; i < 10; i += 1) {
            double numberBetweenZeroAndOne = StdRandom.uniform();

            if (numberBetweenZeroAndOne < 0.5) {
                expected = tests.removeLast();
                actual = testa.removeLast();
            } else {
                expected = tests.removeFirst();
                actual = testa.removeFirst();
            }
            assertEquals(expected + " not equal to " + actual, expected, actual);
        }
    }
}
