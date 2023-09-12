package stack.reversepolishnotation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RpnTest {

//    Example 1:
//
//    Input: tokens = ["2","1","+","3","*"]
//    Output: 9
//    Explanation: ((2 + 1) * 3) = 9
    @Test
    void evalRPNExample1() {
        String[] tokens = {"2", "1", "+", "3", "*"};
        Rpn rpn = new Rpn();
        int res = rpn.evalRPN(tokens);
        Assertions.assertEquals(9, res);

    }


//    Example 2:
//
//    Input: tokens = ["4","13","5","/","+"]
//    Output: 6
//    Explanation: (4 + (13 / 5)) = 6
    @Test
    void evalRPNExample2() {
        String[] tokens = {"4","13","5","/","+"};
        Rpn rpn = new Rpn();
        int res = rpn.evalRPN(tokens);
        Assertions.assertEquals(6, res);
    }


//    Example 3:
//
//    Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
//    Output: 22
//    Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
//            = ((10 * (6 / (12 * -11))) + 17) + 5
//            = ((10 * (6 / -132)) + 17) + 5
//            = ((10 * 0) + 17) + 5
//            = (0 + 17) + 5
//            = 17 + 5
//            = 22
//
    @Test
    void evalRPNExample3() {
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        Rpn rpn = new Rpn();
        int res = rpn.evalRPN(tokens);
        Assertions.assertEquals(22, res);

    }
}