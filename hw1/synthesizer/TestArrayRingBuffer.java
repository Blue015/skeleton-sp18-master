package synthesizer;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests the ArrayRingBuffer class.
 *
 * @author Josh Hug
 */

public class TestArrayRingBuffer {
    @Test
    public void someTest() {
        ArrayRingBuffer arb = new ArrayRingBuffer(6);
        arb.enqueue(5);
        arb.enqueue(4);
        arb.enqueue(3);
        arb.enqueue(2);
        arb.enqueue(1);
        arb.enqueue(0);
//        arb.enqueue(0);
        arb.dequeue();
        arb.dequeue();
//        arb.dequeue();
//        arb.dequeue();
        arb.dequeue();
        arb.dequeue();
    }

    /**
     * Calls tests for ArrayRingBuffer.
     */
    public static void main(String[] args) {
        jh61b.junit.textui.runClasses(TestArrayRingBuffer.class);
    }
} 
