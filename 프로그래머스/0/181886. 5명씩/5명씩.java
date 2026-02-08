import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        ArrayList<String> l = new ArrayList<>();
        
        for(int j=0;j<names.length;j+=5) {
            l.add(names[j]);
        }
        String[] s = new String[l.size()];
        
        for(int i = 0;i<l.size();i++) {
            s[i] = l.get(i);
        }
        
        
        return s;
    }
}