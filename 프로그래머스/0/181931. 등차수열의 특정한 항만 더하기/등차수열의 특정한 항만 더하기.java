class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        int c = a;
        
        for ( boolean b : included) {
            if ( b == true) {
                answer += c;
            }
            
            c += d;
        }
        return answer;
    }
}