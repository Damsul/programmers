package Level_1;

public class 시저암호 {
    public String solution(String s, int n) {
        char[] alphabets = s.toCharArray();
        for (int i = 0; i < alphabets.length; i++) {
            if (alphabets[i] == ' ') continue;

            int num = alphabets[i] + n;

            if (num > 'z') num -= 26;
            if (num > 'Z' && alphabets[i] <= 'Z') num -= 26;

            alphabets[i] = (char) (num);
        }

        return String.valueOf(alphabets);
    }

    public static void main(String[] args) {
        시저암호 main = new 시저암호();
        System.out.println(main.solution("AB", 1));
        System.out.println(main.solution("z", 1));
        System.out.println(main.solution("a B z", 4));
//        System.out.println((int)('a' - 'Z'));
//        System.out.println((int)('z'));
//        System.out.println((int) ('Z') - 25);
//        System.out.println((char) (65));
    }
}
