package Level_0;

public class 특정문자열로끝나는가장긴부분문자열찾기 {

    public static void main(String[] args) {
        System.out.println(solution("AbCdEFG", "dE"));
        System.out.println(solution("AAAAaaaa", "a"));
    }
    public static String solution(String myString, String pat) {
        String answer = "";

        int idx = myString.lastIndexOf(pat);
        answer = myString.substring(0, idx).concat(pat);

        return answer;
    }
}
