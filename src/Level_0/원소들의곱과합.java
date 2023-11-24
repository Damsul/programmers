package Level_0;

public class 원소들의곱과합 {
    public int solution(int[] num_list) {
        int answer = 0;

        int mul = 1; // 곱
        int sum = 0; // 합

        for (int i = 0; i < num_list.length; i++) {
            mul *= num_list[i];
            sum += num_list[i];
        }

        if (mul < sum * sum) answer = 1;

        return answer;
    }
}
