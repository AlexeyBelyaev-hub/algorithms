package stack.reversepolishnotation;

import java.util.ArrayDeque;
import java.util.Deque;

public class Rpn {
    public int evalRPN(String[] tokens) {

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < tokens.length; i++) {
            if ( !tokens[i].matches("-*\\d++") && !stack.isEmpty() ) {
                Integer i2 = stack.pollFirst();
                Integer i1 = stack.pollFirst();
                stack.addFirst(proceedOperation(i1, i2, tokens[i]));
            } else {
                stack.addFirst(Integer.valueOf(tokens[i]));
            }
        }

        return stack.pollFirst();
    }

    private Integer proceedOperation(Integer i1, Integer i2, String operator) {

        return switch (operator) {
            case "+" -> i1 + i2;
            case "-" -> i1 - i2;
            case "/" -> i1 / i2;
            case "*" -> i1 * i2;
            default -> throw new UnsupportedOperationException();
        };

    }
}
