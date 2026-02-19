import java.util.*;

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if (!(s.length()==4 || s.length()==6)) {
            answer = false;
        }
        
        char[] c = s.toCharArray();
        
        for(char i : c) {
            if(!(i>='0' && i<='9')){
                answer = false;
            }
        }
        return answer;
    }
}