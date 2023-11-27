package Level_1;

import java.util.Arrays;

public class 소수만들기 {
    public int solution(int n) {
        int answer = 0;
        boolean[] isPrime = new boolean[n + 1];

        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!isPrime[i]) continue;

            for (int j = i * i; j <= n; j += i) {
                isPrime[j] = false;
            }
        }

        for (int i = 0; i < isPrime.length; i++) {
            if (isPrime[i]) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        소수만들기 main = new 소수만들기();
        System.out.println(main.solution(10));
        System.out.println(main.solution(5));
    }
}
