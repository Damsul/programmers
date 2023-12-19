package Level_1;

import java.util.Set;
import java.util.TreeSet;

public class 둘만의암호 {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            int idx = 0;

            while (idx < index) {
                ch = ch == 'z' ? 'a' : (char) (ch + 1);
                if (!skip.contains(String.valueOf(ch))) idx++;
            }

            sb.append(ch);
        }

        return sb.toString();
    }
    public String mySolution(String s, String skip, int index) {
        Set<Integer> set = new TreeSet<>();
        for (char ch : skip.toCharArray()) {
            set.add((int) ch);
        }

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            int alphabet = chars[i];

            for (int j = 0; j < index; j++) {
                alphabet++;
                if (alphabet > 'z') alphabet -= 26;
                if (set.contains(alphabet)) j--;
            }

            chars[i] = (char) alphabet;
        }

        return String.valueOf(chars);
    }

    public static void main(String[] args) {
//        System.out.println((int) 'a'); // 97
//        System.out.println((char) ('a' + 25));
//        System.out.println('z' - 'a');
        System.out.println((int) 'z');
        System.out.println((int) '{');

        둘만의암호 main = new 둘만의암호();
        System.out.println(main.solution("aukks", "wbqd", 5));
    }
}
