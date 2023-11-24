package Level_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int t = commands.length;
        int[] answer = new int[t];

        for (int i = 0; i < t; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                list.add(array[j]);
            }
            Collections.sort(list);
            answer[i] = list.get(commands[i][2] - 1);
        }

        return answer;
    }
}
