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

        //addfirst
        Integer result4 = tests.removeFirst();
        Integer result5 = testa.removeFirst();
        assertEquals("Oh noooo!\nThis is bad:\n   Random number " + result4
                        + " not equal to " + result5 + "!",
                result4, result5);

        //addlast
        Integer result6 = tests.removeLast();
        Integer result7 = testa.removeLast();
        assertEquals("Oh noooo!\nThis is bad:\n   Random number " + result6
                        + " not equal to " + result7 + "!",
                result7, result6);

        //removefirst
        Integer result0 = tests.removeFirst();
        Integer result1 = testa.removeFirst();
        assertEquals("Oh noooo!\nThis is bad:\n   Random number " + result0
                        + " not equal to " + result1 + "!",
                result1, result0);

        //removelast
        Integer result2 = tests.removeLast();
        Integer result3 = testa.removeLast();
        assertNotEquals("Oh noooo!\nThis is bad:\n   Random number " + result2
                        + " not equal to " + result3 + "!",
                result3, result2);
    }
}
