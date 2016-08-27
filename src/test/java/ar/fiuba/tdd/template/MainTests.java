package ar.fiuba.tdd.template;

import ar.fiuba.tdd.template.queue.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MainTests {

    @Test
    public void testEmpty() {
        Queue<String> queue = new Queue<>();
        assertEquals(0, queue.size());
        assertTrue(queue.isEmpty());
        queue.add("1");
        assertEquals(1, queue.size());
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testRemove() {
        Queue<String> queue = new Queue<>();
        queue.add("1");
        queue.add("2");
        assertEquals("1", queue.top());
        queue.remove();
        assertEquals("2", queue.top());
        queue.add("3");
        queue.remove();
        assertEquals("3", queue.top());
        assertFalse(queue.isEmpty());
        assertEquals(1, queue.size());
        queue.remove();
        assertTrue(queue.isEmpty());
        assertEquals(0, queue.size());
    }

    @Test
    public void testTop() {
        Queue<String> queue = new Queue<>();
        queue.add("1");
        queue.add("2");
        assertEquals("1", queue.top());
    }
}
