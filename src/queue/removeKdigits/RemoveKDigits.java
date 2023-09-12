package queue.removeKdigits;

import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveKDigits {
    public String removeKdigits(String num, int k) {
        if(num.length() == k) return "0";

        Deque<Character> stack = new ArrayDeque<>();

        int m = 0;

        for(int i = 0; i < num.length(); i++) {

            Character c = num.charAt(i);

            while(!stack.isEmpty() && c < stack.peekLast() && m < k) {
                stack.removeLast();
                m++;
            }
            stack.addLast(c);
        }

        for (int i = 0; i < k-m; i++) {
            stack.removeLast();
        }

        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()) {
            sb.append(stack.pollFirst());
        }

        return removeLeadingZeros(sb.toString());
    }

    private String removeLeadingZeros(String str){
        int i = 0;
        while (i<str.length()-1 && str.charAt(i) == '0' ) {
            i++;
        }
        return str.substring(i);
    }
}
