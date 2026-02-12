import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] l = new int[k];
        Arrays.fill(l,-1);
        HashSet<Integer>h=new HashSet<>();
        int idx = 0;
        for(int i:arr) {
            if(!(h.contains(i))) {
                h.add(i);
                l[idx] = i;
                idx ++;
            }
            
            if(idx == k) {
                break;
            }
        }
        
        return l;
    }
}