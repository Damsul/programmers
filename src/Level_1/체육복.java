package Level_1;

import java.util.Arrays;

public class 체육복 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        int[] sweatsuit = new int[n + 1];

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int i = 0; i < reserve.length; i++) {
            sweatsuit[reserve[i]]++;
        }

        for (int i = 0; i < lost.length; i++) {
            sweatsuit[lost[i]]--;
        }

        for (int i = 1; i <= n; i++) {
            if (sweatsuit[i] == -1) {
                if (i > 1 && sweatsuit[i - 1] == 1) {
                    sweatsuit[i - 1]--;
                    sweatsuit[i]++;
                } else if (i < n && sweatsuit[i + 1] == 1) {
                    sweatsuit[i + 1]--;
                    sweatsuit[i]++;
                } else answer--;
            }
        }



//        for (int i = 0; i < lost.length; i++) {
//            if (sweatsuit[lost[i]] == 1) sweatsuit[lost[i]]--;
//            else if (lost[i] > 1 && sweatsuit[lost[i] - 1] == 1) sweatsuit[lost[i] - 1]--;
//            else if (lost[i] < n && sweatsuit[lost[i] + 1] == 1) sweatsuit[lost[i] + 1]--;
//            else answer--;
//        }

        return answer;
    }
}
