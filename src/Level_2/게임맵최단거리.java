package Level_2;

import java.util.LinkedList;
import java.util.Queue;

public class 게임맵최단거리 {
    // 동서남북으로 움직이기 위해 사용할 배열 dx, dy
    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public int solution(int[][] maps) {
        int n = maps.length;    // 행, x
        int m = maps[0].length; // 열, y

        // 방문할 위치를 담는 Queue q 선언
        Queue<Pair> q = new LinkedList<>();
        // 시작 위치 (0, 0) add
        q.add(new Pair(0, 0));

        // q가 빌 때까지
        while (!q.isEmpty()) {
            // 현재 위치 poll
            Pair cur = q.poll();

            // 현재 위치에서 동서남북으로 이동
            for (int dir = 0; dir < 4; dir++) {
                int nx = cur.x + dx[dir];
                int ny = cur.y + dy[dir];

                // 이동할 위치가 범위 밖이라면 제외
                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                // 이동할 위치가 이미 방문한 곳이거나 벽이면 제외
                if (maps[nx][ny] > 1 || maps[nx][ny] == 0) continue;

                // 위 조건에 해당하지 않으면 이동
                // 다음 이동할 위치의 값을 (현재 위치의 값 + 1)으로 주고 이동 거리를 계산할 수 있다.
                // 이렇게 함으로써 방문 표시도 같이 할 수 있다는 장점이 있다.
                maps[nx][ny] = maps[cur.x][cur.y] + 1;
                // 다음 방문 위치 add
                q.add(new Pair(nx, ny));
            }
        }
        // 반복문 끝이 난 이유
        // 1. 상대팀 진영에 도착한 경우
        // 2. 상대팀 진영이 벽으로 막혀있어 더 이상 이동할 수 없는 경우

        // 상대팀 진영에 도착한 경우 상대 진영까지 이동한 칸 수(시작 위치 포함)를 리턴하고
        // 그렇지 않으면 -1을 리턴한다.
        return maps[n - 1][m - 1] > 1 ? maps[n - 1][m - 1] : -1;
    }

    public int failSolution(int[][] maps) {
        int n = maps.length;    // 행, x
        int m = maps[0].length; // 열, y

        boolean[][] visited = new boolean[n][m];
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0, 0));

        while (!q.isEmpty()) {
            Pair cur = q.poll();
            visited[cur.x][cur.y] = true;

            for (int dir = 0; dir < 4; dir++) {
                int nx = cur.x + dx[dir];
                int ny = cur.y + dy[dir];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                if (visited[nx][ny] || maps[nx][ny] == 0) continue;

                maps[nx][ny] = maps[cur.x][cur.y] + 1;
                q.add(new Pair(nx, ny));
            }
        }

        return maps[n - 1][m - 1] > 1 ? maps[n - 1][m - 1] : -1;
    }

    // 위치 표시 객체 Pair
    class Pair {
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}