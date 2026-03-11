class Solution {
    public int solution(int n) {
        
        int i = (int)Math.sqrt(n);
        int answer = 2;
        if(i*i == n) {
            answer = 1;
        }
        return answer;
    }
}