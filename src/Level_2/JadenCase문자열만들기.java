package Level_2;

public class JadenCase문자열만들기 {
    public String solution(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') continue;
            if ('0' <= chars[i] && chars[i] <= '9') continue;
            if (i == 0) {
                chars[i] = (char) (chars[i] - 32);
                continue;
            }
            if (chars[i - 1] == ' ')
                chars[i] = (char) (chars[i] - 32);
        }

        return String.valueOf(chars);
    }
    public String solution1(String s) {
        // s 문자열 공백을 기준으로 split
        String[] split = s.split(" ");
        // 각 단어 첫 문자 숫자인지 확인
        for (int i = 0; i < split.length; i++) {
            // 숫자이면 그대로 사용
            if ('0' <= split[i].charAt(0) && split[i].charAt(0) <= '9')
                continue;
            // 숫자가 아니면 전체 소문자로 변환 후 첫 문자만 대문자로 변환
            char[] chars = split[i].toLowerCase().toCharArray();
            chars[0] = (char) (chars[0] - 32);
            split[i] = String.valueOf(chars);
        }
        // StringBuilder 사용해서 단어사이에 공백 기입
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            sb.append(split[i]);
            if (i < split.length - 1) {
                sb.append(' ');
            }
        }

        return sb.toString();
    }

    public String goodSolution(String s) {
        String[] split = s.toLowerCase().split("");
        boolean flag = true;

        StringBuilder sb = new StringBuilder();
        for (String ss: split) {
            sb.append(flag ? ss.toUpperCase() : ss);
            flag = ss.equals(" ");
        }
        return sb.toString();
    }
}
