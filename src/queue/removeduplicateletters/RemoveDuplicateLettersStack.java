package queue.removeduplicateletters;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class RemoveDuplicateLettersStack {
    public String removeDuplicateLetters(String s) {
        HashSet<Character> inStack = new HashSet<>();
        Stack<Character> stack =  new Stack<>();

        HashMap<Character, Integer> lastOccur = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            lastOccur.put(s.charAt(i), i);
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i%s.length());
            if (!inStack.contains(ch)) {
                while ( !stack.isEmpty()
                        && stack.peek() > ch
                            && lastOccur.get(stack.peek()) > i) {
                    inStack.remove(stack.pop());
                }
                stack.push(ch);
                inStack.add(ch);
            }

        }

        StringBuffer sb =new StringBuffer();
        for (Character c : stack) {
            sb.append(c);
        }

        return sb.toString();
    }
}
