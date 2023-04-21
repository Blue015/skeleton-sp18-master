import static org.junit.Assert.*;

import org.junit.Test;

public class TestArrayDequeGold {
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

        Integer result4 = tests.removeFirst();
        Integer result5 = testa.removeFirst();
        assertEquals("\nremoveFirst(" + result4 + ")\n"
                        + "removeFirst(" + result5 + ")\n" + "removeFirst()",
                result4, result5);

        Integer result6 = tests.removeLast();
        Integer result7 = testa.removeLast();
        assertEquals("\nremoveLast(" + result6 + ")\n"
                        + "removeLast(" + result7 + ")\n" + "removeLast()",
                result7, result6);

        Integer result0 = tests.removeFirst();
        Integer result1 = testa.removeFirst();
        assertEquals("\nremoveFirst(" + result0 + ")\n"
                        + "removeFirst(" + result1 + ")\n" + "removeFirst()",
                result1, result0);

        Integer result2 = tests.removeLast();
        Integer result3 = testa.removeLast();
        assertEquals("\nremoveLast(" + result2 + ")\n"
                        + "removeLast(" + result3 + ")\n" + "removeLast()",
                result3, result2);
    }
}
