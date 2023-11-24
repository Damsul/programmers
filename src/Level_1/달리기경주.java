package Level_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 달리기경주 {

    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        String[] result = test(players, callings);
        System.out.println(Arrays.toString(result));
    }

    public static String[] solution(String[] players, String[] callings) {
        // 선수 등수 관리 map
        Map<String, Integer> map = new HashMap<>();
        // 현재 등수 설정
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        // 추월 선수 callPlayer 부름
        for (String callPlayer : callings) {
            // 추월 선수 현재 등수
            int rank = map.get(callPlayer);
            // 추월 당할 선수
            String player = players[rank - 1];

            // 등수 변경
            players[rank] = player;
            players[rank - 1] = callPlayer;
            map.put(player, rank);
            map.put(callPlayer, rank - 1);
        }

        // 결과 등수
        return players;
    }

    public String[] test1(String[] players, String[] callings) {
        String[] answer = {};
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for (int i = 0; i < callings.length; i++) {
            String callPlayer = callings[i]; // 추월 선수
            // 추월 선수 현재 등수
            int rank = map.get(callPlayer);
            // 추월 당할 선수
            String player = "";
            for (String key : map.keySet()) {
                if (rank - 1 == map.get(key)) {
                    player = key;
                }
            }
            // 등수 변경
            map.put(player, rank);
            map.put(callPlayer, rank - 1);
        }

        for (String player : map.keySet()) {
            int rank = map.get(player);
            players[rank] = player;
        }
        answer = players;
        return answer;
    }

    public static String[] test(String[] players, String[] callings) {
        for (int i = 0; i < callings.length; i++) {
            String callPlayer = callings[i]; // 추월 선수
            for (int j = 0; j < players.length; j++) {
                // 추월 선수 현재 등수 구하기
                if (callPlayer.equals(players[j])) {
                    // 앞 선수와 등수 변경
                    String tmp = players[j];
                    players[j] = players[j - 1];
                    players[j - 1] = tmp;
                }
            }
        }
        return players;
    }
}
