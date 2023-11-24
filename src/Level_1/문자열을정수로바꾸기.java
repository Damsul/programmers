package Level_1;

import java.util.Optional;

public class 문자열을정수로바꾸기 {

    public static int solution(String s) {
        boolean negative = false;

        // s를 숫자로 변환해서 담을 변수
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 && s.charAt(i) == '-') {
                negative = true;
                continue;
            } else if (i == 0 && s.charAt(i) == '+') {
                continue;
            }
            num = num * 10 + (s.charAt(i) - '0');
        }

        return negative ? -1 * num : num;
    }

    public static void main(String[] args) {
//        System.out.println(solution("1234"));
//        System.out.println(solution("-1234"));
//        System.out.println(solution("12345"));
//        System.out.println(solution("11234"));
        String value = "Hello, World!";

        // 데이터를 가지고 있는 Optional을 만들어 봅시다.
        Optional<String> optionalValue = Optional.of(value);

        // 데이터를 가지고 있는지 판단한 뒤
        if (optionalValue.isPresent()) {
            // 데이터가 있으면 실행하는 코드
            System.out.println("Value is present: " + optionalValue.get());
        } else {
            // 데이터가 없으면 실행하는 코드
            System.out.println("Value is not present");
        }

        // 데이터를 가지지 않는 Optional을 만들어 봅시다.
        Optional<String> optionalNull = Optional.ofNullable(null);

        // 데이터를 가지고 있는지 판단한 뒤
        if (optionalNull.isPresent()) {
            // 데이터가 있으면 실행하는 코드
            System.out.println("Value is present: " + optionalNull.get());
        } else {
            // 데이터가 없으면 실행하는 코드
            System.out.println("Value is not present");
        }

        // orElse()를 사용하면 기본값을 전달하는 방식으로 활용할 수 있습니다.
        String result = optionalNull.orElse("Default Value");
        System.out.println("Value (orElse): " + result);

        optionalValue = Optional.ofNullable(null);
        System.out.println(optionalValue);
    }
}
