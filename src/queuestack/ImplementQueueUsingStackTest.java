package queuestack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ImplementQueueUsingStackTest {

    @Test
    public void test() {
        ImplementQueueUsingStack imqus = new ImplementQueueUsingStack();

        imqus.push(1);
        imqus.push(2);
        imqus.push(3);

        Assertions.assertEquals(1, imqus.peek());

        Assertions.assertEquals(1, imqus.pop());
        Assertions.assertEquals(2, imqus.pop());
        imqus.push(4);
        imqus.push(5);
        Assertions.assertEquals(3, imqus.peek());
        Assertions.assertEquals(3, imqus.pop());
        Assertions.assertEquals(4, imqus.pop());


    }

}