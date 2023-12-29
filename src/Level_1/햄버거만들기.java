package Level_1;

import java.util.Stack;

public class 햄버거만들기 {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int material : ingredient) {
            if (stack.size() < 3) {
                stack.push(material);
                continue;
            }

            int top = material;
            int meet = stack.pop();
            int vegetable = stack.pop();
            int bottom = stack.pop();

            if (top != 1 || meet != 3 || vegetable != 2 || bottom != 1) {
                stack.push(bottom);
                stack.push(vegetable);
                stack.push(meet);
                stack.push(top);
                continue;
            }

            answer++;
        }

        return answer;
    }
    public int fail(int[] ingredient) {
        int answer = 0;
        String hamburger = "";
        StringBuilder sb = new StringBuilder();

        for (int material : ingredient) {
            sb.append(material);
        }
        hamburger = sb.toString();

        while (hamburger.contains("1231")) {
            hamburger = hamburger.replaceFirst("1231", "");
            answer++;
        }

        return answer;
    }


    public static void main(String[] args) {
        햄버거만들기 main = new 햄버거만들기();
//        System.out.println(main.solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1}));
        System.out.println(main.solution(new int[]{1, 1, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1}));
    }
}
