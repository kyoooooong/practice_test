class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int total = 0;
        String s = String.valueOf(x);
        
        char[] c = s.toCharArray();
        
        for(char i : c) {
            total += i- '0';
        }
        
        if(x%total ==0) {
            answer = true;
        }
        return answer;
    }
}