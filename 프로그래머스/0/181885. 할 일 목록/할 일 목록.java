import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> l = new ArrayList<>();
        
        for(int i=0;i<finished.length;i++) {
            if(finished[i]==false) {
                l.add(todo_list[i]);
            }
        }
        return l.toArray(new String[0]);
    }
}