package Level_1;

public class 콜라츠추측 {
    public static int solution(long num) {
        if (num == 1) return 0;

        int cnt = 0;
        while (num != 1) {
            if (cnt >= 500) return -1;

            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = (num * 3) + 1;
            }
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(solution(6));
        System.out.println(solution(16));
        System.out.println(solution(626331));
    }
}
