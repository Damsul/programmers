package Level_2;

import java.util.HashSet;
import java.util.Set;

public class 영어끝말잇기 {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        Set<String> set = new HashSet<>();
        set.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            // 앞사람이 말한 단어의 뒷 글자
            char perv = words[i - 1].charAt(words[i - 1].length() - 1);
            // 현재 단어의 앞글자
            char cur = words[i].charAt(0);
            // 끝말잇기가 아닌 경우,  같은 단어가 나왔을 경우
            if (perv != cur || set.contains(words[i])) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
            set.add(words[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        System.out.println(set.equals("hello"));
        System.out.println(set.contains("hello"));

    }
}
