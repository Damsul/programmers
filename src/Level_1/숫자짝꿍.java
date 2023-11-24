package Level_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 숫자짝꿍 {
    public String solution(String X, String Y) {
        // X, Y 문자 배열 변환
        char[] arrX = X.toCharArray();
        char[] arrY = Y.toCharArray();

        // 공통 정수 담을 리스트 list 선언
        List<Character> list = new ArrayList<>();
        // X 원소 하나씩 Y 원소와 비교
        for (int i = 0; i < arrX.length; i++) {
            for (int j = 0; j < arrY.length; j++) {
                if (arrX[i] == arrY[j]) {
                    // 공통인 원소가 있다면 list에 추가
                    list.add(arrY[j]);
                    // 중복 추가되지 않도록 처리
                    arrY[j] = ' ';
                }
            }
        }
        // list 크기가 0이면 -1 반환
        if (list.isEmpty()) return "-1";
        for (int i = 0; i < list.size(); i++) {
            // list 가 0이외의 수가 추가되어 있다면
            if (list.get(i) != '0') {
                // 역정렬 후 반환
                list.sort(Collections.reverseOrder());
                return listChToString(list);
            }
        }
        // list 가 0으로만 구성되어 있다면 "0" 반환
        return "0";
    }
    // list를 String으로 변환하는 메소드
    public String listChToString(List<Character> list) {
        StringBuilder sb = new StringBuilder();
        for (Character ch : list) {
            sb.append(ch);
        }
        return sb.toString();
    }


    public String solution1(String X, String Y) {
        // 0~9 정수 카운트 배열 count 선언
        int[] count = new int[10];
        // 공통 정소 담을 리스트 list 선언
        List<Integer> list = new ArrayList<>();
        // X, Y 문자 배열로 변환
        char[] arrX = X.toCharArray();
        char[] arrY = Y.toCharArray();
        // X배열 크기만큼 반복
        for (int i = 0; i < arrX.length; i++) {
            // X배열 원소 정수 n으로 변환
            int n = arrX[i] - '0';
            // 카운트 배열의 인덱스가 정수n 인 부분 증가, count[n]++
            count[n]++;
        }
        // Y배열 크기만큼 반복
        for (int i = 0; i < arrY.length; i++) {
            // Y배열 원소 정수 n으로 변환
            int n = arrY[i] - '0';
            // count[n]이 0보다 크면
            if (count[n] > 0) {
                // 리스트에 n 추가
                list.add(n);
            }
            // 카운트 배열의 인덱스가 정수n 인 부분 감소, count[n]--
            count[n]--;
        }

        // list 크기가 0이면 "-1" 반환
        if (list.size() == 0) return "-1";
        for (int i = 0; i < list.size(); i++) {
            // list 가 0이외의 수가 추가되어 있다면
            if (list.get(i) != 0) {
                // 역정렬 후
                list.sort(Collections.reverseOrder());
                // 리스트 문자열로 변환 후 반환
                return listToString(list);
            }
        }
        // list 가 0으로만 구성되어 있다면 "0" 반환
        return "0";
    }

    // list를 String으로 변환하는 메소드
    public String listToString(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for (Integer n : list) {
            sb.append(n);
        }
        return sb.toString();
    }

    public String goodSolution(String X, String Y) {
        int[] arrX = new int[10];
        int[] arrY = new int[10];

        for (int i = 0; i < X.length(); i++) {
            arrX[X.charAt(i) - '0']++;
        }
        for (int i = 0; i < Y.length(); i++) {
            arrY[Y.charAt(i) - '0']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < Math.min(arrX[i], arrY[i]); j++) {
                sb.append(i);
            }
        }

        String answer = sb.toString();
        if (answer.equals("")) return "-1";
        if (answer.charAt(0) == '0') return "0";
        return answer;
    }
}
