package Level_1;

import java.util.Arrays;

public class 이상한문자만들기 {
    public String solution(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        int idx = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') continue;
            if (idx != 0 && chars[i - 1] == ' ') idx = 0;

            if (idx % 2 == 0) chars[i] = (char) (chars[i] - 32);
            idx++;
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        String s = "  TRy HElLo  WORLD ";
        String[] split = s.split(" ", -1);
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
//        이상한문자만들기 test = new 이상한문자만들기();
//        System.out.println(test.solution("  TRy HElLo  WORLD "));
    }
}
        /*
        입력값 〉 "AA aa ZZ zz"
        기댓값 〉 "Aa Aa Zz Zz"
        입력값 〉   "  TRy HElLo  WORLD "
        기댓값 〉   "  TrY HeLlO  WoRlD "
        */