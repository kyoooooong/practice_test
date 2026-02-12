import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> l = new ArrayList<>();

        for (int i : arr) {
            for (int j = 0; j < i; j++) {
                l.add(i);
            }
        }

        int[] answer = new int[l.size()];
        for (int i = 0; i < l.size(); i++) {
            answer[i] = l.get(i);
        }

        return answer;
    }
}
