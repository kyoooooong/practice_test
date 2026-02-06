class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        
        for (int i=0;i<parts.length;i++) {
            int s = parts[i][0];
            int e = parts[i][1];
            
            String ss = my_strings[i];
            
            answer += ss.substring(s,e+1);
        }
        return answer;
    }
}