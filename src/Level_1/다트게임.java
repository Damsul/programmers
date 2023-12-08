package Level_1;

import java.util.Stack;

public class 다트게임 {
    public int solution(String dartResult) {
        char[] ch = dartResult.toCharArray();
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'S') continue;
            if (ch[i] == 'D') {
                int cur = s.pop();
                s.push(cur * cur);
                continue;
            }
            if (ch[i] == 'T') {
                int cur = s.pop();
                s.push(cur * cur * cur);
                continue;
            }
            if (ch[i] == '*') {
                int cur = s.pop() * 2;
                if (!s.isEmpty()) {
                    int prev = s.pop() * 2;
                    s.push(prev);
                }
                s.push(cur);
                continue;
            }
            if (ch[i] == '#') {
                int cur = s.pop();
                s.push(cur * -1);
                continue;
            }

            int point;
            if (i != 0 && ch[i] == '0' && ch[i - 1] == '1') {
                point = 10;
                s.pop();
            } else {
                point = ch[i] - '0';
            }
            s.push(point);
        }

        int ans = 0;
        while (!s.isEmpty()) {
            ans += s.pop();
        }
        return ans;
    }

    public static void main(String[] args) {
        다트게임 main = new 다트게임();
        System.out.println(main.solution("1S2D*3T"));
        System.out.println(main.solution("1D2S#10S"));
        System.out.println(main.solution("1D2S0T"));
        System.out.println(main.solution("1S*2T*3S"));
        System.out.println(main.solution("1D#2S*3S"));
        System.out.println(main.solution("1T2D3D#"));
        System.out.println(main.solution("1D2S3T*"));
        System.out.println(main.solution("10D4S10D"));
        System.out.println(main.solution("10D10S10T"));
    }
}
