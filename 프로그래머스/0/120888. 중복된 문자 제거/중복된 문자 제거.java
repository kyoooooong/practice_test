import java.util.*;

class Solution {
    public String solution(String my_string) {
        String[] arr = my_string.split("");
        Set<String> s = new LinkedHashSet<>();
        
        for(String i : arr) {
            s.add(i);
        }
        
        return String.join("", s);
    }
}