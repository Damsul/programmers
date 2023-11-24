package Level_1;

public class 음양더하기 {
    public static int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;
        for (int i = 0; i < signs.length; i++) {
            if (!signs[i])
                absolutes[i] *= -1;
            sum += absolutes[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};
        System.out.println(solution(absolutes, signs));
    }
}
