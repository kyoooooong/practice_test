class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        char[] c = num_str.toCharArray();
        
        for(char i:c) {
            answer += i -'0';
        }
        return answer;
    }
}