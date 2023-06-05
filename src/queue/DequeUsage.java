package queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class DequeUsage {

    @Test
    public void queueExceptionMethodUsageTest() {
        Deque<String> queue = new LinkedList<>();
        //add to the end
        queue.addLast("a");
        queue.addLast("b");
        queue.addLast("c");

        //poll from the head
        Assertions.assertEquals("a", queue.removeFirst());
        Assertions.assertEquals("b", queue.removeFirst());
        Assertions.assertEquals("c", queue.removeFirst());
        Assertions.assertThrows(NoSuchElementException.class, ()->queue.removeFirst());
        Assertions.assertThrows(NoSuchElementException.class, ()->queue.getFirst());
    }

    @Test
    public void queueNonExceptionMethodSTACKUsageTest() {
        Deque<String> stack = new LinkedList<>();
        //add to the end
        stack.addFirst("a");
        stack.addFirst("b");
        stack.addFirst("c");

        //poll from the head
        Assertions.assertEquals("c", stack.pollFirst());
        Assertions.assertEquals("b", stack.pollFirst());
        Assertions.assertEquals("a", stack.pollFirst());
        Assertions.assertNull(stack.peekFirst());
        Assertions.assertNull(stack.pollFirst());
    }
}
