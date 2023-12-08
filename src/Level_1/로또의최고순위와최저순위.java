package Level_1;

import java.util.Map;
import java.util.TreeMap;

public class 로또의최고순위와최저순위 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zero = 0;
        int cnt = 0;

        for (int num : lottos) {
            if (num == 0) {
                zero++;
                continue;
            }

            for (int i = 0; i < win_nums.length; i++) {
                if (num != win_nums[i]) continue;
                cnt++;
            }
        }

        int maxRank = 7 - cnt- zero;
        int minRank = 7 - cnt;
        if (maxRank > 6) maxRank = 6;
        if (minRank > 6) minRank = 6;


        int[] answer = {maxRank, minRank};
        return answer;
    }
}
