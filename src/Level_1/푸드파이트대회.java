package Level_1;

public class 푸드파이트대회 {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            int cnt = food[i] / 2;
            sb.append(String.valueOf(i).repeat(cnt));
        }

        return sb.toString() + "0" + sb.reverse().toString();
    }
}
