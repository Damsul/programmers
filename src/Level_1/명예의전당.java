package Level_1;

import java.util.*;

public class 명예의전당 {
    public static int[] hall;
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            pq.add(score[i]);

            if (pq.size() > k) pq.poll();

            answer[i] = pq.peek();
        }

        return answer;
    }
    public int[] solution1(int k, int[] score) {
        int[] answer = new int[score.length];
        hall = new int[k];
        int min = score[0];

        for (int i = 0; i < k; i++) {
            if (i >= score.length) return answer;

            hall[i] = score[i];
            if (min > hall[i]) min = hall[i];
            answer[i] = min;
        }
        Arrays.sort(hall);

        for (int i = k; i < score.length; i++) {
            if (hall[0] < score[i]) {
                hall[0] = score[i];
                sort(hall);
            }
            answer[i] = hall[0];
        }

        return answer;
    }

    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int tmp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = tmp;
            } else break;
        }
    }
}
