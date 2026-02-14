import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        HashSet<Integer> h = new HashSet<>();
        
        for(int i:delete_list) {
            h.add(i);
        }
        ArrayList<Integer> l = new ArrayList<>();
        for(int j:arr) {
            if(!h.contains(j)) {
                l.add(j);
            }
        }
        
        int[] a = new int[l.size()];
        
        for(int p=0;p<l.size();p++) {
            a[p] = l.get(p);
        }
        return a;
    }
}