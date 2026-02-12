import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> l = new ArrayList<>();
        int idx = 0;

        while (idx < arr.length) {
            if (l.size() == 0) {
                l.add(arr[idx]);
            } else if (l.get(l.size() - 1) == arr[idx]) {
                l.remove(l.size() - 1);
            } else {
                l.add(arr[idx]);
            }
            idx++;
        }

        if (l.size() == 0) return new int[]{-1};

        int[] answer = new int[l.size()];
        for (int i = 0; i < l.size(); i++) {
            answer[i] = l.get(i);
        }
        return answer;
    }
}
