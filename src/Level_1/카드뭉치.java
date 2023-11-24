package Level_1;

public class 카드뭉치 {
    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        int idx1 = 0;
        int idx2 = 0;
        // goal 에서 한 단어씩 가져오기
        for (String word : goal) {
            // 비교하기, card1, card2 중에 한 단어씩 가져오기
            if (idx1 < cards1.length && word.equals(cards1[idx1])) idx1++;
            else if (idx2 < cards2.length && word.equals(cards2[idx2])) idx2++;
            // 중간에 비교 대상 없으면 "NO"
            else return "No";

        }
        // goal 완성하면 "YES"
        return "Yes";
    }

    public static void main(String[] args) {
        System.out.println(solution(
                new String[]{"i", "drink", "water"},
                new String[]{"want", "to"},
                new String[]{"i", "want", "to", "drink", "water"}));
    }

}
