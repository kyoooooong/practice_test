import java.util.*;

class Solution {
    public int[] solution(int[] answers) {

        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] a3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] s = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (a1[i % a1.length] == answers[i]) s[0]++;
            if (a2[i % a2.length] == answers[i]) s[1]++;
            if (a3[i % a3.length] == answers[i]) s[2]++;
        }

        int max = Math.max(s[0], Math.max(s[1], s[2]));

        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (s[i] == max) res.add(i + 1);
        }

        int[] answer = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            answer[i] = res.get(i);
        }

        return answer;
    }
}
