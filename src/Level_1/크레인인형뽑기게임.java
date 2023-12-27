package Level_1;

import java.util.Stack;

public class 크레인인형뽑기게임 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int[][] clonedBoard = board.clone(); // 복사한 보드
        int N = clonedBoard.length; // 보드의 크기
        Stack<Integer> stack = new Stack<>(); // 인형 담을 바구니

        for (int i = 0; i < moves.length; i++) {
            int location = moves[i] - 1; // 크레인 위치

            for (int j = 0; j < N; j++) {
                int doll = clonedBoard[j][location]; // 인형 숫자
                if (doll == 0) continue;

                if (stack.isEmpty() || stack.peek() != doll) { // 바구니에 인형이 없는 경우, 서로 다른 인형이 쌓인 경우
                    stack.push(doll);
                } else if (stack.peek() == doll) { // 같은 인형이 쌓인 경우
                    stack.pop();
                    answer++;
                }
                clonedBoard[j][location] = 0;
                break;
            }
        }

        return answer * 2;
    }

    public static void main(String[] args) {
        크레인인형뽑기게임 main = new 크레인인형뽑기게임();
        System.out.println();
    }
}
