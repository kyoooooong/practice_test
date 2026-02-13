import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        
        ArrayList<int[]> l = new ArrayList<>();
        
        for(int i=0;i<attendance.length;i++) {
            if(attendance[i]) {
                l.add(new int[]{rank[i],i});
            }
        }
        
        l.sort(Comparator.comparingInt(a->a[0]));
        
        int a = l.get(0)[1];
        
        int b = l.get(1)[1];
        
        int c = l.get(2)[1];
        return 10000*a + 100*b +c;
    }
}