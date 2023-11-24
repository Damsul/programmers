package Level_1;

import java.util.Arrays;

public class 가장가까운같은글자 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] alphabet = new int[26];
        Arrays.fill(alphabet, -1);

        for (int i = 0; i < s.length(); i++) {
            int n = s.charAt(i) - 'a';

            if (alphabet[n] == -1) {
                answer[i] = -1;
            } else {
                answer[i] = i - alphabet[n];
            }

            alphabet[n] = i;
        }

        return answer;
    }

    public static void main(String[] args) {
        가장가까운같은글자 main = new 가장가까운같은글자();
        System.out.println(Arrays.toString(main.solution("banana")));
        System.out.println(Arrays.toString(main.solution("foobar")));

    }
}
