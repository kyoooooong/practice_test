import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        
        ArrayList<Integer> l = new ArrayList<>();
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        
        int start = 0;
        int end = 0;
        int step = 1;
        if ( n == 1) {
            end = b;
            
        } else if (n==2) {
            start = a;
            end = num_list.length-1;
        }else if (n==3) {
            start = a;
            end = b;
        }else if (n==4) {
            start = a;
            end = b;
            step = c;
        }
        
        
        for(int i=start;i<end+1;i+=step) {
            l.add(num_list[i]);
        }
        
        int[] ii = new int[l.size()];
        
        for(int j=0;j<l.size();j++) {
            ii[j] = l.get(j);
        }
        return ii;
    }
}