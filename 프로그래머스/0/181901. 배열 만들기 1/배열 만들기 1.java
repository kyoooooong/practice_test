import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
        ArrayList<Integer> l = new ArrayList<>();
        
        for(int i=1;i<n+1;i++) {
            if(i%k==0) {
                l.add(i);
            }
        }
        
        
        int[] answer = new int[l.size()];
        for (int j = 0; j < l.size(); j++) {
            answer[j] = l.get(j);
        }

        return answer;
    }
}