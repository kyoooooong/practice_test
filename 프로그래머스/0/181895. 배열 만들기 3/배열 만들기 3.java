import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] i) {
        ArrayList<Integer> l = new ArrayList<>();
        
        int a = i[0][0];
        int b = i[0][1];
        int c = i[1][0];
        int d = i[1][1];
        
        for(int ii=a;ii<b+1;ii++) {
            l.add(arr[ii]);
        }
        
        for(int ij=c;ij<d+1;ij++) {
            l.add(arr[ij]);
        }
        
        int[] j = new int[l.size()];
        
        for(int k=0;k<l.size();k++) {
            j[k] = l.get(k);
        }
        return j;
    }
}