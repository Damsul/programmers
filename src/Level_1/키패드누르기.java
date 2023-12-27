package Level_1;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class 키패드누르기 {

    public static int[] left = {3, 0}; // 왼손이 시작하는 키패드 위치
    public static int[] right = {3, 2}; // 오른손이 시작하는 키패드 위치
    public static Map<Integer, int[]> keypad = new TreeMap<>(); // 키패드 번호의 위치
    public static String LRhand;
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        LRhand = hand.equals("left") ? "L" : "R";

        for (int i = 0; i < 3; i++) { // 키패드 번호의 위치 입력
            for (int j = 0; j < 3; j++) {
                keypad.put(i * 3 + j + 1, new int[]{i, j});
            }
        }
        keypad.put(0, new int[]{3, 1});

        for (int num : numbers) {
            String LR = selectHand(num, hand);
            answer.append(LR);

            if (LR.equals("L")) left = keypad.get(num);
            if (LR.equals("R")) right = keypad.get(num);
        }

        return answer.toString();
    }

    private String selectHand(int num, String hand) {
        if (num == 1 || num == 4 || num == 7) return "L";
        if (num == 3 || num == 6 || num == 9) return "R";

        // num == 2, 5, 8, 0 일 경우
        // 왼쪽으로 부터의 거리 구하기
        int ld = getDistance(left, keypad.get(num));
        // 오른쪽으로 부터의 거리 구하기
        int rd = getDistance(right, keypad.get(num));
        // 비교해서 가까운 손가락 구하기
        if (ld < rd) return "L";
        if (ld > rd) return "R";
        // 같다면 왼손잡이, 오른손잡이 확인하기
        return LRhand;
    }

    private int getDistance(int[] a, int[] b) {
        int row = b[0] - a[0];
        int col = b[1] - a[1];
        return Math.abs(row) + Math.abs(col);
    }


    public static void main(String[] args) {
        Map<Integer, int[]> map = new TreeMap<>();
        map.put(0, new int[]{1, 1});
        System.out.println(Arrays.toString(map.get(0)));
        int[] zero = map.get(0);
        System.out.println(Arrays.toString(zero));
        zero = new int[]{2, 2};
        System.out.println(Arrays.toString(zero));
        System.out.println(Arrays.toString(map.get(0)));
    }
}
