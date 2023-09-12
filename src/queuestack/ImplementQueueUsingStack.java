package queuestack;

import java.util.ArrayDeque;

public class ImplementQueueUsingStack {
    private ArrayDeque<Integer> stack1;
    private ArrayDeque<Integer> stack2;

    public ImplementQueueUsingStack() {
        stack1 = new ArrayDeque<>();
        stack2 = new ArrayDeque<>();
    }

    public void push(int x) {
        if(stack2.isEmpty()) {
            stack2.addLast(x);
        } else {
            stack1.addLast(x);
        }
    }

    // Amortized cost - O(1)
    public int pop() {
        int res = stack2.pollLast();
        if (stack2.isEmpty()) {
            while(!stack1.isEmpty() ) stack2.addLast(stack1.pollLast());
        }
        return res;
    }

    public int peek() {
        return stack2.peekLast();
    }

    public boolean empty() {
        return stack2.isEmpty();
    }
}
