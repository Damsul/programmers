package Level_1;

public class 크기가작은부분문자열 {
    public static int solution(String t, String p) {

        int cnt = 0;
        char[] tchar = t.toCharArray();
        char[] pchar = p.toCharArray();

        for (int i = 0; i <= tchar.length - pchar.length; i++) {
            for (int j = 0; j < pchar.length; j++) {
                if (tchar[i + j] > pchar[j]) break;
                if (tchar[i + j] == pchar[j] && j < pchar.length - 1) continue;
                cnt++;
                break;
            }
        }

        return cnt;
    }
    public static int solution1(String t, String p) {
        int cnt = 0;
        int len = p.length();
        int pVal = Integer.parseInt(p);
        for (int i = 0; i < t.length() - len; i++) {
            long tVal = Long.parseLong(t.substring(i, i + len));
            if (tVal <= pVal) cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(크기가작은부분문자열.solution("3141592", "271"));
        System.out.println(크기가작은부분문자열.solution("500220839878", "7"));
        System.out.println(크기가작은부분문자열.solution("10203", "15"));

    }
}
/**
 * 1. p길이 구하기
 * 2. t에서 p의 길이만큼 부분문자열 추출
 * 3. parseInt
 *
 */