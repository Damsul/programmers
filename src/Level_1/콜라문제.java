package Level_1;

public class 콜라문제 {
    public int solution(int a, int b, int n) {
        int answer = recursion(a, b, n, 0);
        return answer;
    }

    public int recursion(int empty, int full, int n, int r) {
        if (n == 0) return n;

        int cnt = (n + r) / empty * full;
        return cnt + recursion(empty, full, cnt, (n + r) % empty);
    }
}
