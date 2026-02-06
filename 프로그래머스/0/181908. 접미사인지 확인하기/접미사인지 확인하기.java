class Solution {
    public int solution(String s, String is_suffix) {
        int answer = 0;
        for(int i=0;i<s.length();i++) {
            String ss = s.substring(i);
            
            if (ss.equals(is_suffix)) {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}