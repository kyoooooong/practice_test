import java.util.*;

class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        ArrayList<String> l = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i += m) {
            String s = my_string.substring(i, i + m);
            l.add(s);
        }

        for (String j : l) {
            answer += j.charAt(c - 1);
        }

        return answer;
    }
}
