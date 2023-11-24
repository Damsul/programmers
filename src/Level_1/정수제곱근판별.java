package Level_1;

public class 정수제곱근판별 {
    public long solution(long n) {
        long answer = -1;

        // n의 제곱근 x 구하기
        long x = (long) Math.sqrt(n);

        // n - (x의 제곱)이 0이면
        if (n - (x * x) == 0) {
            // (x + 1)의 제곱 answer 에 대입
            answer = (long) Math.pow(x + 1, 2);
        }

        // n - (x의 제곱)이 0이 아니면 answer = -1
        // answer 리턴
        return answer;
    }
}
