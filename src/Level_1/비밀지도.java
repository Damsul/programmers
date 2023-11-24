package Level_1;

import java.util.Arrays;

public class 비밀지도 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] binaryStrings = makeBinaryString(arr1, arr2);

        for (int i = 0; i < n; i++) {
            char[] binary = binaryStrings[i].toCharArray();
            char[] map = new char[n];
            Arrays.fill(map, ' ');

            if (binary.length < n) { // 시작이 0인 경우
                for (int j = n - binary.length; j < n; j++) {
                    if (binary[j - (n - binary.length)] == '1') map[j] = '#';
                }

            } else {
                for (int j = 0; j < n; j++) {
                    if (binary[j] == '1') map[j] = '#';
                }
            }
            answer[i] = String.valueOf(map);
        }

        return answer;
    }

    public String[] makeBinaryString(int[] arr1, int[] arr2) {
        String[] binaryStrings = new String[arr1.length];
        for (int i = 0; i < binaryStrings.length; i++) {
            binaryStrings[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }
        return binaryStrings;
    }

    public String[] solution2(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String tmp = "";

        for (int i = 0; i < n; i++) {
            tmp = String.format("%16s", Integer.toBinaryString(arr1[i] | arr2[i]));
            tmp = tmp.substring(16 - n);
            tmp = tmp.replaceAll("1", "#");
            tmp = tmp.replaceAll("0", " ");
            answer[i] = tmp;
        }

        return answer;
    }
}
