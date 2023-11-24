package Level_1;

public class year2016 {

    public static void main(String[] args) {
        System.out.println(solution(5,24));
    }

    public static String solution(int a, int b) {
        int[] date = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int dateCnt = b;
        for (int i = 0; i < a; i++) {
            dateCnt += date[i];
        }
        return day[dateCnt % 7];
//        String result = "";
//        if (remainder == 1) {
//            result = "FRI";
//        } else if (remainder == 2) {
//            result = "SAT";
//        } else if (remainder == 3) {
//            result = "SUN";
//        } else if (remainder == 4) {
//            result = "MON";
//        } else if (remainder == 5) {
//            result = "TUE";
//        } else if (remainder == 6) {
//            result = "WEN";
//        } else if (remainder == 0) {
//            result = "THU";
//        }
//        return result;
    }
}
