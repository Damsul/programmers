package Level_2;

import java.util.Arrays;
import java.util.Stack;

public class 짝지어제거하기 {
    public int solution(String s) {
        // 문자열s의 문자 담을 스택 생성
        Stack<Character> stack = new Stack<>();
        // s의 길이 만큼 반복
        for (int i = 0; i < s.length(); i++) {
            // 문자열의 문자를 담을 문자 변수c 생성
            char c = s.charAt(i);
            // 스택이 비어있으면 c push
            if (stack.isEmpty()) stack.push(c);
            // 스택의 peek와 c가 같으면 pop
            else if (stack.peek() == c) stack.pop();
            // 스택의 peek와 c가 다르면 push
            else stack.push(c);
        }

        // 짝지어서 문자를 모두 제거한 경우 스택이 비어있다.
        // 스택이 비어있으면 return 1
        // 아니면 return 0
        return stack.isEmpty() ? 1 : 0;
    }

    public int solutionFail1(String s) {

        // s.length - 1 만큼 반복
        for (int i = 0; i < s.length() - 1; i++) {
            // 현재 문자와 다음 문자 같은 경우
            if (s.charAt(i) == s.charAt(i + 1)) {
                // 제거
                s = removePair(s, i);
                if (i == 0) i = -1;
                else i += -2;
            }
        }

        return s.equals("") ? 1 : 0;
    }

    public String removePair(String s, int idx) {
        StringBuilder sb = new StringBuilder();
        sb.append(s, 0, idx);
        sb.append(s.substring(idx + 2));
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new 짝지어제거하기().solution("baabaa"));
        System.out.println(new 짝지어제거하기().solution("cdcd"));
    }
}
