import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = {};
        
        int s = 0;
        int e = arr.length -1;
        for(int i=0;i<query.length;i++){
            if(i%2==0) {
                e = s+query[i];
            } else {
                s = s+query[i];
            }
        }
        return Arrays.copyOfRange(arr, s,e+1);
    }
}