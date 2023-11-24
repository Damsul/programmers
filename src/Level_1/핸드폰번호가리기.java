package Level_1;

import java.util.Arrays;

public class 핸드폰번호가리기 {
    public String solution(String phone_number) {
        String answer = "";

        char[] phoneNumberArr = phone_number.toCharArray();

        for (int i = 0; i < phoneNumberArr.length - 4; i++) {
            phoneNumberArr[i] = '*';
        }
        answer = String.valueOf(phoneNumberArr);
        return answer;
    }
}
