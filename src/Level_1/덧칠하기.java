package Level_1;

public class 덧칠하기 {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean[] painting = new boolean[n + 1];

        for (int num : section) {
            if (painting[num]) continue;

            for (int i = num; i < num + m && i <= n; i++) {
                painting[i] = true;
            }

            answer++;
        }

        return answer;
    }
}
