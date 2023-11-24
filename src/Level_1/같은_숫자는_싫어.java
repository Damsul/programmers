package Level_1;

import java.util.Stack;

public class 같은_숫자는_싫어 {
    public int[] solution(int []arr) {
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (st.peek() == arr[i]) continue;
            st.push(arr[i]);
        }

        int[] ans = new int[st.size()];
        for (int i = st.size() -1; i >= 0; i--) {
            ans[i] = st.pop();
        }

        return ans;
    }
}
