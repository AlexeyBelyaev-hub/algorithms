package stack.decodestring;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class DecodeString {

    public String decodeString(String s) {

        ArrayDeque<Character> stack = new ArrayDeque<>();

        for(int i = 0; i < s.length(); i++) {

            stack.addFirst(s.charAt(i));
            if (s.charAt(i) == ']') {
                ArrayList<Character> characters = new ArrayList<>();
                stack.pollFirst(); // убираем ]
                while (stack.peekFirst() != '[' && !stack.isEmpty()) {
                    characters.add(stack.pollFirst());
                }
                stack.pollFirst(); // убираем [

                int base = 1;
                int k = 0;
                //get k
                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    k = k + (stack.pop() - '0') * base;
                    base *= 10;
                }

                //Integer k = Integer.valueOf(stack.pollFirst().toString());
                while (k > 0) {
                    for (int j =  characters.size() - 1; j >= 0; j--) {
                        stack.addFirst(characters.get(j));
                    }
                    k--;
                }
            }

        }

        char[] res = new char[stack.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = stack.pollFirst();
        }
        return new String(res);
    }

}
