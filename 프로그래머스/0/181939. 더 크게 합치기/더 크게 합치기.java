class Solution {
    public int solution(int a, int b) {
        String s = "" +a+b;
        String s2 = "" +b+a;
        
        if(s.compareTo(s2) >= 0) {
            return Integer.parseInt(s);
        }
        return Integer.parseInt(s2);
    }
}