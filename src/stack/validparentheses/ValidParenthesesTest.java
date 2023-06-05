package stack.validparentheses;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

//    Example 1:
//
//    Input: s = "()"
//    Output: true
//    Example 2:
//
//    Input: s = "()[]{}"
//    Output: true
//    Example 3:
//
//    Input: s = "(]"
//    Output: false


    @ParameterizedTest
    @ValueSource(strings = {"()","()[]{}", "{([])}"})
    void isValid(String input) {
        ValidParentheses validParentheses = new ValidParentheses();
        Assertions.assertTrue(validParentheses.isValid(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {")","(]", "{([)]}", "(){}}{"})
    void isNotValid(String input){
        ValidParentheses validParentheses = new ValidParentheses();
        Assertions.assertFalse(validParentheses.isValid(input));
    }
}