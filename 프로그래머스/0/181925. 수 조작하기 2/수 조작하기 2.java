class Solution {
    public String solution(int[] numlog) {
        String answer = "";
        
        for(int i=1;i<numlog.length;i++) {
            if(numlog[i] == numlog[i-1]+1) {
                answer += "w";
            } else if(numlog[i] == numlog[i-1]-1) {
                answer += "s";
            } else if(numlog[i] == numlog[i-1]+10) {
                answer += "d";
            } else if(numlog[i] == numlog[i-1]-10) {
                answer += "a";
            }
        }
        return answer;
    }
}