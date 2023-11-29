package Level_1;

import java.util.*;

public class 실패율 {
    public int[] solution(int N, int[] stages) {
        int[] total = new int[N + 2];// 해당 스테이지에 도달한 플레이어 수
        int[] cur = new int[N + 2]; // 해당 스테이지를 클리어 못한 플레이어 수
        Double[] failRate = new Double[N + 2]; // 해당 스테이지 실패율
        // 스테이지 도달한 플레이어의 수 구하기
        for (int stage : stages) {
            cur[stage]++;
            for (int i = 1; i <= stage; i++)
                total[i]++;
        }

        // 실패율 구하기
        for (int i = 1; i <= N; i++) {
            if (total[i] == 0) {
                failRate[i] = 0.0;
                continue;
            }
            failRate[i] = 1.0 * cur[i] / total[i];
        }

        // 실패율 기준으로 스테이지 내림차순 정렬
        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 1; i <= N; i++) {
            pq.add(failRate[i]);
        }

        int[] answer = new int[N];
        for (int i = 1; i <= N; i++) {
            Double rate = pq.poll();
            // rate가 실패율과 같다면 answer에 실패율의 스테이지 넣기
            for (int j = 1; j <= N; j++) {
                if (Objects.equals(rate, failRate[j])) {
                    answer[i - 1] = j;
                    failRate[j] = -1.0;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        실패율 main = new 실패율();
        System.out.println(Arrays.toString(main.solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3})));
        System.out.println(Arrays.toString(main.solution(4, new int[]{4, 4, 4, 4, 4})));
        System.out.println(Arrays.toString(main.solution(2, new int[]{1, 1, 1, 1})));
    }
}
