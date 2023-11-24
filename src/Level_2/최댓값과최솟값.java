package Level_2;

public class 최댓값과최솟값 {
    public String solution(String s) {
        String answer = "";

        String[] split = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (String sNum : split) {
            int num = Integer.parseInt(sNum);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        return min + " " + max;
    }

}
