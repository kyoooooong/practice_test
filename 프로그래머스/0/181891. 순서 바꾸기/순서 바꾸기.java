import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        
        int[] a1 = Arrays.copyOfRange(num_list,0,n);
        int[] a2 = Arrays.copyOfRange(num_list,n,num_list.length);
        
        int idx = 0;

        for (int x : a2) answer[idx++] = x;
        for (int x : a1) answer[idx++] = x;

        return answer;
    }
}