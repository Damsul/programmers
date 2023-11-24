package Level_1;

import java.util.Arrays;

public class 과일장수 {
    public static int solution(int k, int m, int[] score) {
        int total = 0;

        // score 정렬
        Arrays.sort(score);

        // 박스 개수 만큼 반복
        for (int i = score.length - m; i >= 0 ; i -= m) {
            // 마지막 인덱스에 m개씩 빼면서 총점수에 한 상자의 점수를 더한다.
            total += score[i] * m;
        }


        return total;
    }
    public static int solution1(int k, int m, int[] score) {
        int total = 0;

        // 점수별 사과 개수 count 배열 선언
        int[] count = new int[k + 1];
        // 사과 점수 카운트
        for (int n : score) {
            count[n]++;
        }

        // 과일 개수 세는 cnt 선언
        int cnt = 0;
        // count 배열 마지막 인덱스 k 부터 반복 시작
        for (int i = k; i > 0; i--) {
            // 최저 사과 점수 min 선언
            int min = i;
            // count[i]가 0이 될 때까지 반복
            while (count[i] > 0) {
                // 반복 횟수 증가
                cnt++;
                // count[i] 1 감소
                count[i]--;
                // 반복 횟수가 m의 배수이면
                if (cnt % m == 0)
                    // 총 점수 += (최저 사과 점수) x (한 상자에 담긴 사과 개수)
                    total += min * m;
            }
        }


        return total;
    }

    public static void main(String[] args) {
        System.out.println(solution(3, 4, new int[]{1, 2, 3, 1, 2, 3, 1}));
        System.out.println(solution(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}));
    }
}
