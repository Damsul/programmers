package Level_1;

import java.util.*;

public class 문자열내마음대로정렬하기 {
    public String[] solution(String[] strings, int n) {
        List<List<String>> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < strings.length; i++) {
            list.get(strings[i].charAt(n) - 'a').add(strings[i]);
        }

        List<String> answer = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Collections.sort(list.get(i));
            answer.addAll(list.get(i));
        }

        return answer.toArray(new String[0]);
    }
}
