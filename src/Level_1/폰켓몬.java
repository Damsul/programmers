package Level_1;

import java.util.HashSet;
import java.util.Set;

public class 폰켓몬 {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        return Math.min(nums.length / 2, set.size());
    }
}
