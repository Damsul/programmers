package Level_1;

public class 옹알이 {
    public int solution(String[] babbling) {
        int answer = 0;

        for (int i = 0; i < babbling.length; i++) {
            if (babbling[i].contains("ayaaya")
                    || babbling[i].contains("yeye")
                    || babbling[i].contains("woowoo")
                    || babbling[i].contains("mama")) {
                continue;
            }

            babbling[i] = babbling[i].replaceAll("aya", " ");
            babbling[i] = babbling[i].replaceAll("ye", " ");
            babbling[i] = babbling[i].replaceAll("woo", " ");
            babbling[i] = babbling[i].replaceAll("ma", " ");
            babbling[i] = babbling[i].replaceAll(" ", "");
            if (babbling[i].equals("")) answer++;
        }

        for (String str : babbling) {
            if (str.contains("ayaaya")
                    || str.contains("yeye")
                    || str.contains("woowoo")
                    || str.contains("mama")) {
                continue;
            }

            str = str.replaceAll("aya", " ");
            str = str.replaceAll("ye", " ");
            str = str.replaceAll("woo", " ");
            str = str.replaceAll("ma", " ");
            str = str.replaceAll(" ", "");
            if (str.equals("")) answer++;
        }

        return answer;
    }

    public int mySolution(String[] babbling) {
        int answer = 0;
        String[] tmp = new String[babbling.length];

        int idx = 0;
        for (String str : babbling) {
            str = str.replaceAll("aya", "0");
            str = str.replaceAll("ye", "1");
            str = str.replaceAll("woo", "2");
            str = str.replaceAll("ma", "3");
            tmp[idx++] = str;
        }

        for (int i = 0; i < tmp.length; i++) {
            boolean flag = true;
            String str = tmp[i];
            for (int j = 0; j < str.length() - 1; j++) {
                if (str.charAt(j) == str.charAt(j + 1)) {
                    flag = false;
                    break;
                }
            }
            for (int j = 0; j < str.length(); j++) {
                if (!Character.isDigit(str.charAt(j))) {
                    flag = false;
                    break;
                }
            }
            if (flag) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        옹알이 main = new 옹알이();
//        System.out.println(main.mySolution(new String[]{"aya", "yee", "u", "maa"}));
//        System.out.println(main.mySolution(new String[]{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"}));
        System.out.println(main.solution(new String[]{"aya", "yee", "u", "maa"}));
        System.out.println(main.solution(new String[]{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"}));
    }
}
