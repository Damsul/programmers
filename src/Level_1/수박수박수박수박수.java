package Level_1;

public class 수박수박수박수박수 {
    public static String solution(int n) {
        String answer = "";

        answer = "수박".repeat(n / 2);
        if (n % 2 != 0) answer += "수";

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(수박수박수박수박수.solution(3));
        System.out.println(수박수박수박수박수.solution(4));
    }
}
