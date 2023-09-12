package queuestack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ImplementStackUsingQueueTest {

    @Test
    public void implementStackUsingQueueTest() {

        ImplementStackUsingQueue myStack = new ImplementStackUsingQueue();
        myStack.push(1);
        myStack.push(2);
        Assertions.assertEquals(2,myStack.top()); // return 2
        Assertions.assertEquals(2, myStack.pop()); // return 2

        Assertions.assertFalse(myStack.empty()); // return False
    }

}