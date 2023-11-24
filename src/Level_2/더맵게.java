package Level_2;

import java.util.PriorityQueue;

public class 더맵게 {
    public int solution(int[] scoville, int K) {
        int answer = -1;

        // 최소힙에 모든 음식 넣기
        // 반복문 시작
        // peek값 과 스코빌지수 k 비교하기
            // 같거나 크면 카운트 반환하면서 종료
            // 아니면 차례대로 poll
            // 새 음식 만들기
            // 최소힙에 새 음식 넣기
            // 카운트
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < scoville.length; i++) {
            pq.offer(scoville[i]);
        }

        int cnt = 0;
        while (pq.size() > 1) {
            if (pq.peek() >= K) {
                answer = cnt;
                break;
            }

            int first = pq.poll();
            int second = pq.poll() * 2;
            pq.offer(first + second);
            cnt++;
        }
        if (pq.size() == 1 && pq.peek() >= K) {
            answer = cnt;
        }

        return answer;
    }

    public static void main(String[] args) {
        new 더맵게().solution(null, 0);
    }
}
