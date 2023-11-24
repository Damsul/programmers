package Level_1;

public class 자연수뒤집어배열로만들기 {
    public int[] solution(long n) {
        int size = String.valueOf(n).length();
        int[] answer = new int[size];

        for (int i = 0; i < size; i++) {
            answer[i] = (int)(n % 10);
            n /= 10;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(String.valueOf(12345));
    }
}
