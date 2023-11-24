package Level_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class 최솟값만들기 {
    public int solution(int []A, int []B) {
        int answer = 0;

        Arrays.sort(A);

        Integer[] wrapperB = new Integer[B.length];
        for (int i = 0; i < B.length; i++) {
            wrapperB[i] = B[i];
        }
        Arrays.sort(wrapperB, Collections.reverseOrder());
        System.out.println(Arrays.toString(wrapperB));

        for (int i = 0; i < B.length; i++) {
            answer += A[i] * wrapperB[i];
        }

        return answer;
    }
}
