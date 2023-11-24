package Level_1;

public class _3진법뒤집기 {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder(Integer.toString(n, 3));
        sb.reverse();
        return Integer.parseInt(sb.toString(), 3);
    }

    public static void main(String[] args) {
        int n = 45;
        String a = "";
        while(n > 0){
            a = (n % 3) + a;
            n /= 3;
        }
        System.out.println(a);
    }
}
