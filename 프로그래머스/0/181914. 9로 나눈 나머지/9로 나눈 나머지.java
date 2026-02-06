class Solution {
    public int solution(String number) {
        int a = 0;
        for ( int i=0;i<number.length();i++) {
            a += number.charAt(i)-'0';
        }
        
        return a%9;
    }
}