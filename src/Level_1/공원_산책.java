package Level_1;

public class 공원_산책 {
    public static char[][] board;

    public int[] solution(String[] park, String[] routes) {

        board = new char[park.length][park[0].length()];
        int x = 0;
        int y = 0;
        for (int i = 0; i < board.length; i++) {
            // 2차 배열 만들기
            board[i] = park[i].toCharArray();
            // 시작점 찾기
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'S') {
                    x = i;
                    y = j;
                }
            }
        }

        for (int i = 0; i < routes.length; i++) {
            char op = routes[i].charAt(0); // 이동 방향
            int n = Integer.parseInt(String.valueOf(routes[i].charAt(2))); // 이동 거리
            boolean isOk = true;

            if (op == 'E') {
                int ny = y + n;
                // 범위 확인
                if (ny >= board[0].length) continue;
                // 장애물 확인
                for (int j = y + 1; j <= ny; j++) {
                    if (board[x][j] == 'X') {
                        isOk = false;
                        break;
                    }
                }
                if (!isOk) continue;
                // 이동
                y = ny;
            } else if (op == 'W') {
                int ny = y - n;
                // 범위 확인
                if (ny < 0) continue;
                // 장애물 확인
                for (int j = ny; j < y; j++) {
                    if (board[x][j] == 'X') {
                        isOk = false;
                        break;
                    }
                }
                if (!isOk) continue;
                // 이동
                y = ny;
            } else if (op == 'S') {
                int nx = x + n;
                if (nx >= board.length) continue;
                for (int j = x + 1; j <= nx; j++) {
                    if (board[j][y] == 'X') {
                        isOk = false;
                        break;
                    }
                }
                if (!isOk) continue;
                x = nx;
            } else if (op == 'N') {
                int nx = x - n;
                if (nx < 0) continue;
                for (int j = nx; j < x; j++) {
                    if (board[j][y] == 'X') {
                        isOk = false;
                        break;
                    }
                }
                if (!isOk) continue;
                x = nx;
            }
        }

        return new int[]{x, y};
    }

}

