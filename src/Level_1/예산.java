package Level_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 예산 {
    public int solution(int[] d, int budget) {
        int ans = 0;
        int cnt = 0;

        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            budget -= d[i];
            if (budget < 0) break;
            cnt++;
        }

        return cnt;
    }
}
