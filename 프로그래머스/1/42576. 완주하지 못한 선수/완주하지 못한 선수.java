import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        
        HashMap<String, Integer> m = new HashMap<>();
        
        for(String s : participant) {
            m.put(s, m.getOrDefault(s, 0)+1);
        }
        
        for(String c: completion) {
            m.put(c, m.get(c)-1);
        }
        
        for(String a : m.keySet()) {
            if(m.get(a) == 1) {
                return a;
            }
        }
        return "";
    }
}