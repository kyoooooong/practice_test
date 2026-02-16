import java.util.*;

class Solution {
    public int solution(int[] p, int location) {
        int answer = 0;
        
        Queue<int[]> q = new LinkedList<>();
        
        for(int i=0;i<p.length;i++) {
            q.add(new int[]{p[i],i});
        }
        
        int count = 0;
        while(! q.isEmpty()) {
            int[] cur = q.poll();
            
            boolean b = false;
            
            for(int[] j:q) {
                if (j[0] > cur[0]) {
                    b = true;
                    break;
                }
            }
            
            if (b) {
                q.add(cur);
            } else {
                count ++;
                if ( cur [1] == location) {
                    return count;
                }
            }
        }
        return 0;
    }
}