package Level_2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class 타겟넘버 {
    public int solution(int[] numbers, int target) {
        // int cnt = bfs(numbers, target);
        // int cnt = dfs(numbers, target);
        int cnt = recursive(numbers, target, 0, 0);
        return cnt;
    }

    public int recursive(int[] numbers, int target, int idx, int sum) {
        if (idx == numbers.length) {
            if (target == sum) {
                return 1;
            }
            return 0;
        }

        return recursive(numbers, target, idx + 1, sum + numbers[idx])
                + recursive(numbers, target, idx + 1, sum - numbers[idx]);
    }

    public int dfs(int[] numbers, int target) {
        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(0, numbers[0]));
        stack.push(new Pair(0, numbers[0] * -1));
        int cnt = 0;

        while (!stack.isEmpty()) {
            Pair cur = stack.pop();

            if (cur.idx == numbers.length - 1) {
                if (cur.sum == target) cnt++;
                continue;
            }

            stack.push(new Pair(cur.idx + 1, cur.sum + numbers[cur.idx + 1]));
            stack.push(new Pair(cur.idx + 1, cur.sum - numbers[cur.idx + 1]));
        }

        return cnt;
    }

    public int bfs(int[] numbers, int target) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0, numbers[0]));
        q.add(new Pair(0, numbers[0] * -1));
        int cnt = 0;

        while (!q.isEmpty()) {
            Pair cur = q.poll();

            if (cur.idx == numbers.length - 1) {
                if (cur.sum == target) cnt++;
                continue;
            }

            q.add(new Pair(cur.idx + 1, cur.sum + numbers[cur.idx + 1]));
            q.add(new Pair(cur.idx + 1, cur.sum - numbers[cur.idx + 1]));
        }

        return cnt;
    }

    class Pair {
        int idx;
        int sum;

        public Pair(int idx, int sum) {
            this.idx = idx;
            this.sum = sum;
        }
    }
}
