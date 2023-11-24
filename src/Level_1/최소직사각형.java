package Level_1;

public class 최소직사각형 {
    public int solution(int[][] sizes) {
        int row = 0;
        int col = 0;

        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }

            row = Math.max(row, sizes[i][0]);
            col = Math.max(col, sizes[i][1]);
        }

        return row * col;
    }
}
