package Level_1;

import java.util.Arrays;

public class 최대공약수와_최소공배수 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = gcd(n, m);
        answer[1] = lcm(n, m);
        return answer;
    }

    public int gcd(int n, int m) { // 최대공약수
        int ans = 1;
        int min = Math.min(n, m);
        for (int i = 2; i <= min; i++) {
            if (n % i != 0) continue;
            if (m % i != 0) continue;
            ans *= i;
        }
        return ans;
    }

    public int lcm(int n, int m) { // 최소공배수
        int ans = n * m;
        int max = n * m;
        for (int i = 2; i <= max; i++) {
            if (i % n != 0) continue;
            if (i % m != 0) continue;
            ans = i;
            break;
        }
        return ans;
    }

    public static void main(String[] args) {
        최대공약수와_최소공배수 main = new 최대공약수와_최소공배수();
        System.out.println(Arrays.toString(main.solution(3, 12)));
        System.out.println(Arrays.toString(main.solution(2, 5)));
    }
}
