class Solution {
    public int solution(String[] strArr) {
        int[] answer = new int[31];
        for(String s:strArr) {
            int l = s.length();
            
            answer[l] += 1;
        }
        int max = 0;
        for(int i:answer) {
            if(i>max) {
                max = i;
            }
        }
        return max;
    }
}