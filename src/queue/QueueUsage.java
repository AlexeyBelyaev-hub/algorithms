package queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueUsage {

    @Test
    public void queueExceptionMethodUsageTest() {
        Queue<String> queue = new LinkedList<>();
        //add to the end
        Assertions.assertTrue(queue.add("a"));
        queue.add("b");
        queue.add("c");

        //poll from the head
        Assertions.assertEquals("a", queue.remove());
        Assertions.assertEquals("b", queue.remove());
        Assertions.assertEquals("c", queue.remove());
        Assertions.assertThrows(NoSuchElementException.class, ()->queue.remove());
        Assertions.assertThrows(NoSuchElementException.class, ()->queue.element());
    }

    @Test
    public void queueNonExceptionMethodUsageTest() {
        Queue<String> queue = new LinkedList<>();
        //add to the end
        Assertions.assertTrue(queue.offer("a"));
        queue.offer("b");
        queue.offer("c");

        //poll from the head
        Assertions.assertEquals("a", queue.poll());
        Assertions.assertEquals("b", queue.poll());
        Assertions.assertEquals("c", queue.poll());
        Assertions.assertNull(queue.peek());
        Assertions.assertNull(queue.poll());
    }
}
