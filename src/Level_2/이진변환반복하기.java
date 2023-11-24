package Level_2;

public class 이진변환반복하기 {
    public int[] solution(String s) {
        int[] answer = {};

        int changeCnt = 0;
        int zeroCnt = 0;
        // s가 "1"이 될때 까지 반복
        while (!s.equals("1")) {
            StringBuilder sb = new StringBuilder();
            //'0' 제거
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    zeroCnt++;
                    continue;
                } else {
                    sb.append(s.charAt(i));
                }
            }
            // 1로 이루어진 문자열
            s = sb.toString();
            // s의 길이
            int length = s.length();
            // -> 이진수로 변환
            s = Integer.toBinaryString(length);
            changeCnt++;
        }


        return new int[]{changeCnt, zeroCnt};
    }
}
