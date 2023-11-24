package Level_1;

public class 문자열내p와y의개수 {
    boolean solution(String s) {
        int cntP = 0;
        int cntY = 0;

        char[] sChar = s.toUpperCase().toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (sChar[i] == 'P') cntP++;
            if (sChar[i] == 'Y') cntY++;
        }

        return cntP == cntY;
    }
}
