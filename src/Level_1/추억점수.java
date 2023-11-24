package Level_1;

import java.util.HashMap;
import java.util.Map;

public class 추억점수 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] result = new int[photo.length];

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        int idx = 0;
        for (String[] picture : photo) {
            int sum = 0;
            for (String p : picture) {
                if (map.containsKey(p)) {
                    sum += map.get(p);
                }
            }
            result[idx++] = sum;
        }

        return result;
    }
}