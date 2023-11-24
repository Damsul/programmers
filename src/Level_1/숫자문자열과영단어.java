package Level_1;

public class 숫자문자열과영단어 {
    public int solution(String s) {
        if (s.contains("zero")) s = s.replaceAll("zero", "0");
        if (s.contains("one")) s = s.replaceAll("one", "1");
        if (s.contains("two")) s = s.replaceAll("two", "2");
        if (s.contains("three")) s = s.replaceAll("three", "3");
        if (s.contains("four")) s = s.replaceAll("four", "4");
        if (s.contains("five")) s = s.replaceAll("five", "5");
        if (s.contains("six")) s = s.replaceAll("six", "6");
        if (s.contains("seven")) s = s.replaceAll("seven", "7");
        if (s.contains("eight")) s = s.replaceAll("eight", "8");
        if (s.contains("nine")) s = s.replaceAll("nine", "9");

        int answer = Integer.parseInt(s);
        return answer;

        /*String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < 10; i++) {
            s = s.replaceAll(arr[i], Integer.toString(i));
        }
        return Integer.parseInt(s);*/
    }

    public static void main(String[] args) {
        숫자문자열과영단어 main = new 숫자문자열과영단어();
        System.out.println(main.solution("one4seveneight"));
        System.out.println(main.solution("23four5six7"));
        System.out.println(main.solution("2three45sixseven"));
        System.out.println(main.solution("123"));
    }
}
