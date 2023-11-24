package Level_1;

import java.util.*;

public class 모의고사 {
    public int[] solution(int[] answers) {
        int[] arr = new int[]{student1(answers), student2(answers), student3(answers)};

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }

        int max = pq.poll();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) list.add(i + 1);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public int student1(int[] answers) {
        int cnt = 0;
        int marking = 1;
        for (int answer : answers) {
            if (answer == marking++) cnt++;
            if (marking > 5) marking = 1;
        }
        return cnt;
    }

    public int student2(int[] answers) {
        int cnt = 0;
        int[] marking = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int num = 0;
        for (int answer : answers) {
            if (answer == marking[num++]) cnt++;
            if (num >= marking.length) num = 0;
        }
        return cnt;
    }

    public int student3(int[] answers) {
        int cnt = 0;
        int[] marking = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int num = 0;
        for (int answer : answers) {
            if (answer == marking[num++]) cnt++;
            if (num >= marking.length) num = 0;
        }
        return cnt;
    }

    public static void main(String[] args) {
        모의고사 main = new 모의고사();
        System.out.println(main.student1(new int[]{1, 2, 3, 4, 5, 1, 2, 3}));
        System.out.println(main.student2(new int[]{1, 3, 2, 4, 2}));
    }
}
