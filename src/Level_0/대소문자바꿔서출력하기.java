package Level_0;

import java.util.Arrays;
import java.util.Scanner;

public class 대소문자바꿔서출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if ('a' <= chars[i] && chars[i] <= 'z') {
                chars[i] = (char) (chars[i] - 32);
            } else {
                chars[i] = (char) (chars[i] + 32);
            }
        }
        System.out.println(String.valueOf(chars));
//        System.out.println((int)'a');
//        System.out.println((int)'A');
    }
}
