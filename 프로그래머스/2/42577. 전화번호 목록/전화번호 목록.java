import java.util.*;

class Solution {
    public boolean solution(String[] arr) {
        boolean answer = true;
        Arrays.sort(arr);
        
        for(int i=1;i<arr.length;i++) {
            if(arr[i].startsWith(arr[i-1])) {
                answer = false;
                break;
            } 
        }
        return answer;
    }
}