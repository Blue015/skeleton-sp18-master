import static org.junit.Assert.*;

import org.junit.Test;

public class TestArrayDequeGold {
    StudentArrayDeque<Integer> sad = new StudentArrayDeque<>();
    ArrayDequeSolution<Integer> ads = new ArrayDequeSolution<>();
    private static Integer expected;
    private static Integer actual;

    @Test
    public void testAd() {
        String message = "\n";

        while (true) {
            double numberBetweenZeroAndOne = StdRandom.uniform();
            Integer i = StdRandom.uniform(10);

            if (numberBetweenZeroAndOne < 0.25) {
                sad.addLast(i);
                ads.addLast(i);
                message += "addLast(" + i + ")\n";
            } else if (numberBetweenZeroAndOne < 0.5) {
                ads.addFirst(i);
                sad.addFirst(i);
                message += "addFirst(" + i + ")\n";
            } else if (numberBetweenZeroAndOne < 0.75 && !sad.isEmpty()) {
                expected = ads.removeFirst();
                actual = sad.removeFirst();
                message += "removeFirst()\n";
                assertEquals(message, expected, actual);
            } else if (numberBetweenZeroAndOne < 1 && !sad.isEmpty()) {
                expected = ads.removeLast();
                actual = sad.removeLast();
                message += "removeLast()\n";
                assertEquals(message, expected, actual);
            }
        }
    }
}
