package Level_1;

public class 하샤드수 {
    public boolean solution(int x) {
        boolean answer = true;

        int sum = 0;
        int num = x;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return x % sum == 0;
    }
}
