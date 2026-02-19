class Solution {
    public int solution(int n) {
        
        StringBuilder sb = new StringBuilder();
        
        // 1. 3진법 뒤집힌 상태로 저장
        while (n > 0) {
            sb.append(n % 3);
            n /= 3;
        }
        
        // 2. 3진법 문자열을 10진법으로 변환
        return Integer.parseInt(sb.toString(), 3);
    }
}