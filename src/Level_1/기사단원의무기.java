package Level_1;

public class 기사단원의무기 {
    public int solution(int number, int limit, int power) {
        int answer = 1;

        // 1 ~ number 까지 순회
        for (int i = 2; i <= number; i++) {
            // 약수구하기
            int att = numOfDivision(i);
            // 공격력 정하기
            if (att > limit) att = power;
            // 철의 무게로 바꾸기
            answer += att;
        }

        return answer;
    }

    public int numOfDivision(int n) {
        int cnt = 0;
        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0) cnt += 2;
        }
        if (Math.sqrt(n) % 1 == 0) cnt++;
        return cnt;
    }
}
