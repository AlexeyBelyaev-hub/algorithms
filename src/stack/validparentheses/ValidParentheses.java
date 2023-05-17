package stack.validparentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    private Stack<String> openStack;
    private Map<String, String> ruleMap;

    public ValidParentheses() {
        this.openStack = new Stack<>();
        this.ruleMap = new HashMap<>();
        ruleMap.put("]","[");
        ruleMap.put(")","(");
        ruleMap.put("}","{");
    }

    public boolean isValid(String s) {
        if (s.length() == 1) return false;
        //Кладем первый элемент
        openStack.push(s.substring(0, 1));
        for(int i = 1; i < s.length(); i++) {
            String curr = s.substring(i, i + 1);
            if (ruleMap.containsKey(curr) && !openStack.isEmpty()) {
                String expected = ruleMap.get(curr);
                String actual = openStack.pop();
                if (!actual.equals(expected)) return false;
            } else {
                openStack.push(curr);
            }
        }

        return openStack.isEmpty();
    }
}
