import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0;i<commands.length;i++) {
            int ii = commands[i][0];
            int j = commands[i][1];
            int k = commands[i][2];
            
            int[] a = Arrays.copyOfRange(array,ii-1,j);
            Arrays.sort(a);
            
            int result = a[k-1];
            answer[i] = result;
        }
        return answer;
    }
}