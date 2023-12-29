package Level_1;

public class 이웃한칸 {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int n = board.length; // 보드의 길이
        int[] dh = {0, 1, 0, -1}; // 동 남 서 북
        int[] dw = {1, 0, -1, 0};

        for (int div = 0; div < 4; div++) {
            int nh = h + dh[div];
            int nw = w + dw[div];

            if (nh < 0 || nw < 0 || nh >= n || nw >= n) continue; // 보드의 범위에 벗어나는 경우 건너뛰기
            if (board[h][w].equals(board[nh][nw])) answer++;
        }

        return answer;
    }
}
