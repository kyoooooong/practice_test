import java.util.Arrays;


class Solution {
    public String[] solution(String s) {
        String[] answer = new String[s.length()];
        
        for(int i=0;i<s.length();i++) {
            answer[i] = s.substring(i);
        }
        
        Arrays.sort(answer);
        return answer;
    }
}