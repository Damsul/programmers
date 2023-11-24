package Level_2;

import java.util.Stack;

public class 올바른괄호 {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            // '('일때 스택에 push
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            }
            // ')'일때
            else {
                // 스택이 비어있으면 false
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }
        // 반복문이 끝났을 때 스택이 비어있으면 true
        // 아니면 false
        return stack.isEmpty();
    }
}
