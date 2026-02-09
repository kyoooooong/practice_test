class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String s = myString.toLowerCase();
        String p = pat.toLowerCase();
        
        if(s.contains(p)) {
            answer = 1;
        }
        return answer;
    }
}